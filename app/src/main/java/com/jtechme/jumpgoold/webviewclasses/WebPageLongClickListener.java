package com.jtechme.jumpgoold.webviewclasses;

import com.jtechme.jumpgoold.activities.BrowserActivity;
import android.view.View;
import android.view.View.OnLongClickListener;

public class WebPageLongClickListener implements OnLongClickListener{

	@Override
	public boolean onLongClick(View v) {
		return BrowserActivity.onLongClick();
	}

}
