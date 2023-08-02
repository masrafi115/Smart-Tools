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
import de.congrace.exp4j.*;
import edu.rit.numeric.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import de.congrace.exp4j.ExpressionBuilder;
import edu.rit.numeric.Cubic;

public class EqCubicFragmentActivity extends  Fragment  { 
EditText et1, et2, et3, et4;
	TextView t2, t3, t4, tseek;
	SeekBar seek;
	Button b1;
	int acc=4;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.cube, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
et1=(EditText) _view.findViewById(R.id.s4_editText1);
et2=(EditText) _view.findViewById(R.id.s4_editText2);
et3=(EditText) _view.findViewById(R.id.s4_editText3);
et4=(EditText) _view.findViewById(R.id.s4_editText4);
TextView t1=(TextView) _view.findViewById(R.id.s4_textView1);
t2=(TextView) _view.findViewById(R.id.s4_textView2);
t3=(TextView) _view.findViewById(R.id.s4_textView3);
t4=(TextView) _view.findViewById(R.id.s4_textView4);
tseek=(TextView) _view.findViewById(R.id.s4_textViewseek);
seek=(SeekBar) _view.findViewById(R.id.s4_seekBar1);
b1=(Button) _view.findViewById(R.id.s4_button1);
b1.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View _view) {
		_calc();
	}
});
seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
	
	
	@Override
	public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
		// TODO Auto-generated method stub
		tseek.setText("Accuracy: "+arg1+" decimal places");
		acc=arg1;
	}
	
	@Override
	public void onStartTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}
});
t1.setText(Html.fromHtml("A cubic equation is of the form ax<sup>3</sup>+bx<sup>2</sup>+cx+d=0"));
et1.setSingleLine(true);
et2.setSingleLine(true);
et3.setSingleLine(true);
et4.setSingleLine(true);
if(_savedInstanceState!=null){
	t2.setText(_savedInstanceState.getString("1"));
	t3.setText(_savedInstanceState.getString("2"));
	t4.setText(_savedInstanceState.getString("3"));
}

		
	}
	
	private void initializeLogic() {
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState){
		super.onSaveInstanceState(outState);
		outState.putString("1", t2.getText().toString());
				outState.putString("2", t3.getText().toString());
				outState.putString("3", t4.getText().toString());
		super.onSaveInstanceState(outState);
	}
	
	public void _Add_View_Initialize () {
	}
	
	
	public void _Add_Variables () {
	}
	
	
	public void _Replace_Layout_Fragment () {
	}
	
	
	public void _Fragment_onSaveInstanceState () {
	}
	
	
	public void _calc () {
		double a=0, b=0, c=0, d=0;
		Exception ex=null;
		int i=1;
		try {
				a=new ExpressionBuilder(et1.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate();i++;
				b=new ExpressionBuilder(et2.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate();i++;
				c=new ExpressionBuilder(et3.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate();i++;
				d=new ExpressionBuilder(et4.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate();
		} catch (Exception e) {
				// TODO Auto-generated catch block
				ex=e;
		}
		if(ex!=null){
				AlertDialog.Builder di=new AlertDialog.Builder(getActivity());
				String err=ex.toString().replaceFirst("de.congrace.exp4j.", "");
				switch(i){
						case 1: di.setTitle("Error").setMessage("Field a:\n"+err).show();
						break;
						case 2: di.setTitle("Error").setMessage("Field b:\n"+err).show();
						break;
						case 3: di.setTitle("Error").setMessage("Field c:\n"+err).show();
						break;
						case 4: di.setTitle("Error").setMessage("Field d:\n"+err).show();
						break;
				}
		}else{
				if(a==0)
				Toast.makeText(getActivity(), "Not a cubic equation", Toast.LENGTH_LONG).show();
				else{
						Cubic cubic=new Cubic();
						cubic.solve(a, b, c, d);
						t2.setText(""+trunc(acc, cubic.x1));
						String[] res=quad(a, (b+a*cubic.x1), (cubic.x1*cubic.x1+cubic.x1*b+c));
						t3.setText(res[0]);
						t4.setText(res[1]);
				}
		}
		
	}
	
	
	public void _extra () {
	}
	String[] quad(double a, double b, double c){
			double dis=b*b-4*a*c;
			double root;
			String[] res=new String[2];
			if(dis>=0){
					root=(-b+Math.sqrt(dis))/(2*a);
					res[0]=""+trunc(acc, root);
					root=(-b-Math.sqrt(dis))/(2*a);
					res[1]=""+trunc(acc, root);
			}else{
					dis=-1*dis;
					root=-b/(2*a);
					res[0]=""+trunc(acc, root)+"+i("+trunc(acc, Math.sqrt(dis)/(2*a))+")";
					res[1]=""+trunc(acc, root)+"-i("+trunc(acc, Math.sqrt(dis)/(2*a))+")";
			}
			return res;
	}
	private double trunc(int d, double val){
			double d1= val* (Math.pow(10, d));
			double d2= Math.rint(d1)/Math.pow(10, d);
			return d2;
			
			
	}
	
	
	
}