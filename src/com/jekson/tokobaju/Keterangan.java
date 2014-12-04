package com.jekson.tokobaju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;
import android.app.Activity;
import android.content.res.Resources;

public class Keterangan extends Activity {

	WebView webview;

	public void onCreate(Bundle bundle) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(bundle);
		setContentView(R.layout.keterangan);
		webview = (WebView) findViewById(R.id.isi);

		String content = loadStringFromRawResource(getResources(),
				R.raw.sh);

		String mimeType = "text/html";
		String encoding = "UTF-8";

		webview.loadDataWithBaseURL("file:///android_asset", content, mimeType,
				encoding, null);
		webview.setBackgroundColor(0);

	}

	private String loadStringFromRawResource(Resources resources, int resId) {
		InputStream rawResource = resources.openRawResource(resId);
		String content = streamToString(rawResource);
		try {
			rawResource.close();
		} catch (IOException e) {
		}
		return content;
	}

	private String streamToString(InputStream in) {
		String l;
		BufferedReader r = new BufferedReader(new InputStreamReader(in));
		StringBuilder s = new StringBuilder();
		try {
			while ((l = r.readLine()) != null) {
				s.append(l + "\n");
			}
		} catch (IOException e) {
		}
		return s.toString();
	}
}
