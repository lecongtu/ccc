package com.example.baicuoiky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.ActionBar
import androidx.core.view.setPadding
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_add_class.*
import kotlinx.android.synthetic.main.activity_term.*
import kotlin.math.abs

class term : AppCompatActivity() {

    private lateinit var actionBar:ActionBar
    private lateinit var myModelList: ArrayList<MyModel>
    private lateinit var myAdapter: Adapter
    private lateinit var list:ArrayList<MyModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_term)
        loadCards()

    }

    private fun loadCards() {
        myModelList = ArrayList()
        list = intent.getSerializableExtra("data") as ArrayList<MyModel>
        for (i in 0 until list.size){
        myModelList.add(
                MyModel(
                        list[i].terms,list[i].defines , ""))}

        myAdapter = Adapter(this, myModelList)

        viewPager.adapter = myAdapter

        viewPager.setPadding(100,0,100,0)
        nameTerm1.text = list[1].nameTerm
    }
}