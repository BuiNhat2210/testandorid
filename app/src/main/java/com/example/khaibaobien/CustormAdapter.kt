package com.example.khaibaobien

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class CustormAdapter(var context: Context, var arrayFood: ArrayList<Food>): BaseAdapter() {
    class ViewHolder(row: View){
        var textView_name_food: TextView
        var imgView_food: ImageView
        init{
            textView_name_food = row.findViewById(R.id.textView_name);
            imgView_food = row.findViewById(R.id.img_food)
        }

    }
    override fun getCount(): Int {
        // tra ve so phan tu co the ve
        return arrayFood.size;
    }

    override fun getItem(position: Int): Any {
        return arrayFood.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong();
    }

    override fun getView(position: Int, converView: View?, p2: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if(converView == null)
        {
            var layoutInflater:LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.dong_monan, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }
        else
        {
            view = converView
            viewHolder = converView.tag as ViewHolder
        }
        var mon_an:Food = getItem(position) as Food
        viewHolder.textView_name_food.text = mon_an.name
        viewHolder.imgView_food.setImageResource(mon_an.img)
        return view as View
    }
}