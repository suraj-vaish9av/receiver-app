package com.arupakaman.receiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyImplicitBroadcastAsExplicit : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"MyImplicitBroadcast Receiver called as Explicit BR : from Receiver App",Toast.LENGTH_LONG).show()
    }
}