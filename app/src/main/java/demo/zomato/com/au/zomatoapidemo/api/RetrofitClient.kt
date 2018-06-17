package demo.zomato.com.au.zomatoapidemo.api

import demo.zomato.com.au.zomatoapidemo.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor() {

    val user_key: String = "c3aac1ba0d306c76e9ae1338f5eb9c1d"
    val entity_id: String = "98284"
    val entity_type:String ="subzone"

    lateinit var service: ZomatoService

    companion object {
        val instance = RetrofitClient()
    }

    fun init() {
        val okHttpClient = OkHttpClient().newBuilder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(
                        if (BuildConfig.DEBUG)
                            HttpLoggingInterceptor.Level.BODY
                        else
                            HttpLoggingInterceptor.Level.NONE))
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl("https://developers.zomato.com/api/v2.1/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()

        service = retrofit.create(ZomatoService::class.java)
    }
}