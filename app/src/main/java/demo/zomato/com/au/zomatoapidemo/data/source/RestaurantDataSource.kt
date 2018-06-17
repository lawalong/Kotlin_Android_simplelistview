package demo.zomato.com.au.zomatoapidemo.data.source

import demo.zomato.com.au.zomatoapidemo.data.HttpResult
import demo.zomato.com.au.zomatoapidemo.data.Restaurant
import io.reactivex.Observable

interface RestaurantDataSource {



    fun getRestaurants(): Observable<HttpResult>

    fun getRestaurant(restaurantId: String): Observable<Restaurant>

    fun refreshRestaurants()

}