package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.FruitAdapter

class FruitsActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    val imageList = ArrayList<Int>()
    val nameList = ArrayList<String>()
    val descList = ArrayList<String>()

    lateinit var adapter: FruitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_fruits)
        recyclerView = findViewById(R.id.recycleview0)

        imageList.add(R.drawable.flower)
        imageList.add(R.drawable.cow)
        imageList.add(R.drawable.whiteflower)

        nameList.add("Flower")
        nameList.add("Cow")
        nameList.add("WhiteFlower")

        descList.add("This is flower")
        descList.add("This is Cow")
        descList.add("This is whiteFlower")

        adapter = FruitAdapter(this@FruitsActivity,imageList, nameList, descList)
        recyclerView.adapter = adapter
// Linear Layout
       recyclerView.layoutManager = LinearLayoutManager(this@FruitsActivity,LinearLayoutManager.HORIZONTAL,false)

        //Grid Layout
        //recyclerView.layoutManager = GridLayoutManager(this@FruitsActivity,2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.logoimage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

