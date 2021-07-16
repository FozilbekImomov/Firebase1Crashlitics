package com.example.firebase1

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.ktx.messaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Firebase.messaging.isAutoInitEnabled = true

        Log.d("Hi", "onCreate: Hello Github")
    }


    fun TestCrash(view: View) {
        FirebaseCrashlytics.getInstance().setCustomKey("str_key", "hello")

        throw RuntimeException("Test Crash")

    }
}