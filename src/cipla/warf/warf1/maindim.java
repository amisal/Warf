package cipla.warf.warf1;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class maindim extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.maindim);
        Intent receiver = getIntent();
    	String s = receiver.getStringExtra("key1");
    	WebView w=(WebView) findViewById(R.id.webView1);
    	if (s.equalsIgnoreCase("initialdosage"))
    	{
    		 ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.initialdosageribbon);
	    w.loadUrl("file:///android_asset/warf_initialdosage.html");
    	}
    	else if (s.equalsIgnoreCase("maintenance"))
    	{
   		 ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.maintenanceribbon);
	    w.loadUrl("file:///android_asset/warf_maintenance.html");
    	}
    	else if (s.equalsIgnoreCase("misdose"))
    	{
   		 ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.misseddoseribbon);
	    w.loadUrl("file:///android_asset/misdose.html");
    	}
    	else if(s.equalsIgnoreCase("mbht"))
    	{
   		 ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.mechanicalandbioribbon);
        w.loadUrl("file:///android_asset/mbht.html");
    	}
    	else if(s.equalsIgnoreCase("venous"))
    	{
   		 ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.venousribbon);
        w.loadUrl("file:///android_asset/venous_t.html");
    	}
    	else if(s.equalsIgnoreCase("af"))
    	{
        w.loadUrl("file:///android_asset/af.html");
    	}
    	else if(s.equalsIgnoreCase("pmi"))
    	{
   		 ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.postmyocadrialribbon);
        w.loadUrl("file:///android_asset/pmi.html");
    	}
    	else if(s.equalsIgnoreCase("msrs"))
    	{
      	((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.msandrseribbon);	
        w.loadUrl("file:///android_asset/msrs.html");
    	}
    	else if(s.equalsIgnoreCase("cft"))
    	{
      ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.backgroundribbon);
        w.loadUrl("file:///android_asset/conversion_ht.html");
    	}
    	else if(s.equalsIgnoreCase("warfpres"))
    	{
      ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.prescribinginforibbon);	
        w.loadUrl("file:///android_asset/warf_pres.html");
    	}
    	else if(s.equalsIgnoreCase("contraindication"))
    	{
      ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.contraindicationsribbon);	
        w.loadUrl("file:///android_asset/warf_contraindication.html");
    	}
    	}       
}
