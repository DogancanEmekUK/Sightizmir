package com.dogancanemek.sightizmir

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PhotoActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var countyNameTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        imageView = findViewById(R.id.imageView)
        countyNameTxt = findViewById(R.id.countyNameTxt)

        val intent = intent
        val countyName = intent.getStringExtra("name")
        countyNameTxt.text = countyName

        val alacati = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.alacati)
        val alsancak = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.alsancak)
        val cesme = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.cesme)
        val guzelyali = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.guzelyali)
        val ilica = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ilica)
        val karsiyaka = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.karsiyaka)

        if (countyName == "Alacati") {
            imageView.setImageBitmap(alacati)
        } else if (countyName == "Alsancak") {
            imageView.setImageBitmap(alsancak)
        } else if (countyName == "Cesme") {
            imageView.setImageBitmap(cesme)
        } else if (countyName == "Guzelyali") {
            imageView.setImageBitmap(guzelyali)
        } else if (countyName == "Ilica") {
            imageView.setImageBitmap(ilica)
        } else if (countyName == "Karsiyaka") {
            imageView.setImageBitmap(karsiyaka)
        }


    }
}