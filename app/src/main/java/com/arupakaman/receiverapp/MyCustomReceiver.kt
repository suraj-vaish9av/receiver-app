package com.arupakaman.receiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyCustomReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        if (CUSTOM_ACTION == intent?.action)
        {
            val extraData = intent?.getStringExtra("com.arupakaman.EXTRA_DATA")
            Toast.makeText(context,"From Receiver App : $extraData",Toast.LENGTH_LONG).show()
        }
    }
}