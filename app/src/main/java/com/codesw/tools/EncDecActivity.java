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
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.content.ClipData;
import android.content.ClipboardManager;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class EncDecActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double position_number = 0;
	private String encrypted = "";
	private String decrypted = "";
	
	private LinearLayout linear1;
	private LinearLayout tablayout;
	private LinearLayout base;
	private LinearLayout trash;
	private LinearLayout main;
	private LinearLayout layout1;
	private LinearLayout layout2;
	private LinearLayout linear3;
	private TextInputLayout textinputlayout4;
	private Button button2;
	private LinearLayout linear4;
	private Button button3;
	private TextInputLayout textinputlayout5;
	private LinearLayout linear6;
	private EditText edittext3;
	private LinearLayout linear5;
	private EditText edittext4;
	private Button button5;
	private Button button4;
	private LinearLayout linear7;
	private TextInputLayout textinputlayout6;
	private TextInputLayout textinputlayout7;
	private Button button1;
	private EditText edittext5;
	private EditText edittext6;
	
	private SharedPreferences key;
	private AlertDialog.Builder d;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.enc_dec);
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
		tablayout = (LinearLayout) findViewById(R.id.tablayout);
		base = (LinearLayout) findViewById(R.id.base);
		trash = (LinearLayout) findViewById(R.id.trash);
		main = (LinearLayout) findViewById(R.id.main);
		layout1 = (LinearLayout) findViewById(R.id.layout1);
		layout2 = (LinearLayout) findViewById(R.id.layout2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textinputlayout4 = (TextInputLayout) findViewById(R.id.textinputlayout4);
		button2 = (Button) findViewById(R.id.button2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button3 = (Button) findViewById(R.id.button3);
		textinputlayout5 = (TextInputLayout) findViewById(R.id.textinputlayout5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		button5 = (Button) findViewById(R.id.button5);
		button4 = (Button) findViewById(R.id.button4);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textinputlayout6 = (TextInputLayout) findViewById(R.id.textinputlayout6);
		textinputlayout7 = (TextInputLayout) findViewById(R.id.textinputlayout7);
		button1 = (Button) findViewById(R.id.button1);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		edittext6 = (EditText) findViewById(R.id.edittext6);
		key = getSharedPreferences("key", Activity.MODE_PRIVATE);
		d = new AlertDialog.Builder(this);
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext4.getText().toString().length() == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "Please inset a KEY");
				}
				else {
					_encryptString(edittext3.getText().toString(), edittext4.getText().toString());
					d.setTitle("Encrypted Text");
					d.setMessage(encrypted);
					d.setPositiveButton("Copy", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", encrypted));
						}
					});
					d.create().show();
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_encryptString(String.valueOf((long)(SketchwareUtil.getRandom((int)(9999), (int)(999999)))), "key");
				edittext4.setText(encrypted);
				key.edit().putString("key", encrypted).commit();
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", edittext4.getText().toString()));
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext6.getText().toString().length() == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "Please inser a KEY");
				}
				else {
					_decryptString(edittext5.getText().toString(), edittext6.getText().toString());
					d.setTitle("Decrypted Text");
					d.setMessage(decrypted);
					d.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					d.create().show();
				}
			}
		});
	}
	
	private void initializeLogic() {
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
				return "ENCRYPT";
				
				case 1:
				return "DECRYPT";
				
				
				default:
				return null;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@Override public boolean isViewFromObject(View arg0, Object arg1) { return arg0 == ((View) arg1);} @Override public Parcelable saveState() { return null; } } androidx.viewpager.widget.ViewPager viewPager; com.google.android.material.tabs.TabLayout tabLayout; private void foo() {
		encrypted = "";
		decrypted = "";
		if (!key.getString("key", "").equals("")) {
			edittext4.setText(key.getString("key", ""));
		}
		else {
			_encryptString("key", "key");
			key.edit().putString("key", encrypted).commit();
			edittext4.setText(encrypted);
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
	
	public void _Elevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
	}
	
	
	public void _Encrypt_And_Decrypt () {
		
	}
	
	private javax.crypto.SecretKey generateKey(String pwd) throws Exception {
		
		final java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
		
		byte[] b = pwd.getBytes("UTF-8");
		
		digest.update(b,0,b.length);
		
		byte[] key = digest.digest();
		
		javax.crypto.spec.SecretKeySpec sec = new javax.crypto.spec.SecretKeySpec(key, "AES");
		
		return sec;
	}
	
	
	public void _encryptString (final String _string, final String _key) {
		try {
			javax.crypto.SecretKey key = generateKey(_key); 
			javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES"); 
			c.init(javax.crypto.Cipher.ENCRYPT_MODE, key); 
			byte[] encVal = c.doFinal(_string.getBytes());
			encrypted = android.util.Base64.encodeToString(encVal,android.util.Base64.DEFAULT);
		} catch (Exception ex) {
			
		}
	}
	
	
	public void _decryptString (final String _string, final String _key) {
		try {
			javax.crypto.spec.SecretKeySpec key = (javax.crypto.spec.SecretKeySpec) generateKey(_key);
			
			javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
			c.init(javax.crypto.Cipher.DECRYPT_MODE,key); 
			byte[] decode = android.util.Base64.decode(_string,android.util.Base64.DEFAULT); 
			byte[] decval = c.doFinal(decode);
			decrypted = new String(decval); 
		} catch (Exception ex) {
			showMessage(String.valueOf(ex));
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