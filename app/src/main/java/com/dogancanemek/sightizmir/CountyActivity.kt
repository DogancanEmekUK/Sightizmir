package com.dogancanemek.sightizmir

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class CountyActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_county)

        listView = findViewById(R.id.listView)

        var counties = ArrayList<String>()

        counties.add("Ilica")
        counties.add("Alacati")
        counties.add("Cesme")
        counties.add("Alsancak")
        counties.add("Karsiyaka")
        counties.add("Guzelyali")

        val alacati = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.alacati)
        val alsancak = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.alsancak)
        val cesme = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.cesme)
        val guzelyali = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.guzelyali)
        val ilica = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ilica)
        val karsiyaka = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.karsiyaka)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, counties)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            val intent = Intent(applicationContext, PhotoActivity::class.java)
            intent.putExtra("name", counties[position])
            startActivity(intent)
        }
    }
}