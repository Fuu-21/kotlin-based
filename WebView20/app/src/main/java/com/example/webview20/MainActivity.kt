package com.example.webview20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewSetup()
    }
    private fun webViewSetup(){
        val webView = findViewById<WebView>(R.id.wb_webView)

        webView.apply {
        webView.loadUrl("https://www.google.com")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            webViewClient = WebViewClient()
        }
    }
    override fun onBackPressed() {
        val webView = findViewById<WebView>(R.id.wb_webView)
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }
}