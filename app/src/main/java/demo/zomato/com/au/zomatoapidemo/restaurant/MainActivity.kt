package demo.zomato.com.au.zomatoapidemo.restaurant

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import demo.zomato.com.au.zomatoapidemo.R
import demo.zomato.com.au.zomatoapidemo.api.RetrofitClient
import demo.zomato.com.au.zomatoapidemo.data.source.RestaurantRepository
import demo.zomato.com.au.zomatoapidemo.data.source.local.LocalDataSource
import demo.zomato.com.au.zomatoapidemo.data.source.remote.RemoteDataSource
import demo.zomato.com.au.zomatoapidemo.ext.replaceFragmentInActivity

class MainActivity : AppCompatActivity() {


    private lateinit var restaurantPresenter: RestaurantPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val restaurantFragment = supportFragmentManager.findFragmentById(R.id.contentFrame)
                as RestaurantFragment? ?: RestaurantFragment.newInstance().also {
            replaceFragmentInActivity(it, R.id.contentFrame)
        }

        val retrofitClient = RetrofitClient.instance
        retrofitClient.init()
        restaurantPresenter = RestaurantPresenter(RestaurantRepository(RemoteDataSource(retrofitClient), LocalDataSource()), restaurantFragment)
    }
}
