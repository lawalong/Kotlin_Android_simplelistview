package demo.zomato.com.au.zomatoapidemo.ext

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import android.os.Build
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import com.bumptech.glide.request.target.SimpleTarget




//inflate xml
fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}

//load image
fun ImageView.loadUrl(url: String) {
    Glide.with(context).load(url).into(this)
}

