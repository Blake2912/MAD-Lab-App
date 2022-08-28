package com.test.madlabapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var appListRv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appListRv = findViewById(R.id.app_list_rv)

        val appListAdapter: AppListAdapter = AppListAdapter()
        appListRv.adapter = appListAdapter
    }
}