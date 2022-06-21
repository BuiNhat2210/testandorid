package com.example.khaibaobien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var array_monan: ArrayList<Food> = ArrayList();
        array_monan.add(Food("Banh mi hot dog", R.drawable.food1))
        array_monan.add(Food("Banh mi loai 2", R.drawable.food2))
        listView.adapter = CustormAdapter(this@MainActivity,array_monan);


    }

}