package com.example.oauthd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import com.example.oauthd.NetWork.user;
import com.example.oauthd.NetWork.yaParser;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    TextView textView;

    String app_token = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        textView = findViewById(R.id.textView);

        Log.d("Amogus", "POG");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Log.d("ACCESSING_URL", url);
//                https://www.pog.com/#&access_token=y0_AgAAAAATQs1cAAiaOgAAAADTtMjJEYpK9KBiS3Wah48u8rBYUuljhSE&token_type=bearer&expires_in=31534734
                if (url.contains("https://www.pog.com/")) {
                    String res = url.replace("https://www.pog.com/#&access_token=", "");
                    res = res.split("&")[0];
                    loadData(res);
                }
                view.loadUrl(url);
                return false; // then it is not handled by default action
            }
        });
        webView.loadUrl("https://oauth.yandex.ru/authorize?response_type=token&client_id=31222aaef68f448289e0cf16bfab9b43");

    }

    private void loadData(String res) {

        yaParser yaParser = new yaParser();
        yaParser.getBoardAPI().getUserInfo(res).enqueue(new Callback<user>() {
            @Override
            public void onResponse(Call<user> call, Response<user> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    webView.setVisibility(View.GONE);
                    textView.setVisibility(View.VISIBLE);
                    user u = response.body();
                    String ans = u.getFirstName() + "\n";
                    ans += u.getLastName();
                    textView.setText(ans);
                } else {
                    Toast.makeText(MainActivity.this, "Something go wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<user> call, Throwable t) {
                Toast.makeText(MainActivity.this, "RequestError", Toast.LENGTH_SHORT).show();
            }
        });
        String ans;
    }
}