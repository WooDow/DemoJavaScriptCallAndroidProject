package tw.leonchen.demojavascriptcallandroid;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.webkit.WebView;

public class DemoJavaScriptCallAndroidActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_java_script_call_android);

        webView = (WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.addJavascriptInterface(new MyJavaScriptInterface(DemoJavaScriptCallAndroidActivity.this), "LeonChen");
        webView.loadUrl("file:///android_asset/JavaScriptCallAndroid.html");
    }
}
