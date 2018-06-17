package demo.zomato.com.au.zomatoapidemo.restaurant

import demo.zomato.com.au.zomatoapidemo.BasePresenter
import demo.zomato.com.au.zomatoapidemo.BaseView
import demo.zomato.com.au.zomatoapidemo.data.Restaurant

interface RestaurantContract {

    interface View : BaseView<Presenter> {

        fun showLoading()
        fun showRestaurants(restaurants : List<Restaurant>)
        fun dismissLoading()
    }

    interface Presenter : BasePresenter {
        fun loadData()
    }
}