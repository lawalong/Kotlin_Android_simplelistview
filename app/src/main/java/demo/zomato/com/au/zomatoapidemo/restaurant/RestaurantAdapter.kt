package demo.zomato.com.au.zomatoapidemo.restaurant

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import demo.zomato.com.au.zomatoapidemo.R
import demo.zomato.com.au.zomatoapidemo.data.Restaurant
import demo.zomato.com.au.zomatoapidemo.ext.inflate
import demo.zomato.com.au.zomatoapidemo.ext.loadUrl
import kotlinx.android.synthetic.main.item_restaurant.view.*

open class RestaurantAdapter(var restaurants: List<Restaurant>, private val listener: (Restaurant) -> Unit) : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(parent.inflate(R.layout.item_restaurant))


    override fun getItemCount(): Int = restaurants.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        if (restaurants != null && restaurants.size > 0) {
            holder.bind(restaurants[position], listener)
        }


    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Restaurant, listener: (Restaurant) -> Unit) = with(itemView) {
            image.loadUrl(item?.thumb)
            tv_name.text = item?.name
            tv_address.text = item?.location.address
            setOnClickListener { listener(item) }
        }
    }


    fun setData(restaurants: List<Restaurant>) {

        this.restaurants = restaurants
        notifyDataSetChanged()
    }
}