package demo.zomato.com.au.zomatoapidemo.api

import demo.zomato.com.au.zomatoapidemo.data.HttpResult
import demo.zomato.com.au.zomatoapidemo.data.Restaurant
import io.reactivex.Observable
import retrofit2.http.*


interface ZomatoService {
    @Headers("Content-Type: application/x-www-form-urlencoded", "user-key:c3aac1ba0d306c76e9ae1338f5eb9c1d")
    @POST("search?entity_id=98284&entity_type=subzone&count=10")
    fun getRestaurants(): Observable<HttpResult>

    fun getRestaurant(): Observable<Restaurant>
}