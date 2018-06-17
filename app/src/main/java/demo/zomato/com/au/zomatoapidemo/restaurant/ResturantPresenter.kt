package demo.zomato.com.au.zomatoapidemo.restaurant

import demo.zomato.com.au.zomatoapidemo.data.Restaurant
import demo.zomato.com.au.zomatoapidemo.data.source.RestaurantRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

open class RestaurantPresenter(val restaurantRepository: RestaurantRepository, val restaurantView: RestaurantContract.View) : RestaurantContract.Presenter {

    init {
        restaurantView.presenter = this
    }


    override fun start() {
        loadData()
    }

    override fun loadData() {

        restaurantView.showLoading() // loading bar


        var list = ArrayList<Restaurant>()

        restaurantRepository
                .getRestaurants()
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe {
                    it.flatMap {
                        list.add(it.restaurant)
                        list
                    }
                    restaurantView.showRestaurants(list)
                }
    }
}