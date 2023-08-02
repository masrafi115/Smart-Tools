package com.codesw.tools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.AdapterView;
import android.content.ClipData;
import android.content.ClipboardManager;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class CaseConvertActivity extends  AppCompatActivity  { 
	
	
	private boolean upper = false;
	private boolean lower = false;
	private boolean title = false;
	private boolean sentence = false;
	
	private ArrayList<String> cases = new ArrayList<>();
	
	private LinearLayout linear5;
	private LinearLayout toolbar;
	private ScrollView vscroll4;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private TextView textview2;
	private LinearLayout linear7;
	private ImageView imageview4;
	private LinearLayout linear8;
	private Spinner spinner1;
	private HorizontalScrollView hscroll1;
	private ImageView imageview2;
	private EditText edittext1;
	private EditText edittext2;
	private ImageView imageview3;
	private Button button4;
	private Button button6;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.case_convert);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		toolbar = (LinearLayout) findViewById(R.id.toolbar);
		vscroll4 = (ScrollView) findViewById(R.id.vscroll4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		button4 = (Button) findViewById(R.id.button4);
		button6 = (Button) findViewById(R.id.button6);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
				((TextView) _param1.getChildAt(0)).setTextColor(Color.WHITE);
				((TextView) _param1.getChildAt(0)).setTextSize(20);
				
				
				if (_position == 0) {
					upper = true;
				}
				else {
					if (_position == 1) {
						lower = true;
					}
					else {
						if (_position == 2) {
							title = true;
						}
						else {
							sentence = true;
						}
					}
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext1.setText("");
				edittext2.setText("");
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", edittext2.getText().toString()));
				SketchwareUtil.showMessage(getApplicationContext(), "Text copied to clipboard. Long click to  Paste it anywhere");
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Input Something");
				}
				else {
					if (spinner1.getSelectedItemPosition() == 0) {
						edittext2.setText(edittext1.getText().toString().toUpperCase());
					}
					else {
						if (spinner1.getSelectedItemPosition() == 1) {
							edittext2.setText(edittext1.getText().toString().toLowerCase());
						}
						else {
							if (spinner1.getSelectedItemPosition() == 2) {
								edittext2.setText(_toTitleCase(edittext1.getText().toString()));
							}
							else {
								edittext2.setText(_toSentenceCase(edittext1.getText().toString()));
							}
						}
					}
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		_Elevation(toolbar, 4);
		_CardViews("#FFFFFFFF", 4, 4, linear2);
		_CardViews("#FFFFFFFF", 4, 4, linear3);
		edittext2.setEnabled(false);
		cases.add("Upper Case");
		cases.add("Lower Case");
		cases.add("Title Case");
		cases.add("Sentence Case");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, cases));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _Elevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
	}
	
	
	public void _CardViews (final String _color, final double _radius, final double _shadow, final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_radius);
		_view.setBackground(gd);
		
		try {
			if(Build.VERSION.SDK_INT >= 21) {
				_view.setElevation((int)_shadow);
			}
		} catch (Exception e) {}
	}
	
	
	public String _toSentenceCase (final String _str) {
		StringBuffer buffy = new StringBuffer(_str); // You may want to .toLowerCase() - up to you
		Pattern pattern = Pattern.compile("(^|\\.)\\s*(\\w)");
		Matcher matcher = pattern.matcher(buffy);
		while (matcher.find()){
				buffy.replace(matcher.end() - 1, matcher.end(), matcher.group(2).toUpperCase());
		}
		return buffy.toString();
		
	}
	
	
	public String _toTitleCase (final String _str) {
		StringBuilder titleCase = new StringBuilder(_str.length());
		boolean nextTitleCase = true;
		
		for (char c : _str.toCharArray()) {
				if (Character.isSpaceChar(c)) {
						nextTitleCase = true;
				} else if (nextTitleCase) {
						c = Character.toTitleCase(c);
						nextTitleCase = false;
				}
				
				titleCase.append(c);
		}
		
		return titleCase.toString();
		
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