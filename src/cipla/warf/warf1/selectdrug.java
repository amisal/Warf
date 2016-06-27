package cipla.warf.warf1;




import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
//import android.text.InputFilter.LengthFilter;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;
import android.widget.Toast;

public class selectdrug extends Activity {
	  
	 ArrayList<String> prod=new ArrayList<String>();
	 
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	        setContentView(R.layout.selectdrug);
	        /*Button b1=(Button) findViewById(R.id.button1);
	        b1.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(selectdrug.this, rtr.class);
						startActivity(i);
				}
			});*/
	       Button b6=(Button) findViewById(R.id.button6);
	        b6.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					EditText et1=(EditText) findViewById(R.id.editText1);
					if(et1.getText().toString().equalsIgnoreCase(""))
					{
						Toast.makeText(selectdrug.this, "Please select drug",Toast.LENGTH_SHORT).show();
					}
					else
					{
						Intent i = new Intent(selectdrug.this, result.class);
						i.putExtra("key1",et1.getText().toString());
						startActivity(i);
					}
					 
				}
			});
	        SQLiteDatabase db=openOrCreateDatabase("medicine_result", MODE_PRIVATE, null);
	        Cursor cur = db.rawQuery("SELECT distinct medicine_name from medicine;", null);
	        cur.moveToFirst();
	        int n=cur.getCount();
	        
	        //int i=0;
	        for(int i=0;i<n-1;i++)
	        {
	        	//p.add();
	        	cur.moveToNext();
	        	prod.add(cur.getString(cur.getColumnIndex("medicine_name")).replace("-", " "));
	        	Log.d("Anish",cur.getString(cur.getColumnIndex("medicine_name")));
	        	
	        	//i++;
	        }
	       // final String [] arr = p.toArray(new String[p.size()]);
	        db.close();
	       
	      //  cur.getColumnIndex("medicine_name");
	       	    	 
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	                android.R.layout.simple_dropdown_item_1line,  prod);
	        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.editText1);
	        textView.setAdapter(adapter);
	        Button b2=(Button) findViewById(R.id.button2);
	        b2.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(selectdrug.this, maindim.class);
					 String s1 = "initialdosage";
						i.putExtra("key1",s1);
						startActivity(i);
				}
			});
	        Button b7=(Button) findViewById(R.id.button7);
	        b7.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(selectdrug.this, maindim.class);
					 String s1 = "maintenance";
						i.putExtra("key1",s1);
						startActivity(i);
				}
			});
	        Button b8=(Button) findViewById(R.id.button8);
	        b8.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(selectdrug.this, maindim.class);
					 String s1 = "misdose";
						i.putExtra("key1",s1);
						startActivity(i);
				}
			});
	        Button b1=(Button) findViewById(R.id.button1);
	        b1.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(selectdrug.this, rtr.class);
						startActivity(i);
				}
			});
	        Button b5=(Button) findViewById(R.id.button5);
	        b5.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String s1 = "warfpres";
					 Intent i = new Intent(selectdrug.this, maindim.class);
					i.putExtra("key1",s1);
					startActivity(i);
				}
			});
	        Button b4=(Button) findViewById(R.id.button4);
	        b4.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String s1 = "contraindication";
					 Intent i = new Intent(selectdrug.this, maindim.class);
					i.putExtra("key1",s1);
					startActivity(i);
				}
			});
	        Button b3=(Button) findViewById(R.id.button3);
	        b3.setOnClickListener(new OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(selectdrug.this, maindim.class);
						i.putExtra("key1","cft");
						startActivity(i);
				}
			});
	 }
}
