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


public class EqLinearFragmentActivity extends  Fragment  { 
EditText et1, et2, et3, et4, et5, et6;
	Button b1;
	TextView tv1, tv2;
	
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.linear, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
et1=(EditText) _view.findViewById(R.id.s2_editText1);
et2=(EditText) _view.findViewById(R.id.s2_editText2);
et3=(EditText) _view.findViewById(R.id.s2_editText3);
et4=(EditText) _view.findViewById(R.id.s2_editText4);
et5=(EditText) _view.findViewById(R.id.s2_editText5);
et6=(EditText) _view.findViewById(R.id.s2_editText6);
tv1=(TextView) _view.findViewById(R.id.s2_textView1);
tv2=(TextView) _view.findViewById(R.id.s2_textView2);
if(_savedInstanceState!=null){
	tv1.setText(_savedInstanceState.getString("x"));
	tv2.setText(_savedInstanceState.getString("y"));
}
b1=(Button) _view.findViewById(R.id.s2_button1);
b1.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View _view) {
		_calc();
	}
});
et1.requestFocus();

		
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
		outState.putString("x", tv1.getText().toString());
				outState.putString("y", tv2.getText().toString());
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
		Exception ex=null;
		double a1=0, b1=0, a2=0, b2=0, c1=0, c2=0;
		int i=1;
		try {
				a1=new ExpressionBuilder(et1.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate(); i++;
				b1=new ExpressionBuilder(et2.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate(); i++;
				c1=new ExpressionBuilder(et3.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate(); i++;
				a2=new ExpressionBuilder(et4.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate(); i++;
				b2=new ExpressionBuilder(et5.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate(); i++;
				c2=new ExpressionBuilder(et6.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate(); i++;
		}catch(Exception e){
				ex=e;
		}
		if(ex!=null){
				AlertDialog.Builder di=new AlertDialog.Builder(getActivity());
				String err=ex.toString().replaceFirst("de.congrace.exp4j.", "");
				switch(i){
						case 1: di.setTitle("Error").setMessage("Field a1:\n"+err).show();
						break;
						case 2: di.setTitle("Error").setMessage("Field b1:\n"+err).show();
						break;
						case 3: di.setTitle("Error").setMessage("Field c1:\n"+err).show();
						break;
						case 4:	di.setTitle("Error").setMessage("Field a2:\n"+err).show();
						break;
						case 5: di.setTitle("Error").setMessage("Field b2:\n"+err).show();
						break;
						case 6: di.setTitle("Error").setMessage("Field c2:\n"+err).show();
						break;
				}
		}else{
				double den=b1*a2-b2*a1;
				if(den!=0){
						double x=(b1*c2-b2*c1)/(den);
						tv1.setText(""+x);
						double y=(c1-a1*x)/b1;
						tv2.setText(""+y);
				}else{
						tv1.setText("They are equations of parallel line");
						tv2.setText("");
				}
		}
		
	}
	
	
	
}