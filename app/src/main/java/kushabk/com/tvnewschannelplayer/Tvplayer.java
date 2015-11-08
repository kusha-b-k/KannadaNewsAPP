package kushabk.com.tvnewschannelplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import android.webkit.WebSettings;
import android.webkit.WebViewClient;

/**
 * Created by kushabaledonikrishnamurthy on 06/11/15.
 *
 *
 *
 */

public class Tvplayer extends AppCompatActivity {


    //final Context context = this;

   // String frameVideo ="<iframe width=\"auto\" height=\"auto\" src=\"https://www.youtube.com/embed/DXp_0D6Dr_4\" frameborder=\"0\" allowfullscreen></iframe>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tvplay);
       WebView vv=(WebView)findViewById(R.id.webView);


        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        vv.setWebViewClient(new WebViewClient()
            {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

                WebSettings webSettings = vv.getSettings();
                webSettings.setJavaScriptEnabled(true);

                vv.loadData(message, "text/html", "utf-8");

    }

}
