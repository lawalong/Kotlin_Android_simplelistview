package demo.zomato.com.au.zomatoapidemo.data.source.local

import demo.zomato.com.au.zomatoapidemo.data.HttpResult
import demo.zomato.com.au.zomatoapidemo.data.Location
import demo.zomato.com.au.zomatoapidemo.data.Restaurant
import demo.zomato.com.au.zomatoapidemo.data.source.RestaurantDataSource
import io.reactivex.Observable

open class LocalDataSource : RestaurantDataSource {
    override fun getRestaurants(): Observable<HttpResult> {

        return Observable.just(HttpResult(0, 0, 0, ArrayList()))
    }

    override fun getRestaurant(restaurantId: String): Observable<Restaurant> {
        return Observable.just(Restaurant("", Location(), ""))
    }

    override fun refreshRestaurants() {
    }
}