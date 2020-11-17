package com.Dzaki.UTS201804016

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KeyboardActivity : AppCompatActivity() {
    private  lateinit var rvKeyboard: RecyclerView
    private var list: ArrayList<Keyboard> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyboard)

        rvKeyboard = findViewById(R.id.rv_keyboard)
        rvKeyboard.setHasFixedSize(true)

        list.addAll(DataKeyboard.listData)
        showRecyclerViewListMode()

    }
    private fun showRecyclerViewListMode(){
        rvKeyboard.layoutManager = LinearLayoutManager(this)
        val listKeyboardAdapter = ListKeyboard(list)
        rvKeyboard.adapter = listKeyboardAdapter
    }
}