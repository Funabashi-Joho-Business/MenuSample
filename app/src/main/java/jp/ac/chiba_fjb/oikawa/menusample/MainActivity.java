package jp.ac.chiba_fjb.oikawa.menusample;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

	private DrawerLayout mDrawer;
	private ActionBarDrawerToggle mToggle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mDrawer = (DrawerLayout)((ViewGroup)findViewById(android.R.id.content)).getChildAt(0);
		mToggle = new ActionBarDrawerToggle(this, mDrawer, R.string.app_name, R.string.app_name);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
	}


	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Activityの開始が完了したとき、ActionBarDrawerToggleの状態を同期させる
		mToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Activityが変更した時に、ActionBarDrawerToggleも変更させる
		mToggle.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (mToggle.onOptionsItemSelected(item)) {
			// ボタンが押された時、ActionBarDrawerToggleにNavigationDrawerの開閉させる
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
