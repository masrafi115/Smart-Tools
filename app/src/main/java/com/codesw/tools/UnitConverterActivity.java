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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import android.content.ClipData;
import android.content.ClipboardManager;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class UnitConverterActivity extends  AppCompatActivity  { 
	
	
	private String val = "";
	private String fontName = "";
	private String typeace = "";
	private double result = 0;
	private double from = 0;
	private double to = 0;
	private double num = 0;
	private String str = "";
	private double factor = 0;
	private String str2 = "";
	
	private ArrayList<String> data = new ArrayList<>();
	private ArrayList<String> sign = new ArrayList<>();
	private ArrayList<Double> list = new ArrayList<>();
	
	private LinearLayout main_root;
	private LinearLayout toolbar;
	private LinearLayout main_conv_layout;
	private LinearLayout top_pad;
	private LinearLayout main_dpad;
	private ImageView imageview6;
	private TextView textview1;
	private ImageView imageview7;
	private LinearLayout conv_layout_first;
	private LinearLayout div;
	private LinearLayout conv_layout_second;
	private LinearLayout linear32;
	private LinearLayout linear31;
	private TextView textview15;
	private EditText edittext1;
	private TextView textview16;
	private TextView textview17;
	private ImageView imageview10;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private TextView textview23;
	private EditText edittext3;
	private TextView textview21;
	private TextView textview22;
	private ImageView imageview12;
	private ImageView imageview1;
	private ImageView share;
	private ImageView swap;
	private ImageView del;
	private LinearLayout dpad;
	private LinearLayout sidepad;
	private LinearLayout linear11;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout num_1;
	private LinearLayout num_2;
	private LinearLayout num_3;
	private TextView textview2;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout num_4;
	private LinearLayout num_5;
	private LinearLayout num_6;
	private TextView textview7;
	private TextView textview4;
	private TextView textview8;
	private LinearLayout num_7;
	private LinearLayout num_8;
	private LinearLayout num_9;
	private TextView textview9;
	private TextView textview3;
	private TextView textview11;
	private LinearLayout plus_minus;
	private LinearLayout num_0;
	private LinearLayout point;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private ImageView clear;
	private LinearLayout linear9;
	private ImageView copy;
	
	private Intent i = new Intent();
	private SharedPreferences unit;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.unit_converter);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		main_root = (LinearLayout) findViewById(R.id.main_root);
		toolbar = (LinearLayout) findViewById(R.id.toolbar);
		main_conv_layout = (LinearLayout) findViewById(R.id.main_conv_layout);
		top_pad = (LinearLayout) findViewById(R.id.top_pad);
		main_dpad = (LinearLayout) findViewById(R.id.main_dpad);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview1 = (TextView) findViewById(R.id.textview1);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		conv_layout_first = (LinearLayout) findViewById(R.id.conv_layout_first);
		div = (LinearLayout) findViewById(R.id.div);
		conv_layout_second = (LinearLayout) findViewById(R.id.conv_layout_second);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		textview15 = (TextView) findViewById(R.id.textview15);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		textview23 = (TextView) findViewById(R.id.textview23);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview22 = (TextView) findViewById(R.id.textview22);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		share = (ImageView) findViewById(R.id.share);
		swap = (ImageView) findViewById(R.id.swap);
		del = (ImageView) findViewById(R.id.del);
		dpad = (LinearLayout) findViewById(R.id.dpad);
		sidepad = (LinearLayout) findViewById(R.id.sidepad);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		num_1 = (LinearLayout) findViewById(R.id.num_1);
		num_2 = (LinearLayout) findViewById(R.id.num_2);
		num_3 = (LinearLayout) findViewById(R.id.num_3);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		num_4 = (LinearLayout) findViewById(R.id.num_4);
		num_5 = (LinearLayout) findViewById(R.id.num_5);
		num_6 = (LinearLayout) findViewById(R.id.num_6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview8 = (TextView) findViewById(R.id.textview8);
		num_7 = (LinearLayout) findViewById(R.id.num_7);
		num_8 = (LinearLayout) findViewById(R.id.num_8);
		num_9 = (LinearLayout) findViewById(R.id.num_9);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview11 = (TextView) findViewById(R.id.textview11);
		plus_minus = (LinearLayout) findViewById(R.id.plus_minus);
		num_0 = (LinearLayout) findViewById(R.id.num_0);
		point = (LinearLayout) findViewById(R.id.point);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		clear = (ImageView) findViewById(R.id.clear);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		copy = (ImageView) findViewById(R.id.copy);
		unit = getSharedPreferences("unit", Activity.MODE_PRIVATE);
		
		linear31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PickUnitActivity.class);
				i.putExtra("key", "1st");
				startActivity(i);
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				result = Double.parseDouble(_charSeq) * factor;
				edittext3.setText(_bigDecimalPrint(result));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		linear38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PickUnitActivity.class);
				i.putExtra("key", "2nd");
				startActivity(i);
			}
		});
		
		share.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		swap.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				num = to;
				to = from;
				from = num;
				_getArray(from);
				str = textview21.getText().toString();
				textview21.setText(textview16.getText().toString());
				textview16.setText(str);
				str2 = textview17.getText().toString();
				textview17.setText(textview22.getText().toString());
				textview22.setText(str2);
				factor = list.get((int)(to)).doubleValue();
				result = Double.parseDouble(edittext1.getText().toString()) * factor;
				edittext3.setText(_bigDecimalPrint(result));
			}
		});
		
		del.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!val.equals("")) {
					if (val.length() < 2) {
						val = "0";
						edittext1.setText(val);
					}
					else {
						val = val.substring((int)(0), (int)(val.length() - 1));
						edittext1.setText(val);
					}
				}
			}
		});
		
		del.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View v){
				val = "0";
				edittext1.setText(val);
				
				return false;
			}
		});
		
		num_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("1");
				_setRipple(num_1);
			}
		});
		
		num_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("2");
				_setRipple(num_2);
			}
		});
		
		num_3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("3");
				_setRipple(num_3);
			}
		});
		
		num_4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("4");
				_setRipple(num_4);
			}
		});
		
		num_5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("5");
				_setRipple(num_5);
			}
		});
		
		num_6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("6");
				_setRipple(num_6);
			}
		});
		
		num_7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("7");
				_setRipple(num_7);
			}
		});
		
		num_8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("8");
				_setRipple(num_8);
			}
		});
		
		num_9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("9");
				_setRipple(num_9);
			}
		});
		
		num_0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_addchar("0");
				_setRipple(num_0);
			}
		});
		
		clear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				val = "0";
				edittext1.setText(val);
			}
		});
		
		copy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", edittext3.getText().toString()));
				SketchwareUtil.showMessage(getApplicationContext(), "Copied");
			}
		});
	}
	
	private void initializeLogic() {
		from = 0;
		to = 1;
		val = "1";
		_array();
		imageview1.setColorFilter(0xFF727272, PorterDuff.Mode.MULTIPLY);
		share.setColorFilter(0xFF727272, PorterDuff.Mode.MULTIPLY);
		swap.setColorFilter(0xFF727272, PorterDuff.Mode.MULTIPLY);
		del.setColorFilter(0xFF727272, PorterDuff.Mode.MULTIPLY);
		clear.setColorFilter(0xFF727272, PorterDuff.Mode.MULTIPLY);
		copy.setColorFilter(0xFF727272, PorterDuff.Mode.MULTIPLY);
		edittext1.setEnabled(false);
		edittext3.setEnabled(false);
		_changeActivityFont("product_bold");
		textview16.setText(data.get((int)(0)));
		textview21.setText(data.get((int)(1)));
		textview17.setText(sign.get((int)(0)));
		textview22.setText(sign.get((int)(1)));
		_getArray(from);
		factor = list.get((int)(1)).doubleValue();
		edittext3.setText(_bigDecimalPrint(factor * Double.parseDouble(edittext1.getText().toString())));
		textview16.setText(data.get((int)(from)));
		textview17.setText(sign.get((int)(from)));
		textview21.setText(data.get((int)(to)));
		textview22.setText(sign.get((int)(to)));
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
		if (!unit.getString("From", "").equals("")) {
			from = Double.parseDouble(unit.getString("From", ""));
			unit.edit().remove("From").commit();
			_getArray(from);
			factor = list.get((int)(to)).doubleValue();
			edittext3.setText(_bigDecimalPrint(factor * Double.parseDouble(edittext1.getText().toString())));
			textview16.setText(data.get((int)(from)));
			textview17.setText(sign.get((int)(from)));
		}
		if (!unit.getString("To", "").equals("")) {
			to = Double.parseDouble(unit.getString("To", ""));
			unit.edit().remove("To").commit();
			factor = list.get((int)(to)).doubleValue();
			edittext3.setText(_bigDecimalPrint(factor * Double.parseDouble(edittext1.getText().toString())));
			textview21.setText(data.get((int)(to)));
			textview22.setText(sign.get((int)(to)));
		}
	}
	public void _array () {
		data.addAll(Arrays.asList(ArrayUtils.length_arr_data));
		sign.addAll(Arrays.asList(ArrayUtils.length_arr_sign));
	}
	
	
	public void _getArray (final double _n) {
		list.clear();
		data.clear();
		sign.clear();
		double [] dbl = ArrayUtils.length_arr[(int)_n];
		for(double d : dbl) 
			list.add(d);
		data.addAll(Arrays.asList(ArrayUtils.length_arr_data));
		sign.addAll(Arrays.asList(ArrayUtils.length_arr_sign));
	}
	
	
	public void _addchar (final String _charac) {
		if (val.equals("0")) {
			val = _charac;
			edittext1.setText(val);
		}
		else {
			val = val.concat(_charac);
			edittext1.setText(val);
		}
	}
	
	
	public void _setRipple (final View _view) {
		TypedValue typedValue = new TypedValue();
		
		getApplicationContext().getTheme().resolveAttribute(16843868, typedValue, true);
		
		_view.setBackgroundResource(typedValue.resourceId);
		
		_view.setClickable(true);
	}
	
	
	public String _bigDecimalPrint (final double _num) {
		return String.format(" %.3f",Double.parseDouble(new java.math.BigDecimal(_num).setScale(3, java.math.RoundingMode.DOWN).toPlainString()));
		//return String.format(" %.3f",new java.math.BigDecimal(_num).setScale(3, RoundingMode.DOWN).toPlainString());
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