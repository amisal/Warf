package cipla.warf.warf1;


import java.io.IOException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.SQLException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class warfinfo extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.warfinfo);
        DataBaseHelper myDbHelper = new DataBaseHelper(this);
        myDbHelper = new DataBaseHelper(this);
        try {
        	 
        	myDbHelper.createDataBase();
 
 	} catch (IOException ioe) {
 
 		throw new Error("Unable to create database");
 
 	}
 
 	try {
 
 		myDbHelper.openDataBase();
 
 	}catch(SQLException sqle){
 
 		throw sqle;
 
 	}
      /*  Button b1 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder builder= new AlertDialog.Builder(warfinfo.this);
				builder.setMessage("Are you really want to exit?");
				builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						warfinfo.this.finish();
						//warfActivity.finish(); 
						//Intent i = new Intent(warfinfo.this, WarfActivity.class);         
						//startActivity(i);   
						//finish(); 
					}
				});
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						
						dialog.cancel(); 
						}
});
            AlertDialog alert= builder.create();
            alert.show();
			}
		});*/
       Button b2= (Button) findViewById(R.id.button1);
       b2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			Intent i = new Intent(warfinfo.this, selectdrug.class);
			startActivity(i);

		}
	});
	}
}
