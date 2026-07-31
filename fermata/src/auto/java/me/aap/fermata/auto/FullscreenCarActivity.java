package me.aap.fermata.auto;

import static me.aap.utils.ui.activity.ActivityDelegate.FULLSCREEN_FLAGS;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;

import me.aap.fermata.ui.activity.MainActivity;

public class FullscreenCarActivity extends MainActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		enterFullscreen();
	}

	@Override
	protected void onResume() {
		super.onResume();
		enterFullscreen();
	}

	@Override
	public boolean isCarActivity() {
		return true;
	}

	private void enterFullscreen() {
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		getWindow().getDecorView().setSystemUiVisibility(FULLSCREEN_FLAGS);
	}
}
