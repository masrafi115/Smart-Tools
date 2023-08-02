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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PeriodicTableActivity extends  AppCompatActivity  { 
	
	
	private HashMap<String, Object> map = new HashMap<>();
	private double n = 0;
	private double m = 0;
	private double pos = 0;
	private double posi = 0;
	private HashMap<String, Object> mapa = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	private ArrayList<String> arr = new ArrayList<>();
	private ArrayList<String> color = new ArrayList<>();
	private ArrayList<String> name = new ArrayList<>();
	private ArrayList<String> number = new ArrayList<>();
	private ArrayList<String> symbol = new ArrayList<>();
	
	private LinearLayout linear1;
	private RecyclerView recyclerview1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.periodic_table);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		recyclerview1 = (RecyclerView) findViewById(R.id.recyclerview1);
		
		recyclerview1.addOnScrollListener(new RecyclerView.OnScrollListener() {
			@Override
			public void onScrollStateChanged(RecyclerView recyclerView, int _scrollState) {
				super.onScrollStateChanged(recyclerView, _scrollState);
				
			}
			
			@Override
			public void onScrolled(RecyclerView recyclerView, int _offsetX, int _offsetY) {
				super.onScrolled(recyclerView, _offsetX, _offsetY);
				
			}
		});
	}
	
	private void initializeLogic() {
		m = SketchwareUtil.getDip(getApplicationContext(), (int)(160));
		n = SketchwareUtil.getDip(getApplicationContext(), (int)(160));
		_position();
		for(int _repeat15 = 0; _repeat15 < (int)(180); _repeat15++) {
			map = new HashMap<>();
			map.put("key", String.valueOf((long)(posi)));
			list.add(map);
			posi++;
		}
		for(int _repeat22 = 0; _repeat22 < (int)(arr.size()); _repeat22++) {
			mapa = new HashMap<>();
			mapa.put("name", name.get((int)(pos)));
			mapa.put("color", color.get((int)(pos)));
			mapa.put("number", String.valueOf((long)(pos + 1)));
			/*
mapa.put("mass", mass.get((int)(pos)));
mapa.put("symbol", symbol.get((int)(pos)));
*/
			list.set((int)(Double.parseDouble(arr.get((int)(pos))) - 1), mapa);
			pos++;
		}
		recyclerview1.setAdapter(new Recyclerview1Adapter(list));
		FixedGridLayoutManager manager = new FixedGridLayoutManager();
		manager.setTotalColumnCount(18);
		//manager.generateDefaultLayoutParams();
		//manager.generateLayoutParams(new LinearLayout.LayoutParams((int)m,(int)n));
		recyclerview1.setLayoutManager(manager);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _position () {
		String[] C1 = {"1", "18", "19", "20", "31", "32", "33", "34", "35", "36", "37", "38", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "146", "147", "148", "149", "150","151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178"};
		arr.addAll(Arrays.asList(C1));
		//String[] color_arr = {"#FF388E3D", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFE65200", "#FF388E3D", "#FF388E3D", "#FF388E3D", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FF016064", "#FFE65200", "#FF388E3D", "#FF388E3D", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF016064", "#FFE65200", "#FFE65200", "#FF388E3D", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF016064", "#FF016064", "#FFE65200", "#FFE65200", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FFFFFF", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF016064", "#FF016064", "#FF016064", "#FFE65200", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FFFFFF", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF016064", "#FF016064", "#FF016064", "#FF016064", "#FF016064", "#FF730D5D", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFFFFF", "#FFFFFF", "#FFFFFF", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFFFFF", "#FFFFFF"};
		String[] color_arr = {"#FF388E3D", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FFE65200", "#FF388E3D", "#FF388E3D", "#FF388E3D", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FF016064", "#FFE65200", "#FF388E3D", "#FF388E3D", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF016064", "#FFE65200", "#FFE65200", "#FF388E3D", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF016064", "#FF016064", "#FFE65200", "#FFE65200", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17","#FFFFFF", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF016064", "#FF016064", "#FF016064", "#FFE65200", "#FF016064", "#FF730D5D", "#FFE40424", "#FFF47F17","#FFFFFF", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF5116F7", "#FF016064", "#FF016064", "#FF016064", "#FF016064", "#FF016064", "#FF730D5D", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFD500F9", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFAC1458", "#FFFFFF"};
		
		color.addAll(Arrays.asList(color_arr));
		String[] name_arr = {"Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorus", "Sulfur", "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "Cesium", "Barium", "57-71", "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "89-103", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium", "Livermorium", "Tennessine", "Oganesson", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "Mendelevium", "Nobelium", "Lawrencium"};
		name.addAll(Arrays.asList(name_arr));
	}
	
	
	public void _rippleRoundStroke (final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _radius_to (final View _view, final double _radius, final double _shadow, final String _color) {
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
	}
	
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		ArrayList<HashMap<String, Object>> _data;
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _v = _inflater.inflate(R.layout.custom, null);
RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final TextView textview2 = (TextView) _view.findViewById(R.id.textview2);
			final TextView textview1 = (TextView) _view.findViewById(R.id.textview1);
			
			if (list.get((int)_position).containsKey("name")) {
				linear1.setVisibility(View.VISIBLE);
				textview1.setText(list.get((int)_position).get("name").toString());
				textview2.setText(list.get((int)_position).get("number").toString());
				/*


*/
				//_rippleRoundStroke(linear1, "#FFFFFF", "#F0F0F0", 8, 3, "#000000");
				_radius_to(linear1, 5, 5, list.get((int)_position).get("color").toString());
				if ((_position == 110) || (_position == 92)) {
					textview1.setTextColor(0xFF000000);
				}
				else {
					textview1.setTextColor(0xFFFFFFFF);
				}
			}
			else {
				linear1.setVisibility(View.INVISIBLE);
			}
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					SketchwareUtil.showMessage(getApplicationContext(), String.valueOf((long)(_position)));
				}
			});
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder{
			public ViewHolder(View v){
				super(v);
			}
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