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
import com.google.android.material.textfield.*;
import com.google.android.material.button.*;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import java.text.DecimalFormat;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PreCombActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private boolean isPremutation = false;
	private boolean isCombination = false;
	private double n = 0;
	private double r = 0;
	private double factorial = 0;
	
	private LinearLayout linear1;
	private TextInputLayout textinputlayout5;
	private TextInputLayout textinputlayout4;
	private MaterialButton materialbutton1;
	private EditText edittext4;
	private EditText edittext3;
	
	private AlertDialog.Builder d;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.pre_comb);
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
		textinputlayout5 = (TextInputLayout) findViewById(R.id.textinputlayout5);
		textinputlayout4 = (TextInputLayout) findViewById(R.id.textinputlayout4);
		materialbutton1 = (MaterialButton) findViewById(R.id.materialbutton1);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		d = new AlertDialog.Builder(this);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext3.getText().toString().equals("") || edittext4.getText().toString().equals("")) {
					d.setTitle("Kindly Attention");
					d.setMessage("One or more input are either empty or incorrect");
					d.setPositiveButton("Back", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					d.create().show();
				}
				else {
					if (isPremutation) {
						n = Double.parseDouble(edittext4.getText().toString());
						r = Double.parseDouble(edittext3.getText().toString());
						d.setTitle("Result");
						d.setMessage("Premutation : ".concat(String.valueOf(_calcFactorial(n) / _calcFactorial(n - r))));
						d.setPositiveButton("Back", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						d.create().show();
					}
					else {
						if (isCombination) {
							n = Double.parseDouble(edittext4.getText().toString());
							r = Double.parseDouble(edittext3.getText().toString());
							d.setTitle("Result");
							d.setMessage("Combination : ".concat(String.valueOf(_calcFactorial(n) / (_calcFactorial(r) * _calcFactorial(n - r)))));
							d.setPositiveButton("Back", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							d.create().show();
						}
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		if (getIntent().getStringExtra("key").equals("premutation")) {
			isPremutation = true;
		}
		else {
			if (getIntent().getStringExtra("key").equals("combination")) {
				isCombination = true;
			}
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
	
	public double _calcFactorial (final double _num) {
		int num = (int) _num;
		int factorial = 1;
		for(int i = 1; i<=_num; i++){
					factorial = i * factorial;
		}
		return (long)factorial;
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