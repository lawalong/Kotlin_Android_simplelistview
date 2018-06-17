package demo.zomato.com.au.zomatoapidemo.data.source

import demo.zomato.com.au.zomatoapidemo.data.RestaurantObj
import demo.zomato.com.au.zomatoapidemo.data.source.remote.RemoteDataSource
import io.reactivex.Observable

open class RestaurantRepository(
        private val remoteDataSource: RemoteDataSource,
        private val localDataSource: RestaurantDataSource) {


    fun getRestaurants(): Observable<List<RestaurantObj>>? {
        /**
         * check DB here, new request will return remote data source
         */
        return remoteDataSource.getRestaurants()
//                .onErrorResumeNext(localDataSource.getRestaurants())
                .map {
                    it.restaurants
                }
    }
}