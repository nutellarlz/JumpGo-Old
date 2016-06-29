package com.jtechme.jumpgoold.incognitoclasses;

import com.jtechme.jumpgoold.activities.IncognitoModeActivity;
import android.view.View;
import android.view.View.OnLongClickListener;

public class IncognitoLongClickListener implements OnLongClickListener{

	@Override
	public boolean onLongClick(View v) {
		return IncognitoModeActivity.onLongClick();
	}

}
