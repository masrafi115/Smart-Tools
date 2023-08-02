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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import com.google.android.material.textfield.*;
import com.google.android.material.button.*;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.AdapterView;
import android.view.View;
import android.graphics.Typeface;
import java.text.DecimalFormat;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class SquarefeetActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private boolean isSquare = false;
	private boolean isCircle = false;
	private boolean isTriangle = false;
	private double area = 0;
	
	private ArrayList<String> ls = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private ImageView imageview1;
	private TextView textview1;
	private Spinner spinner1;
	private LinearLayout linear4;
	private TextView textview2;
	private TextInputLayout textinputlayout4;
	private TextInputLayout textinputlayout5;
	private LinearLayout linear6;
	private TextInputLayout textinputlayout8;
	private MaterialButton materialbutton1;
	private EditText edittext1;
	private EditText edittext2;
	private TextView textview3;
	private TextInputLayout textinputlayout6;
	private TextInputLayout textinputlayout7;
	private EditText edittext3;
	private EditText edittext4;
	private EditText edittext5;
	
	private AlertDialog.Builder d;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.squarefeet);
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
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview2 = (TextView) findViewById(R.id.textview2);
		textinputlayout4 = (TextInputLayout) findViewById(R.id.textinputlayout4);
		textinputlayout5 = (TextInputLayout) findViewById(R.id.textinputlayout5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textinputlayout8 = (TextInputLayout) findViewById(R.id.textinputlayout8);
		materialbutton1 = (MaterialButton) findViewById(R.id.materialbutton1);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textinputlayout6 = (TextInputLayout) findViewById(R.id.textinputlayout6);
		textinputlayout7 = (TextInputLayout) findViewById(R.id.textinputlayout7);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		d = new AlertDialog.Builder(this);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					isSquare = true;
					isCircle = false;
					isTriangle = false;
					textview2.setText("Width");
					textview3.setText("Length");
					linear6.setVisibility(View.VISIBLE);
				}
				if (_position == 1) {
					isSquare = false;
					isCircle = true;
					isTriangle = false;
					linear6.setVisibility(View.GONE);
					textview2.setText("Diameter");
				}
				if (_position == 2) {
					isSquare = false;
					isCircle = false;
					isTriangle = true;
					linear6.setVisibility(View.VISIBLE);
					textview2.setText("Base Length");
					textview3.setText("Height");
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (isSquare) {
					d.setTitle("Square Feet Calculation");
					area = (Double.parseDouble(edittext1.getText().toString()) + (Double.parseDouble(edittext2.getText().toString()) / 12)) * (Double.parseDouble(edittext3.getText().toString()) + (Double.parseDouble(edittext4.getText().toString()) / 12));
					d.setMessage("Square Footage\n".concat(String.valueOf(area)).concat("\nTotal Cost\n$".concat(String.valueOf(Double.parseDouble(edittext5.getText().toString()) * area))));
					d.setPositiveButton("back", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					d.create().show();
				}
				else {
					if (isCircle) {
						d.setTitle("Square Feet Calculation");
						area = Math.PI * (((Double.parseDouble(edittext1.getText().toString()) + (Double.parseDouble(edittext2.getText().toString()) / 12)) / 2) * ((Double.parseDouble(edittext1.getText().toString()) + (Double.parseDouble(edittext2.getText().toString()) / 12)) / 2));
						d.setMessage("Square Footage\n".concat(String.valueOf(area)).concat("\nTotal Cost\n$".concat(String.valueOf(Double.parseDouble(edittext5.getText().toString()) * area))));
						d.setPositiveButton("Back", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						d.create().show();
					}
					else {
						if (isTriangle) {
							d.setTitle("Square Feet Calculation");
							area = ((Double.parseDouble(edittext1.getText().toString()) + (Double.parseDouble(edittext2.getText().toString()) / 12)) * (Double.parseDouble(edittext3.getText().toString()) + (Double.parseDouble(edittext4.getText().toString()) / 12))) / 2;
							d.setMessage("Square Footage\n".concat(String.valueOf(area)).concat("\nTotal Cost\n$".concat(String.valueOf(Double.parseDouble(edittext5.getText().toString()) * area))));
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
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_bold.ttf"), 0);
		ls.add("Square/Rectangle Shape");
		ls.add("Circle Shape");
		ls.add("Triangle Shape");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, ls));
		((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
		spinner1.setSelection((int)(0));
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