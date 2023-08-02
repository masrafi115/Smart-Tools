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
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.graphics.Typeface;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;

public class TimeutilsActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String fontName = "";
	private String typeace = "";
	private String FROM = "";
	private String TO = "";
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear7;
	private LinearLayout linear6;
	private LinearLayout linear9;
	private LinearLayout linear11;
	private ImageView imageview2;
	private TextView textview1;
	private TextView textview2;
	private TextView textview13;
	private ImageView imageview3;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private ImageView imageview1;
	private TextView textview3;
	private TextView textview4;
	private TextView textview14;
	private ImageView imageview4;
	private LinearLayout linear8;
	private LinearLayout linear4;
	private LinearLayout linear13;
	private LinearLayout linear5;
	private TextView textview5;
	private TextView textview7;
	private TextView textview6;
	private TextView textview8;
	private TextView textview12;
	private TextView textview11;
	private TextView textview9;
	
	private Intent i = new Intent();
	private SharedPreferences TimeZones;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.timeutils);
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
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview9 = (TextView) findViewById(R.id.textview9);
		TimeZones = getSharedPreferences("timezone", Activity.MODE_PRIVATE);
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PickZoneActivity.class);
				i.putExtra("key", "From");
				startActivity(i);
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PickZoneActivity.class);
				i.putExtra("key", "To");
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		FROM = java.time.ZoneId.of(TimeZone.getDefault().getID()).toString();;
		TO = "GMT";
		getSupportActionBar().setElevation(0);
		_Elevation(linear3, 5);
		_shapeRadius(textview5, "#BDBDBD", 5);
		_changeActivityFont("product_regular");
		textview13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview2.setText(_getZone(FROM));
		textview4.setText(_getZone(TO));
		textview13.setText(FROM);
		textview6.setText(_getTime(FROM));
		textview8.setText(_getDate(FROM));
		textview7.setText(_getZone(FROM));
		textview14.setText(TO);
		textview11.setText(_getTime(TO));
		textview9.setText(_getDate(TO));
		textview12.setText(_getZone(TO));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (!TimeZones.getString("From", "").equals("")) {
			FROM = TimeZones.getString("From", "");
			TimeZones.edit().remove("From").commit();
			textview13.setText(FROM);
			textview2.setText(_getZone(FROM));
			textview6.setText(_getTime(FROM));
			textview8.setText(_getDate(FROM));
			textview7.setText(_getZone(FROM));
		}
		if (!TimeZones.getString("To", "").equals("")) {
			TO = TimeZones.getString("To", "");
			TimeZones.edit().remove("To").commit();
			textview14.setText(TO);
			textview4.setText(_getZone(TO));
			textview11.setText(_getTime(TO));
			textview9.setText(_getDate(TO));
			textview12.setText(_getZone(TO));
		}
		textview5.setText("Time Difference ".concat(_getTimeZoneDiffence(FROM, TO)));
	}
	
	public void _shapeRadius (final View _v, final String _color, final double _radius) {
		android.graphics.drawable.GradientDrawable shape = new android.graphics.drawable.GradientDrawable();
		  shape.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		
		shape.setCornerRadius((int)_radius);
		
		shape.setColor(Color.parseColor(_color));
		_v.setBackgroundDrawable(shape);
	}
	
	
	public void _Elevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
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
	
	
	public String _getTimeZoneDiffence (final String _tz1, final String _tz2) {
		
		// create two time zones
		TimeZone newYork = TimeZone.getTimeZone(_tz1);
		TimeZone moscow = TimeZone.getTimeZone(_tz2);
		
		// get their offsets from UTC in milliseconds
		int newYorkOffset = newYork.getOffset(System.currentTimeMillis());
		int moscowOffset = moscow.getOffset(System.currentTimeMillis());
		
		// calculate the difference in hours and minutes
		int differenceInMinutes = (newYorkOffset - moscowOffset) / (1000 * 60);
		int differenceInHours = differenceInMinutes / 60;
		differenceInMinutes = differenceInMinutes % 60;
		
		// get the display names of the time zones
		String newYorkName = newYork.getDisplayName();
		String moscowName = moscow.getDisplayName();
		
		// format the time zone difference
		String timeZoneDifference = String.format("%+03d:%02d", differenceInHours, differenceInMinutes);
		
		// print the result
		return timeZoneDifference;
	}
	
	
	public String _getTime (final String _zone) {
		
		// specify the timezone using its ID
		String timeZoneId = _zone;
		
		// create a date format object with the desired format and timezone
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		dateFormat.setTimeZone(TimeZone.getTimeZone(timeZoneId));
		
		// get the current date and time in the specified timezone
		String currentTime = dateFormat.format(new Date());
		return currentTime;
		// display the formatted date and time
		 
	}
	
	
	public String _getDate (final String _zone) {
		// specify the timezone using its ID
		String timeZoneId = _zone;
		
		// create a date format object with the desired format and timezone
		SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd-MMM-yyyy");
		dateFormat.setTimeZone(TimeZone.getTimeZone(timeZoneId));
		
		// get the current date and time in the specified timezone
		String currentTime = dateFormat.format(new Date());
		
		return currentTime;
		// display the formatted date and time
	}
	
	
	public String _getZone (final String _zone) {
		// specify the timezone using its ID
		String timeZoneId = _zone;
		
		// create a date format object with the desired format and timezone
		SimpleDateFormat dateFormat = new SimpleDateFormat("zzzz");
		dateFormat.setTimeZone(TimeZone.getTimeZone(timeZoneId));
		
		// get the current date and time in the specified timezone
		String currentTime = dateFormat.format(new Date());
		
		return currentTime;
		// display the formatted date and time
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