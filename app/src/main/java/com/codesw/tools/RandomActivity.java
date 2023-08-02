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
import android.widget.EditText;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class RandomActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double position_number = 0;
	
	private LinearLayout linear5;
	private LinearLayout tablayout;
	private LinearLayout base;
	private LinearLayout trash;
	private LinearLayout main;
	private LinearLayout layout1;
	private LinearLayout layout2;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private TextView textview3;
	private EditText edittext1;
	private TextView textview4;
	private EditText edittext2;
	private TextView textview5;
	private Button button3;
	private Button button4;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear3;
	private CheckBox num;
	private LinearLayout linear10;
	private TextView textview1;
	private EditText max_length;
	private TextView textview2;
	private Button button1;
	private Button button2;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.random);
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
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		tablayout = (LinearLayout) findViewById(R.id.tablayout);
		base = (LinearLayout) findViewById(R.id.base);
		trash = (LinearLayout) findViewById(R.id.trash);
		main = (LinearLayout) findViewById(R.id.main);
		layout1 = (LinearLayout) findViewById(R.id.layout1);
		layout2 = (LinearLayout) findViewById(R.id.layout2);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview3 = (TextView) findViewById(R.id.textview3);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview4 = (TextView) findViewById(R.id.textview4);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview5 = (TextView) findViewById(R.id.textview5);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		num = (CheckBox) findViewById(R.id.num);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview1 = (TextView) findViewById(R.id.textview1);
		max_length = (EditText) findViewById(R.id.max_length);
		textview2 = (TextView) findViewById(R.id.textview2);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview5.setText(String.valueOf((long)(SketchwareUtil.getRandom((int)(Double.parseDouble(edittext1.getText().toString())), (int)(Double.parseDouble(edittext2.getText().toString()))))));
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview5.setText("");
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					String pass = generateRandomPassword(Integer.parseInt(max_length.getText().toString()), true , true , num.isChecked(), false);
					
					textview2.setText(pass);
				}catch (java.lang.Exception e){
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview2.setText("");
				max_length.setText("");
			}
		});
	}
	
	private void initializeLogic() {
		_PassLogic();
		_Elevation(tablayout, 5);
		com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) _toolbar.getParent();
		appBarLayout.setStateListAnimator(null);
		viewPager = new androidx.viewpager.widget.ViewPager(this); viewPager.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)); MyPagerAdapter adapter = new MyPagerAdapter(); viewPager.setAdapter(adapter); viewPager.setCurrentItem(0); 
		
		base.
		
		addView(viewPager); viewPager.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() { public void onPageSelected(int position) { position_number = position; 
			} @Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) { } @Override public void onPageScrollStateChanged(int state) { } }); tabLayout = new com.google.android.material.tabs.TabLayout(this); tabLayout.setTabGravity(tabLayout.GRAVITY_FILL); tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF")); tabLayout.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF")); tabLayout.setSelectedTabIndicatorHeight(5);
		
		 tabLayout.setupWithViewPager(viewPager); tablayout.addView(tabLayout); } private class MyPagerAdapter extends androidx.viewpager.widget.PagerAdapter { public int getCount() { return
			
			 2
			
			
			
			; } @Override public Object instantiateItem(ViewGroup collection, int position)
		
		
		 {
			
			LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View v = inflater.inflate(R.layout.empty, null);
			
			LinearLayout container = (LinearLayout) v.findViewById(R.id.linear1);
			
			if (position == 0) {
				ViewGroup parent = (ViewGroup) layout1.getParent();
				if (parent != null) {
					parent.removeView(layout1);
				}container.addView(layout1);}
			
			
			
			else if (position == 1) {
				ViewGroup parent = (ViewGroup) layout2.getParent();
				if (parent != null) {
					parent.removeView(layout2);
				}container.addView(layout2);}
			
			
			
			
			collection.addView(v, 0);
			return v;
		}
		@Override public void destroyItem(ViewGroup collection, int position, Object view) {
			collection.removeView((View) view);
			trash.addView((View) view);
		}
		@Override public CharSequence getPageTitle(int position) {
			switch (position) {
				
				
				
				
				
				case 0:
				return "NUMBERS";
				
				case 1:
				return "PASSWORD";
				
				
				default:
				return null;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@Override public boolean isViewFromObject(View arg0, Object arg1) { return arg0 == ((View) arg1);} @Override public Parcelable saveState() { return null; } } androidx.viewpager.widget.ViewPager viewPager; com.google.android.material.tabs.TabLayout tabLayout; private void foo() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _PassLogic () {
	} 
	private static String generateRandomPassword(int max_length, boolean upperCase, boolean lowerCase, boolean numbers, boolean specialCharacters)
	{ 
		    String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
		    String numberChars = "0123456789";
		    String specialChars = "!@#$%^&*()_-+=<>?/{}~|";
		    String allowedChars = "";
		
		    Random rn = new Random();
		    StringBuilder sb = new StringBuilder(max_length);
		/*code by Developer Partha*/
		    //this will fulfill the requirements of atleast one character of a type.
		    if(upperCase) {
			        allowedChars += upperCaseChars;
			        sb.append(upperCaseChars.charAt(rn.nextInt(upperCaseChars.length()-1)));
			    }
		
		    if(lowerCase) {
			        allowedChars += lowerCaseChars;
			        sb.append(lowerCaseChars.charAt(rn.nextInt(lowerCaseChars.length()-1)));
			    }
		
		    if(numbers) {
			        allowedChars += numberChars;
			       /*code by Developer Partha*/ sb.append(numberChars.charAt(rn.nextInt(numberChars.length()-1)));
			    }
		
		    if(specialCharacters) {
			        allowedChars += specialChars;
			        sb.append(specialChars.charAt(rn.nextInt(specialChars.length()-1)));
			    }
		
		
		    //fill the allowed length from different chars now.
		    for(int i=sb.length();i < max_length;++i){
			       /*code by Developer Partha*/ sb.append(allowedChars.charAt(rn.nextInt(allowedChars.length())));
			    }
		
		    return  sb.toString();
	}
	{
	}
	
	
	public void _Elevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
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