package com.arupakaman.receiverapp.orderdreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyStaticOrderedReceiver2 : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("MyStaticOrderedRec2","onReceive called")

        if (isOrderedBroadcast)
        {
            var initialCode = resultCode
            var initialData = resultData
            val bundle = getResultExtras(true) // true will return new bundle if existing bundle found null
            var stringExtra = bundle.getString("message_key")

            initialCode++
            stringExtra+="->BR2"

            val output = "initial Code: $initialCode" +
                    "\n initial Data: $initialData" +
                    "\n string extra: $stringExtra"

            Toast.makeText(context,output, Toast.LENGTH_LONG).show()

            initialData="BR2"
            bundle.putString("message_key",stringExtra)

            setResult(initialCode,initialData,bundle)
        }
    }
}