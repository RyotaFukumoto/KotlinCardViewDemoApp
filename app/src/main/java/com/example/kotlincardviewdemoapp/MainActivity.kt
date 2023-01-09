package com.example.kotlincardviewdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var mCustomAdapter: CatsAdapter
    lateinit var mCatsList: ArrayList<Cat>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // データ一覧の実装
        val hijiki1 = Cat("ひじき", "2019年4月20日", R.drawable.hijiki)
        val thukushi1 = Cat("つくし", "2021年5月30日", R.drawable.thukushi)
        val hijiki2 = Cat("ひじき", "2019年4月20日", R.drawable.hijiki)
        val thukushi2 = Cat("ひじき", "2021年5月30日", R.drawable.thukushi)
        mCatsList = arrayListOf(hijiki1, thukushi1, hijiki2, thukushi2)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        // CustomAdapterの生成と設定
        mCustomAdapter = CatsAdapter(mCatsList)
        recyclerView.adapter = mCustomAdapter
    }
}