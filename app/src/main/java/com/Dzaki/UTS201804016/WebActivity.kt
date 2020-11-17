package com.Dzaki.UTS201804016

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val webview: WebView = findViewById(R.id.webview)
        webview.settings.javaScriptEnabled = true
        webview.loadUrl("https://www.instagram.com/hijek_/")

    }
}