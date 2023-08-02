package com.codesw.tools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private String erriggf = "";
	
	private LinearLayout linear1;
	private LinearLayout linear19;
	private ScrollView vscroll1;
	private ImageView imageview10;
	private TextView textview17;
	private LinearLayout scroll_linear;
	private LinearLayout horizontal2;
	private LinearLayout linear2;
	private LinearLayout linear6;
	private LinearLayout linear10;
	private LinearLayout linear38;
	private LinearLayout linear31;
	private LinearLayout linear45;
	private LinearLayout linear52;
	private LinearLayout linear26;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear20;
	private TextView textview10;
	private TextView textview23;
	private ImageView imageview12;
	private LinearLayout linear21;
	private TextView textview12;
	private ImageView imageview13;
	private LinearLayout linear22;
	private TextView textview13;
	private ImageView imageview14;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear14;
	private TextView textview14;
	private ImageView imageview6;
	private LinearLayout linear23;
	private TextView textview18;
	private ImageView imageview19;
	private LinearLayout linear24;
	private TextView textview19;
	private ImageView imageview20;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear25;
	private TextView textview26;
	private ImageView imageview15;
	private LinearLayout linear27;
	private TextView textview28;
	private ImageView imageview17;
	private LinearLayout linear30;
	private TextView textview21;
	private ImageView imageview18;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear18;
	private TextView textview16;
	private ImageView imageview7;
	private LinearLayout linear15;
	private TextView textview8;
	private ImageView imageview8;
	private LinearLayout linear16;
	private TextView textview9;
	private ImageView imageview9;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private LinearLayout linear42;
	private TextView textview32;
	private ImageView imageview24;
	private LinearLayout linear43;
	private TextView textview33;
	private ImageView imageview25;
	private LinearLayout linear44;
	private TextView textview34;
	private ImageView imageview26;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private TextView textview29;
	private ImageView imageview21;
	private LinearLayout linear36;
	private TextView textview30;
	private ImageView imageview22;
	private LinearLayout linear37;
	private TextView textview31;
	private ImageView imageview23;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private TextView textview35;
	private ImageView imageview27;
	private LinearLayout linear50;
	private TextView textview36;
	private ImageView imageview28;
	private LinearLayout linear51;
	private TextView textview37;
	private ImageView imageview29;
	private LinearLayout linear53;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private TextView textview38;
	private ImageView imageview30;
	private LinearLayout linear57;
	private TextView textview39;
	private ImageView imageview31;
	private LinearLayout linear58;
	private TextView textview40;
	private ImageView imageview32;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear3;
	private ImageView _drawer_imageview1;
	private LinearLayout _drawer_linear4;
	private TextView _drawer_textview1;
	private TextView _drawer_textview3;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear31;
	private LinearLayout _drawer_linear41;
	private LinearLayout _drawer_linear42;
	private TextView _drawer_textview5;
	private ImageView _drawer_imageview4;
	private TextView _drawer_textview8;
	private ImageView _drawer_imageview2;
	private TextView _drawer_textview6;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview9;
	
	private Intent i = new Intent();
	private Intent in = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		_drawer = (DrawerLayout) findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview17 = (TextView) findViewById(R.id.textview17);
		scroll_linear = (LinearLayout) findViewById(R.id.scroll_linear);
		horizontal2 = (LinearLayout) findViewById(R.id.horizontal2);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview23 = (TextView) findViewById(R.id.textview23);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview13 = (TextView) findViewById(R.id.textview13);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview14 = (TextView) findViewById(R.id.textview14);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		textview18 = (TextView) findViewById(R.id.textview18);
		imageview19 = (ImageView) findViewById(R.id.imageview19);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview26 = (TextView) findViewById(R.id.textview26);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		textview28 = (TextView) findViewById(R.id.textview28);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		textview21 = (TextView) findViewById(R.id.textview21);
		imageview18 = (ImageView) findViewById(R.id.imageview18);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		textview32 = (TextView) findViewById(R.id.textview32);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		textview33 = (TextView) findViewById(R.id.textview33);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		textview34 = (TextView) findViewById(R.id.textview34);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		textview29 = (TextView) findViewById(R.id.textview29);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		textview30 = (TextView) findViewById(R.id.textview30);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		textview31 = (TextView) findViewById(R.id.textview31);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		textview35 = (TextView) findViewById(R.id.textview35);
		imageview27 = (ImageView) findViewById(R.id.imageview27);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		textview37 = (TextView) findViewById(R.id.textview37);
		imageview29 = (ImageView) findViewById(R.id.imageview29);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		linear56 = (LinearLayout) findViewById(R.id.linear56);
		textview38 = (TextView) findViewById(R.id.textview38);
		imageview30 = (ImageView) findViewById(R.id.imageview30);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		textview39 = (TextView) findViewById(R.id.textview39);
		imageview31 = (ImageView) findViewById(R.id.imageview31);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		textview40 = (TextView) findViewById(R.id.textview40);
		imageview32 = (ImageView) findViewById(R.id.imageview32);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_imageview1 = (ImageView) _nav_view.findViewById(R.id.imageview1);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_linear31 = (LinearLayout) _nav_view.findViewById(R.id.linear31);
		_drawer_linear41 = (LinearLayout) _nav_view.findViewById(R.id.linear41);
		_drawer_linear42 = (LinearLayout) _nav_view.findViewById(R.id.linear42);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		_drawer_imageview4 = (ImageView) _nav_view.findViewById(R.id.imageview4);
		_drawer_textview8 = (TextView) _nav_view.findViewById(R.id.textview8);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_textview6 = (TextView) _nav_view.findViewById(R.id.textview6);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_textview9 = (TextView) _nav_view.findViewById(R.id.textview9);
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
			}
		});
		
		linear26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CaseConvertActivity.class);
				startActivity(i);
			}
		});
		
		linear28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), TextToSpeechActivity.class);
				startActivity(i);
			}
		});
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CarActivity.class);
				startActivity(i);
			}
		});
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SquarefeetActivity.class);
				startActivity(i);
			}
		});
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), NumberbaseActivity.class);
				startActivity(i);
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), GoldPriceActivity.class);
				startActivity(i);
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), BatteryInfoActivity.class);
				startActivity(i);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), DateCalculateActivity.class);
				startActivity(i);
			}
		});
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), EncDecActivity.class);
				startActivity(i);
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), BmiCalculateActivity.class);
				startActivity(i);
			}
		});
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PreCombActivity.class);
				i.putExtra("key", "premutation");
				startActivity(i);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PreCombActivity.class);
				i.putExtra("key", "combination");
				startActivity(i);
			}
		});
		
		linear39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), RandomActivity.class);
				startActivity(i);
			}
		});
		
		linear40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AspectActivity.class);
				startActivity(i);
			}
		});
		
		linear41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MagnifierActivity.class);
				startActivity(i);
			}
		});
		
		linear32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), TimerCounterActivity.class);
				i.putExtra("keys", "timer");
				startActivity(i);
			}
		});
		
		linear33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), TimerCounterActivity.class);
				i.putExtra("keys", "counter");
				startActivity(i);
			}
		});
		
		linear34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CompFlashActivity.class);
				startActivity(i);
			}
		});
		
		linear46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), EquationActivity.class);
				i.putExtra("type", "linear");
				startActivity(i);
			}
		});
		
		linear47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), EquationActivity.class);
				i.putExtra("type", "quad");
				startActivity(i);
			}
		});
		
		linear48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), EquationActivity.class);
				i.putExtra("type", "cube");
				startActivity(i);
			}
		});
		
		linear53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), TimeutilsActivity.class);
				startActivity(i);
			}
		});
		
		linear54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PeriodicTableActivity.class);
				startActivity(i);
			}
		});
		
		linear55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), UnitConverterActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_linear31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				android.graphics.drawable.RippleDrawable ripdr3 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor("#CFD8DC")}), new android.graphics.drawable.ColorDrawable(Color.WHITE), null);
				
				LinearLayout lin3 = (LinearLayout)
				_drawer.findViewById(R.id.linear31);
				
				lin3.setBackground(ripdr3);
			}
		});
		
		_drawer_linear41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MagnifierActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_linear42.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				android.graphics.drawable.RippleDrawable ripdr3 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor("#CFD8DC")}), new android.graphics.drawable.ColorDrawable(Color.WHITE), null);
				
				LinearLayout lin3 = (LinearLayout)
				_drawer.findViewById(R.id.linear42);
				
				lin3.setBackground(ripdr3);
			}
		});
	}
	
	private void initializeLogic() {
		_ActionBarHide();
		_setDrawerWidth(250);
		_views();
		_Radius();
		_DrawerTypeface();
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
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	public void _gd (final View _view, final double _numb, final String _color) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_numb);
		_view.setBackground(gd);
	}
	
	
	public void _Elevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
	}
	
	
	public void _Radius () {
		_gd(linear20, 90, "#FFE6E6E6");
		_gd(linear21, 90, "#FFE6E6E6");
		_gd(linear22, 90, "#FFE6E6E6");
		_gd(linear23, 90, "#FFE6E6E6");
		_gd(linear24, 90, "#FFE6E6E6");
		_gd(linear14, 90, "#FFE6E6E6");
		_gd(linear25, 90, "#FFE6E6E6");
		_gd(linear27, 90, "#FFE6E6E6");
		_gd(linear30, 90, "#FFE6E6E6");
		_gd(linear15, 90, "#FFE6E6E6");
		_gd(linear16, 90, "#FFE6E6E6");
		_gd(linear18, 90, "#FFE6E6E6");
		_gd(linear35, 90, "#FFE6E6E6");
		_gd(linear36, 90, "#FFE6E6E6");
		_gd(linear37, 90, "#FFE6E6E6");
		_gd(linear42, 90, "#FFE6E6E6");
		_gd(linear43, 90, "#FFE6E6E6");
		_gd(linear44, 90, "#FFE6E6E6");
		_gd(linear49, 90, "#FFE6E6E6");
		_gd(linear50, 90, "#FFE6E6E6");
		_gd(linear51, 90, "#FFE6E6E6");
		_gd(linear56, 90, "#FFE6E6E6");
		_gd(linear57, 90, "#FFE6E6E6");
		_gd(linear58, 90, "#FFE6E6E6");
	}
	
	
	public void _views () {
		_Elevation(linear11, 3);
		_gd(linear12, 8, "#FFFFFF");
		_Elevation(linear12, 3);
		_gd(linear13, 8, "#FFFFFF");
		_Elevation(linear13, 3);
		_Elevation(linear19, 4);
		_gd(linear26, 8, "#FFFFFFFF");
		_Elevation(linear26, 3);
		_gd(linear28, 8, "#FFFFFFFF");
		_Elevation(linear28, 3);
		_gd(linear29, 8, "#FFFFFFFF");
		_Elevation(linear29, 3);
		_gd(linear3, 8, "#FFFFFFFF");
		_Elevation(linear3, 3);
		_gd(linear4, 8, "#FFFFFFFF");
		_Elevation(linear4, 3);
		_gd(linear5, 8, "#FFFFFFFF");
		_Elevation(linear5, 3);
		_gd(linear7, 8, "#FFFFFFFF");
		_Elevation(linear7, 3);
		_gd(linear8, 8, "#FFFFFFFF");
		_Elevation(linear8, 3);
		_gd(linear9, 8, "#FFFFFFFF");
		_Elevation(linear9, 3);
		_gd(linear32, 8, "#FFFFFFFF");
		_Elevation(linear32, 3);
		_gd(linear33, 8, "#FFFFFFFF");
		_Elevation(linear33, 3);
		_gd(linear34, 8, "#FFFFFFFF");
		_Elevation(linear34, 3);
		_gd(linear39, 8, "#FFFFFFFF");
		_Elevation(linear39, 3);
		_gd(linear40, 8, "#FFFFFFFF");
		_Elevation(linear40, 3);
		_gd(linear41, 8, "#FFFFFFFF");
		_Elevation(linear41, 3);
		_gd(linear46, 8, "#FFFFFFFF");
		_Elevation(linear46, 3);
		_gd(linear47, 8, "#FFFFFFFF");
		_Elevation(linear47, 3);
		_gd(linear48, 8, "#FFFFFFFF");
		_Elevation(linear48, 3);
		_gd(linear53, 8, "#FFFFFFFF");
		_Elevation(linear53, 3);
		_gd(linear54, 8, "#FFFFFFFF");
		_Elevation(linear54, 3);
		_gd(linear55, 8, "#FFFFFFFF");
		_Elevation(linear55, 3);
	}
	
	
	public void _ActionBarHide () {
		getSupportActionBar().hide();
	}
	
	
	public void _setDrawerWidth (final double _num) {
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		_nav_view.setBackgroundColor(Color.parseColor("#FFFFFF"));
		
		androidx.drawerlayout.widget.DrawerLayout.LayoutParams params = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams)_nav_view.getLayoutParams();
		
		params.width = (int)getDip((int)_num);
		
		params.height = androidx.drawerlayout.widget.DrawerLayout.LayoutParams.MATCH_PARENT;
		
		_nav_view.setLayoutParams(params);
	}
	
	
	public void _click_effect (final View _view, final String _c) {
		_view.setBackground(Drawables.getSelectableDrawableFor(Color.parseColor(_c)));
		_view.setClickable(true);
		
	}
	
	public static class Drawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[8];
			        Arrays.fill(outerRadii, 0);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
			    }
	}
	public static class CircleDrawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[180];
			        Arrays.fill(outerRadii, 80);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
		}
	}
	
	public void drawableclass() {
	}
	
	
	public void _DrawerTypeface () {
		_drawer_textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/gbold.ttf"),0);
		_drawer_textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/gbold.ttf"),0);
		_drawer_textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/gbold.ttf"),0);
		_drawer_textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/gbold.ttf"),0);
		_drawer_textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/gbold.ttf"),0);
		_drawer_textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/gbold.ttf"),0);
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