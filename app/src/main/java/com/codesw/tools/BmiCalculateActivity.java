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
import java.util.ArrayList;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.*;
import android.widget.ImageView;
import com.google.android.material.textfield.*;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.graphics.Typeface;
import java.text.DecimalFormat;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class BmiCalculateActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ArrayList<String> ls = new ArrayList<>();
	
	private LinearLayout linear10;
	private CardView cardview1;
	private MaterialButton materialbutton1;
	private LinearLayout linear6;
	private LinearLayout linear2;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private ImageView imageview1;
	private TextInputLayout textinputlayout2;
	private EditText edittext1;
	private ImageView imageview3;
	private TextInputLayout textinputlayout4;
	private TextView textview6;
	private EditText edittext3;
	private ImageView imageview4;
	private TextInputLayout textinputlayout5;
	private EditText edittext4;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private RadioButton radiobutton1;
	private ImageView imageview5;
	private TextView textview1;
	private RadioButton radiobutton2;
	private ImageView imageview6;
	private TextView textview5;
	
	private AlertDialog.Builder d;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.bmi_calculate);
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
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		materialbutton1 = (MaterialButton) findViewById(R.id.materialbutton1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textinputlayout2 = (TextInputLayout) findViewById(R.id.textinputlayout2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textinputlayout4 = (TextInputLayout) findViewById(R.id.textinputlayout4);
		textview6 = (TextView) findViewById(R.id.textview6);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textinputlayout5 = (TextInputLayout) findViewById(R.id.textinputlayout5);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		radiobutton1 = (RadioButton) findViewById(R.id.radiobutton1);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview1 = (TextView) findViewById(R.id.textview1);
		radiobutton2 = (RadioButton) findViewById(R.id.radiobutton2);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview5 = (TextView) findViewById(R.id.textview5);
		d = new AlertDialog.Builder(this);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Results");
				d.setMessage("BMI : ".concat(String.valueOf(Double.parseDouble(edittext3.getText().toString()) / (Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext4.getText().toString())))));
				d.setPositiveButton("Back", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
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