package cipla.warf.warf1;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
//import android.util.Log;
import android.widget.TextView;

public class result extends Activity {
	
 public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.result);
     TextView t1=(TextView) findViewById(R.id.textView1);
     setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
 Intent receiver = getIntent();
	String s1 = receiver.getStringExtra("key1");    	 
 SQLiteDatabase db=openOrCreateDatabase("medicine_result", MODE_PRIVATE, null);
 Cursor cur = db.rawQuery("SELECT m2.medicine_description FROM medicine m1,medicine_output m2 where m1.medicine_type=m2.medicine_type and m1.medicine_name='" + s1 + "';", null);
 cur.moveToFirst();
 if(cur.getCount()==0)
 {

	 t1.setText("No matching Records Found");    	
 
 }
 else
 {
 t1.setText(cur.getString(cur.getColumnIndex("m2.medicine_description"))+ " " + s1 +" is co-administered with warfarin");    	
 }
	    	 
	    	 
	    
 } }
