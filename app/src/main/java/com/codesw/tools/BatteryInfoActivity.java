package com.codesw.tools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import java.text.DecimalFormat;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class BatteryInfoActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String chargeType = "";
	private double level = 0;
	private String healthStatus = "";
	private String TECH = "";
	private String TEMP = "";
	private String VOLT = "";
	private double scale = 0;
	private String fontName = "";
	private String typeace = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear2;
	private LinearLayout linear28;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear11;
	private LinearLayout linear9;
	private LinearLayout linear15;
	private LinearLayout linear17;
	private LinearLayout linear14;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private ImageView imageview3;
	private TextView textview14;
	private LinearLayout linear18;
	private TextView textview2;
	private ImageView imageview4;
	private TextView textview15;
	private LinearLayout linear19;
	private TextView textview1;
	private ImageView imageview6;
	private TextView textview16;
	private LinearLayout linear21;
	private TextView textview8;
	private ImageView imageview5;
	private TextView textview22;
	private LinearLayout linear20;
	private TextView textview3;
	private ImageView imageview7;
	private TextView textview17;
	private LinearLayout linear24;
	private TextView textview9;
	private ImageView imageview9;
	private TextView textview18;
	private LinearLayout linear22;
	private TextView textview4;
	private ImageView imageview8;
	private TextView textview19;
	private LinearLayout linear25;
	private TextView textview5;
	private ImageView imageview10;
	private TextView textview20;
	private LinearLayout linear26;
	private TextView textview6;
	private ImageView imageview11;
	private TextView textview21;
	private LinearLayout linear27;
	private TextView textview7;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.battery_info);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = (AppBarLayout) findViewById(R.id._app_bar);
		_coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview15 = (TextView) findViewById(R.id.textview15);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview16 = (TextView) findViewById(R.id.textview16);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview22 = (TextView) findViewById(R.id.textview22);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview17 = (TextView) findViewById(R.id.textview17);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview18 = (TextView) findViewById(R.id.textview18);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview19 = (TextView) findViewById(R.id.textview19);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview20 = (TextView) findViewById(R.id.textview20);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview21 = (TextView) findViewById(R.id.textview21);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		textview7 = (TextView) findViewById(R.id.textview7);
	}
	
	private void initializeLogic() {
		
		_changeActivityFont("product_bold");
		imageview8.setColorFilter(0xFF9E9E9E, PorterDuff.Mode.MULTIPLY);
		imageview4.setColorFilter(0xFF9E9E9E, PorterDuff.Mode.MULTIPLY);
		IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
		            Intent batteryStatus = getApplicationContext().registerReceiver(null, ifilter);
		int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
		            boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL;
		            int chargePlug = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
		            boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
		            boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;
		            boolean wirelessCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_WIRELESS;
		            String chargeType = "Not plugged";
		            if(usbCharge) {
			                chargeType = "USB Power";
			            } else if(acCharge) {
			                chargeType = "AC Power";
			            } else if(wirelessCharge) {
			                chargeType = "Wireless Power";
			            }
		
		int health = batteryStatus.getIntExtra(BatteryManager.EXTRA_HEALTH, -1);
		String healthStatus = "" ;
		            if(health == BatteryManager.BATTERY_HEALTH_GOOD) {
			                healthStatus = "Good";
			            } else if(health == BatteryManager.BATTERY_HEALTH_OVERHEAT) {
			                healthStatus = "Over Heat";
			            } else if(health == BatteryManager.BATTERY_HEALTH_DEAD) {
			                healthStatus = "Dead";
			            } else if(health == BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE) {
			                healthStatus = "Over Voltage";
			            } else if(health == BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE) {
			                healthStatus = "Unspecified failure";
			            } else if(health == BatteryManager.BATTERY_HEALTH_COLD) {
			                healthStatus = "Cold";
			            } else {
			                healthStatus = "UNKNOWN";
			            }
		String TECH = batteryStatus.getStringExtra(BatteryManager.EXTRA_TECHNOLOGY);
		String STAT = Integer.valueOf(batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1)).toString();
		float temp = ((float) batteryStatus.getIntExtra(BatteryManager.EXTRA_TEMPERATURE,0) / 10);
		String TEMP = Float.valueOf(temp).toString();
		String VOLT = Integer.valueOf(batteryStatus.getIntExtra(BatteryManager.EXTRA_VOLTAGE, -1)).toString();
		int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
		int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
		String PERCENT = Boolean.valueOf(batteryStatus.getBooleanExtra(BatteryManager.EXTRA_PRESENT, false)).toString();
		textview1.setText(chargeType);
		if (textview1.getText().toString().equals("Not plugged")) {
			textview9.setText("Not plugged");
		}
		textview10.setText(String.valueOf((long)(level)).concat("%"));
		textview2.setText(healthStatus);
		textview3.setText(TECH);
		textview5.setText(TEMP.concat("°C"));
		textview6.setText(String.valueOf(Double.parseDouble(VOLT) / 1000).concat(" V"));
		textview7.setText(String.valueOf((long)(level)).concat("%"));
		textview8.setText(String.valueOf((long)(scale)));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _changeActivityFont (final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}
			else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
		};
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}