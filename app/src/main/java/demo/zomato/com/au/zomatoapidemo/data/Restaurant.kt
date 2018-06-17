package demo.zomato.com.au.zomatoapidemo.data

data class RestaurantObj constructor(val restaurant: Restaurant)
/**
 *
"R": {
"res_id": 16583098
},
"apikey": "c3aac1ba0d306c76e9ae1338f5eb9c1d",
"id": "16583098",
"name": "Lune Croissanterie",
"url": "https://www.zomato.com/melbourne/lune-croissanterie-fitzroy?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1",
"location": {
"address": "119 Rose Street, Fitzroy, Melbourne",
"locality": "Fitzroy",
"city": "Melbourne",
"city_id": 259,
"latitude": "-37.7960412344",
"longitude": "144.9799542502",
"zipcode": "3184",
"country_id": 14,
"locality_verbose": "Fitzroy, Melbourne"
},
"switch_to_order_menu": 0,
"cuisines": "Bakery, French",
"average_cost_for_two": 25,
"price_range": 1,
"currency": "$",
"offers": [],
"opentable_support": 0,
"is_zomato_book_res": 0,
"mezzo_provider": "OTHER",
"is_book_form_web_view": 0,
"book_form_web_view_url": "",
"book_again_url": "",
"thumb": "https://b.zmtcdn.com/data/res_imagery/16583098_RESTAURANT_85d8530d7150dc4ab2a1ad8e462b6085.JPG?fit=around%7C200%3A200&crop=200%3A200%3B%2A%2C%2A",
"user_rating": {
"aggregate_rating": "4.9",
"rating_text": "Excellent",
"rating_color": "3F7E00",
"votes": "1108"
},
"photos_url": "https://www.zomato.com/melbourne/lune-croissanterie-fitzroy/photos?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1#tabtop",
"menu_url": "https://www.zomato.com/melbourne/lune-croissanterie-fitzroy/menu?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1&openSwipeBox=menu&showMinimal=1#tabtop",
"featured_image": "https://b.zmtcdn.com/data/res_imagery/16583098_RESTAURANT_85d8530d7150dc4ab2a1ad8e462b6085.JPG",
"has_online_delivery": 0,
"is_delivering_now": 0,
"include_bogo_offers": true,
"deeplink": "zomato://restaurant/16583098",
"is_table_reservation_supported": 0,
"has_table_booking": 0,
"events_url": "https://www.zomato.com/melbourne/lune-croissanterie-fitzroy/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1",
"establishment_types": []
 */
data class Restaurant constructor(var name: String = "", var location:Location, var thumb: String = "")


/**
 * "address": "119 Rose Street, Fitzroy, Melbourne",
"locality": "Fitzroy",
"city": "Melbourne",
"city_id": 259,
"latitude": "-37.7960412344",
"longitude": "144.9799542502",
"zipcode": "3184",
"country_id": 14,
"locality_verbose": "Fitzroy, Melbourne"
 */
data class Location constructor(var address: String = "", var locality: String = "", var city: String = "", var zipcode: String = "", var locality_verbose: String = "")