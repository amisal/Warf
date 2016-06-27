package cipla.warf.warf1;


import android.app.Activity;
//import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
//import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
//import android.os.Handler;



public class WarfActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.main);
        Handler hand=new Handler();
        hand.postDelayed(new SplashHandler(), 3000);
    }
    class SplashHandler implements Runnable {
    	public void run() {
			// TODO Auto-generated method stub
    	
        {
        	Intent i = new Intent(WarfActivity.this, warfinfo.class);
			startActivity(i);
			WarfActivity.this.finish();
        }
		
	}
	
	
}
}