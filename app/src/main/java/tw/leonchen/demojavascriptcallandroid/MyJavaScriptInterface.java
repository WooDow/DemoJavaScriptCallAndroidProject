package tw.leonchen.demojavascriptcallandroid;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class MyJavaScriptInterface {
    private Context context;

    public MyJavaScriptInterface(Context context){
        this.context = context;
    }

    @JavascriptInterface
    public void sayHello(String name){
        Toast.makeText(context, "This Message is From Android App, Hi," + name, Toast.LENGTH_LONG).show();
    }
}
