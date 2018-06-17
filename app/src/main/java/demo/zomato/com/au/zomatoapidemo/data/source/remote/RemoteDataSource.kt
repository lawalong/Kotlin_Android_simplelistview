package demo.zomato.com.au.zomatoapidemo.data.source.remote

import demo.zomato.com.au.zomatoapidemo.api.RetrofitClient
import demo.zomato.com.au.zomatoapidemo.api.ZomatoService
import demo.zomato.com.au.zomatoapidemo.data.HttpResult
import demo.zomato.com.au.zomatoapidemo.data.Restaurant
import demo.zomato.com.au.zomatoapidemo.data.source.RestaurantDataSource
import io.reactivex.Observable
import okhttp3.FormBody

class RemoteDataSource(val retrofitClient: RetrofitClient) : RestaurantDataSource {

    override fun getRestaurants(): Observable<HttpResult> {
        return retrofitClient.service.getRestaurants()
    }

    override fun getRestaurant(restaurantId: String): Observable<Restaurant> {
        return retrofitClient.service.getRestaurant()
    }


    override fun refreshRestaurants() {

    }
}