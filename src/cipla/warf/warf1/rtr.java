package cipla.warf.warf1;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class rtr extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.rtr);
		Button b1= (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(rtr.this, maindim.class);
				i.putExtra("key1","mbht");
				startActivity(i);
			}
		});
		Button b2= (Button) findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(rtr.this, maindim.class);
				i.putExtra("key1","venous");
				startActivity(i);
			}
		});
		Button b3= (Button) findViewById(R.id.button3);
		b3.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(rtr.this, maindim.class);
				i.putExtra("key1","af");
				startActivity(i);
			}
		});
		Button b4= (Button) findViewById(R.id.button4);
		b4.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(rtr.this, maindim.class);
				i.putExtra("key1","pmi");
				startActivity(i);
			}
		});
		Button b5= (Button) findViewById(R.id.button5);
		b5.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(rtr.this, maindim.class);
				i.putExtra("key1","msrs");
				startActivity(i);
			}
		});
}
}