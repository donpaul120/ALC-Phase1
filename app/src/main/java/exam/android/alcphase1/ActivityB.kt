package exam.android.alcphase1

import android.annotation.SuppressLint
import android.net.http.SslError
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient

class ActivityB : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        this.webView = findViewById(R.id.webView)
        this.webView.webViewClient = SSLByPassWebViewClient()
        this.webView.settings.javaScriptEnabled = true
        this.webView.loadUrl("https://andela.com/alc/")
    }

    private class SSLByPassWebViewClient : WebViewClient() {
        override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
            handler?.proceed()
        }
    }
}
