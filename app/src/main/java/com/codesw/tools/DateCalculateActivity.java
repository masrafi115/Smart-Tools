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
import android.widget.TextView;
import android.widget.ImageView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.view.View;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class DateCalculateActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double dt1 = 0;
	private double dt = 0;
	private double day = 0;
	private double b = 0;
	private double year = 0;
	private double month = 0;
	private double mn1 = 0;
	private double mn = 0;
	private double a = 0;
	private double yr1 = 0;
	private double yr = 0;
	private String date = "";
	private String date2 = "";
	
	private LinearLayout linear1;
	private TextView textview3;
	private LinearLayout linear2;
	private TextView textview7;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private ImageView imageview1;
	private LinearLayout linear3;
	private TextView textview1;
	private ImageView imageview2;
	private LinearLayout linear5;
	private TextView textview2;
	private ImageView imageview3;
	private LinearLayout linear7;
	private TextView textview15;
	
	private AlertDialog.Builder d;
	private Calendar calendar3 = Calendar.getInstance();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.date_calculate);
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
		textview3 = (TextView) findViewById(R.id.textview3);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview15 = (TextView) findViewById(R.id.textview15);
		d = new AlertDialog.Builder(this);
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				showDatePickerDialog(linear3);
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				showDatePickerDialog2(linear5);
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_yyyy();
			}
		});
	}
	
	private void initializeLogic() {
		calendar3 = Calendar.getInstance();
		dt = Double.parseDouble(new SimpleDateFormat("d").format(calendar3.getTime()));
		mn = Double.parseDouble(new SimpleDateFormat("M").format(calendar3.getTime()));
		yr = Double.parseDouble(new SimpleDateFormat("yyyy").format(calendar3.getTime()));
		dt1 = Double.parseDouble(new SimpleDateFormat("d").format(calendar3.getTime()));
		mn1 = Double.parseDouble(new SimpleDateFormat("M").format(calendar3.getTime()));
		yr1 = Double.parseDouble(new SimpleDateFormat("yyyy").format(calendar3.getTime()));
		textview1.setText(String.valueOf((long)(dt)).concat("/").concat(String.valueOf((long)(mn)).concat("/".concat(String.valueOf((long)(yr))))));
		textview2.setText(String.valueOf((long)(dt1)).concat("/").concat(String.valueOf((long)(mn1)).concat("/".concat(String.valueOf((long)(yr1))))));
	}
	public void showDatePickerDialog(View v) {
		DialogFragment newFragment = new DatePickerFragment();
		newFragment.show(getSupportFragmentManager(), "datePicker");
	}
	public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			final Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = c.get(Calendar.DAY_OF_MONTH);
			return new DatePickerDialog(getActivity(), this, year, month, day);
		}
		public void onDateSet(DatePicker view, int year, int month, int day) {
			int mon = month +1;
			date = day + "/" + mon + "/" + year;
			textview1.setText(date);
			dt = day;
			mn = mon;
			yr = year;
		}
		
	}
	public void showDatePickerDialog2(View v) {
		DialogFragment newFragment2 = new DatePickerFragment2();
		newFragment2.show(getSupportFragmentManager(), "datePicker");
	}
	public class DatePickerFragment2 extends DialogFragment implements DatePickerDialog.OnDateSetListener {
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			final Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = c.get(Calendar.DAY_OF_MONTH);
			return new DatePickerDialog(getActivity(), this, year, month, day);
		}
		public void onDateSet(DatePicker view, int year, int month, int day) {
			int mon = month +1;
			date2 = day + "/" + mon + "/" + year;
			textview2.setText(date2);
			dt1 = day;
			mn1 = mon;
			yr1 = year;
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _dd () {
		if (dt1 > dt) {
			day = dt1 - dt;
		}
		else {
			b = dt1;
			day = b - dt;
		}
		d.setTitle("Date Difference");
		d.setMessage(String.valueOf((long)(year)).concat("years".concat(String.valueOf((long)(month)).concat("month".concat(String.valueOf((long)(day)).concat("days"))))));
		d.setPositiveButton("Back", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
	}
	
	
	public void _mm () {
		if (mn1 > mn) {
			month = mn1 - mn;
		}
		else {
			a = mn1;
			month = a - mn;
		}
		_dd();
	}
	
	
	public void _yyyy () {
		year = yr1 - yr;
		_mm();
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