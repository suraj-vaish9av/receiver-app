package com.arupakaman.receiverapp

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arupakaman.receiverapp.orderdreceiver.MyDynamicOrderedReceiver

const val CUSTOM_ACTION = "com.arupakaman.receiverapp.ACTION_CUSTOM_BROADCAST"

const val ORDERED_ACTION="com.arupakaman.receiverapp.ACTION_ORDERED_RECEIVER"

class MainActivity : AppCompatActivity() {

    private val myCustomReceiver by lazy { MyCustomReceiver() }

    private val myDynamicOrderedReceiver = MyDynamicOrderedReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentFilter = IntentFilter(CUSTOM_ACTION)
        registerReceiver(myCustomReceiver,intentFilter)

        val intentFilter1 = IntentFilter(ORDERED_ACTION)
        intentFilter1.priority = 30
        registerReceiver(myDynamicOrderedReceiver,intentFilter1)

    }

    override fun onDestroy() {
        super.onDestroy()

        unregisterReceiver(myCustomReceiver)
        unregisterReceiver(myDynamicOrderedReceiver)
    }
}