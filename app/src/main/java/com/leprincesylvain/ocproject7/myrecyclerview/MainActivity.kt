package com.leprincesylvain.ocproject7.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(200)

        activity_main_recyclerview.adapter = Adapter(exampleList)
        activity_main_recyclerview.layoutManager = LinearLayoutManager(this)
        activity_main_recyclerview.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<ItemExample> {
        val list = ArrayList<ItemExample>()

        for (i in 0 until size) {
            val drawable = when (i%3) {
                0 -> R.drawable.ic_baseline_account_circle_24
                1 -> R.drawable.ic_baseline_airplanemode_inactive_24
                else -> R.drawable.ic_baseline_build_24
            }
            val item = ItemExample(drawable, "Item $i", "Line 2")
            list.add(item)
        }
        return list
    }
}