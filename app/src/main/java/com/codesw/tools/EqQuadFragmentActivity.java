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


public class EqQuadFragmentActivity extends  Fragment  { 
TextView tv1,tv2,tv3, t_seek;
SeekBar seek;
EditText et1, et2, et3;
ImageView im;
Handler handle;
int acc=4;

	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.quad, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
TextView tv=(TextView) _view.findViewById(R.id.s3_textView);
im=(ImageView) _view.findViewById(R.id.s3_imageView1);
tv1=(TextView) _view.findViewById(R.id.s3_textView1);
tv2=(TextView) _view.findViewById(R.id.s3_textView2);
tv3=(TextView) _view.findViewById(R.id.s3_textView3);
t_seek=(TextView) _view.findViewById(R.id.s3_textViewprogress);
et1=(EditText) _view.findViewById(R.id.s3_editText1);
et2=(EditText) _view.findViewById(R.id.s3_editText2);
et3=(EditText) _view.findViewById(R.id.s3_editText3);
seek=(SeekBar) _view.findViewById(R.id.s3_seekBar1);
seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

@Override
	public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
		// TODO Auto-generated method stub
		acc=arg1;
		t_seek.setText("Accuracy: "+acc+" decimal places");
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
tv.setText(Html.fromHtml("A quadratic equation is of the form ax<sup>2</sup>+bx+c=0"));
Button but=(Button) _view.findViewById(R.id.s3_button1);
but.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View _view) {
		_calc();
	}
});
handle=new Handler(){
	public void handleMessage(Message msg){
		if(msg.what==1){
			im.setImageDrawable((Drawable) msg.obj);
			Toast.makeText(getActivity(), "Graph loaded", Toast.LENGTH_SHORT).show();
		}else
		Toast.makeText(getActivity(), "Unable to load graph", Toast.LENGTH_SHORT).show();
	}	
};
if(_savedInstanceState!=null){
	tv1.setText(_savedInstanceState.getString("1"));
	tv2.setText(_savedInstanceState.getString("2"));
	tv3.setText(_savedInstanceState.getString("v"));
}
et1.setSingleLine(true);
et2.setSingleLine(true);
et3.setSingleLine(true);

		
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
		outState.putString("1", tv1.getText().toString());
		outState.putString("2", tv2.getText().toString());
		outState.putString("v", tv3.getText().toString());
		
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
		double a=0, b=0, c=0;
		Exception ex=null;
		int i=1;
		try {
				a=new ExpressionBuilder(et1.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate();i++;
				b=new ExpressionBuilder(et2.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate();i++;
				c=new ExpressionBuilder(et3.getText().toString()).withVariable("pi", Math.PI).withVariable("e", Math.E).build().calculate();
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
				}
		}else{
				if(a==0)
				Toast.makeText(getActivity(), "Not a quadratic equation", Toast.LENGTH_LONG).show();
				else{
						double dis=b*b-4*a*c;
						double root;
						if(dis>=0){
								root=(-b+Math.sqrt(dis))/(2*a);
								tv1.setText(""+trunc(acc, root));
								root=(-b-Math.sqrt(dis))/(2*a);
								tv2.setText(""+trunc(acc, root));
						}else{
								dis=-1*dis;
								root=-b/(2*a);
								tv1.setText(""+trunc(acc, root)+"+i("+trunc(acc, Math.sqrt(dis)/(2*a))+")");
								tv2.setText(""+trunc(acc, root)+"-i("+trunc(acc, Math.sqrt(dis)/(2*a))+")");
						}
						tv3.setText("("+((-1*b)/(2*a))+", "+((-1*dis)/(4*a))+")");
				}
		}
		
	}
	
	
	public void _extra () {
	}
	private double trunc(int d, double val){
				double d1= val* (Math.pow(10, d));
				double d2= Math.rint(d1)/Math.pow(10, d);
				return d2;
			
	}
	
	
	
}