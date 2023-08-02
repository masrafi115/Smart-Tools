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
import com.google.android.material.textfield.*;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.view.View;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class NumberbaseActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ArrayList<String> stl = new ArrayList<>();
	
	private LinearLayout linear2;
	private CardView cardview1;
	private CardView cardview4;
	private MaterialButton materialbutton1;
	private LinearLayout linear1;
	private TextInputLayout textinputlayout5;
	private Spinner spinner1;
	private EditText edittext1;
	private LinearLayout linear5;
	private TextInputLayout textinputlayout8;
	private Spinner spinner2;
	private EditText edittext2;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.numberbase);
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
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		materialbutton1 = (MaterialButton) findViewById(R.id.materialbutton1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textinputlayout5 = (TextInputLayout) findViewById(R.id.textinputlayout5);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textinputlayout8 = (TextInputLayout) findViewById(R.id.textinputlayout8);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (spinner1.getSelectedItemPosition() == 0) {
					_decimalTo();
				}
				if (spinner1.getSelectedItemPosition() == 1) {
					_binaryTo();
				}
				if (spinner1.getSelectedItemPosition() == 2) {
					_octalTo();
				}
				if (spinner1.getSelectedItemPosition() == 3) {
					_hexaTo();
				}
			}
		});
	}
	
	private void initializeLogic() {
		stl.add("Decimal - Base 10");
		stl.add("Binary - Base 2");
		stl.add("Octal - Base 8");
		stl.add("Hexadecimal - Base 16");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, stl));
		spinner2.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, stl));
		((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
		((ArrayAdapter)spinner2.getAdapter()).notifyDataSetChanged();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _decimalTo () {
		int i = Integer.parseInt(edittext1.getText().toString(), 10);
		if (spinner2.getSelectedItemPosition() == 0) {
			edittext2.setText(Integer.valueOf(i).toString());
		}
		if (spinner2.getSelectedItemPosition() == 1) {
			edittext2.setText(Integer.toBinaryString(i));
		}
		if (spinner2.getSelectedItemPosition() == 2) {
			edittext2.setText(Integer.toOctalString(i));
		}
		if (spinner2.getSelectedItemPosition() == 3) {
			edittext2.setText(Integer.toHexString(i));
		}
	}
	
	
	public void _binaryTo () {
		int i = Integer.parseInt(edittext1.getText().toString(), 2);
		if (spinner2.getSelectedItemPosition() == 0) {
			edittext2.setText(Integer.valueOf(i).toString());
		}
		if (spinner2.getSelectedItemPosition() == 1) {
			edittext2.setText((Integer.valueOf(Integer.parseInt(edittext1.getText().toString(), 10)).toString()));
		}
		if (spinner2.getSelectedItemPosition() == 2) {
			edittext2.setText(Integer.toOctalString(i));
		}
		if (spinner2.getSelectedItemPosition() == 3) {
			edittext2.setText(Integer.toHexString(i));
		}
	}
	
	
	public void _octalTo () {
		int i = Integer.parseInt(edittext1.getText().toString(), 8);
		if (spinner2.getSelectedItemPosition() == 0) {
			edittext2.setText(Integer.valueOf(i).toString());
		}
		if (spinner2.getSelectedItemPosition() == 1) {
			edittext2.setText(Integer.toBinaryString(i));
		}
		if (spinner2.getSelectedItemPosition() == 2) {
			edittext2.setText((Integer.valueOf(Integer.parseInt(edittext1.getText().toString(), 10)).toString()));
		}
		if (spinner2.getSelectedItemPosition() == 3) {
			edittext2.setText(Integer.toHexString(i));
		}
	}
	
	
	public void _hexaTo () {
		int i = Integer.parseInt(edittext1.getText().toString());
		if (spinner2.getSelectedItemPosition() == 0) {
			edittext2.setText(Integer.valueOf(i).toString());
		}
		if (spinner2.getSelectedItemPosition() == 1) {
			edittext2.setText(Integer.toBinaryString(i));
		}
		if (spinner2.getSelectedItemPosition() == 2) {
			edittext2.setText(Integer.toOctalString(i));
		}
		if (spinner2.getSelectedItemPosition() == 3) {
			edittext2.setText((Integer.valueOf(Integer.parseInt(edittext1.getText().toString(), 10)).toString()));
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