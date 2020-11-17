package com.Dzaki.UTS201804016

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MouseActivity : AppCompatActivity() {
    private  lateinit var rvMouse: RecyclerView
    private var list: ArrayList<Mouse> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mouse)

        rvMouse = findViewById(R.id.rv_mouse)
        rvMouse.setHasFixedSize(true)

        list.addAll(DataMouse.listData)
        showRecyclerViewListMode()

    }
    private fun showRecyclerViewListMode(){
        rvMouse.layoutManager = LinearLayoutManager(this)
        val ListMouseAdapter = ListMouse(list)
        rvMouse.adapter = ListMouseAdapter
    }
}