package com.arupakaman.receiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyExplicitBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Explicit Broadcast Receiver called from : Receiver App",Toast.LENGTH_LONG).show()
    }
}