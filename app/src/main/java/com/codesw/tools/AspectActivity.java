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
import com.google.android.material.textfield.*;
import com.google.android.material.button.*;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.AdapterView;
import android.view.View;
import android.graphics.Typeface;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class AspectActivity extends  AppCompatActivity  { 
	
	
	private double ratioY = 0;
	private double ratioX = 0;
	private double paramX = 0;
	private double paramY = 0;
	private String sub_str = "";
	private String sub_str2 = "";
	
	private ArrayList<String> sub = new ArrayList<>();
	private ArrayList<String> sub2 = new ArrayList<>();
	private ArrayList<String> ratios_num = new ArrayList<>();
	private ArrayList<String> params_num = new ArrayList<>();
	private ArrayList<String> ratios = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear3;
	private LinearLayout linear7;
	private LinearLayout linear5;
	private TextInputLayout textinputlayout3;
	private MaterialButton materialbutton2;
	private TextInputLayout textinputlayout4;
	private MaterialButton materialbutton1;
	private Spinner spinner1;
	private LinearLayout linear6;
	private TextView textview2;
	private EditText edittext1;
	private EditText edittext2;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.aspect);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textinputlayout3 = (TextInputLayout) findViewById(R.id.textinputlayout3);
		materialbutton2 = (MaterialButton) findViewById(R.id.materialbutton2);
		textinputlayout4 = (TextInputLayout) findViewById(R.id.textinputlayout4);
		materialbutton1 = (MaterialButton) findViewById(R.id.materialbutton1);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview2 = (TextView) findViewById(R.id.textview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Input can't be empty");
				}
				else {
					edittext2.setText(String.valueOf((long)((ratioY / ratioX) * Double.parseDouble(edittext1.getText().toString()))));
				}
			}
		});
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext2.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Input can't be empty");
				}
				else {
					edittext1.setText(String.valueOf((long)((ratioX / ratioY) * Double.parseDouble(edittext2.getText().toString()))));
				}
			}
		});
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				sub.clear();
				sub2.clear();
				sub_str = ratios_num.get((int)(_position));
				sub_str2 = params_num.get((int)(_position));
				textview2.setText("Example ".concat(sub_str));
				/*
*/
				String [] sub_arr = sub_str.split (":");
				sub.addAll(Arrays.asList(sub_arr));
				
				String [] sub_arr2 = sub_str2.split (":");
				sub2.addAll(Arrays.asList(sub_arr2));
				ratioX = Double.parseDouble(sub.get((int)(0)));
				ratioY = Double.parseDouble(sub.get((int)(1)));
				paramX = Double.parseDouble(sub2.get((int)(0)));
				paramY = Double.parseDouble(sub2.get((int)(1)));
				_LayoutParams(linear6, SketchwareUtil.getDip(getApplicationContext(), (int)(paramX)), SketchwareUtil.getDip(getApplicationContext(), (int)(paramY)));
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		_roundedCorners(linear3, 35, 35, 0, 0, "#FFFFFF", 0, "#000000", 0, "");
		_RoundAndBorder(linear7, "#FFFFFF", 3, "#9D26B0", 8);
		_RoundAndBorder(linear6, "#FFFFFF", 3, "#000000", 5);
		textinputlayout3.setBoxCornerRadii(5, 5, 5, 5);
		textinputlayout4.setBoxCornerRadii(5, 5, 5, 5);
		_items();
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, ratios));
		((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_regular.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/product_regular.ttf"), 0);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _roundedCorners (final View _view, final double _one, final double _two, final double _three, final double _four, final String _color, final double _stroke, final String _stColor, final double _num, final String _NOTES) {
		Double left_top = _one;
		Double right_top = _two;
		Double right_bottom = _three;
		Double left_bottom = _four;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {left_top.floatValue(),left_top.floatValue(), right_top.floatValue(),right_top.floatValue(), left_bottom.floatValue(),left_bottom.floatValue(), right_bottom.floatValue(),right_bottom.floatValue()});
		s.setColor(Color.parseColor(_color));
		s.setStroke((int)_stroke, Color.parseColor(_stColor));
		_view.setBackground(s);
		_view.setElevation((int)_num);
	}
	
	
	public void _RoundAndBorder (final View _view, final String _color1, final double _border, final String _color2, final double _round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setCornerRadius((int) _round);
		gd.setStroke((int) _border, Color.parseColor(_color2));
		_view.setBackground(gd);
	}
	
	
	public void _items () {
		String [] ratios_arr = {"7680 x 4320 (8K UHDTV)", "5120 x 2880 (5K, iMac with retina screen)", "3840 x 2160 (4K UHDTV)", "2048 x 1536 (iPad with retina screen)", "1920 x 1200 (Widescreen computer monitor)", " 1920 x 1080 (HD TV, iPhone 6 plus)", "1334 x 750 (iPhone 6)", "1200 x 630 (Facebook)", "1136 x 640 (iPhone 5 screen)", "1024 x 768 (iPad)", "1024 x 512 (Twitter)", "960 x 640 (iPhone 4 screen)", "800 x 600", "728 x 90 (Common web banner ad size)", "720 x 486 (PAL)", "640 x 480 (VGA)", "576 x 486 (NTSC)", "320 x 480 (HVGA)"};
		ratios.addAll(Arrays.asList(ratios_arr));
		String [] ratios_num_arr = {"16:9", "16:9", "16:9", "4:3", "8:5", "16:9", "667:375", "40:21", "71:40", "4:3", "2:1", "3:2", "4:3", "364:45", "40:27", "4:3", "32:27", "2:3"};
		ratios_num.addAll(Arrays.asList(ratios_num_arr));
		String [] params_num_arr = {"160:90", "160:90", "160:90", "120:90", "144:90", "160:90", "167:94", "160:48", "142:80", "120:90", "180:90", "180:120", "120:90", "300:50", "150:100", "120:90", "150:130", "120:180"};
		params_num.addAll(Arrays.asList(params_num_arr));
	}
	
	
	public void _LayoutParams (final View _view, final double _width, final double _height) {
		_view.setLayoutParams(new LinearLayout.LayoutParams((int)_width,(int) _height));
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