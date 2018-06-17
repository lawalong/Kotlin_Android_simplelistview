package demo.zomato.com.au.zomatoapidemo.data

data class HttpResult(val results_found: Int, val results_star: Int, val results_shown: Int, val restaurants: List<RestaurantObj>)