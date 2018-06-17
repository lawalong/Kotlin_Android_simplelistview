package demo.zomato.com.au.zomatoapidemo.restaurant

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import demo.zomato.com.au.zomatoapidemo.R
import demo.zomato.com.au.zomatoapidemo.data.Restaurant
import org.jetbrains.anko.support.v4.find
import org.jetbrains.anko.support.v4.toast
import java.util.ArrayList

class RestaurantFragment : Fragment(), RestaurantContract.View {


    override lateinit var presenter: RestaurantContract.Presenter

    companion object {

        fun newInstance() = RestaurantFragment()
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    private var restaurantAdapter = RestaurantAdapter(ArrayList(0)) {
        toast("${it.name} ,add to love list")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val fragment = inflater.inflate(R.layout.fragment_restaurant, container, false)

        val recyclerView = fragment.findViewById<RecyclerView>(R.id.rv_restaurant)

        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = restaurantAdapter

        return fragment
    }


    override fun showLoading() {


    }

    override fun dismissLoading() {
    }


    override fun showRestaurants(restaurants: List<Restaurant>) {
        if (restaurants != null) {
            restaurantAdapter.setData(restaurants)
        }
    }
}