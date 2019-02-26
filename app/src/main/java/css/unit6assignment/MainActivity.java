package css.unit6assignment;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnCall,btnCall2,btnCall3;
    Button btnTxt, btnTxt2, btnTxt3;
    TextView txtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtonClickEvents();

    }

    public void setupButtonClickEvents(){
        btnCall = (Button) findViewById(R.id.buttonCall1);
        txtView = (TextView) findViewById(R.id.textView);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Response to button click
                String phoneNumber ="6127082661";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(callIntent);
                }
                else{
                    txtView.setText("Call could not go through");
                }
            }
        });

        btnTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Response to button click
                String phoneNumber ="sms:6127082661";
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse(phoneNumber));
                sendIntent.putExtra("sms_body", "Hi");

                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(sendIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(sendIntent);
                }
                else {
                    txtView.setText("Text could not be sent");
                }
            }
        });
    }
    public void setupButtonClickEvents2(){
        btnCall2 = (Button) findViewById(R.id.buttonCall2);
        txtView = (TextView) findViewById(R.id.textView);
        btnCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Response to button click
                String phoneNumber ="6127082661";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(callIntent);
                }
                else{
                    txtView.setText("Call could not go through");
                }
            }
        });

        btnTxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Response to button click
                String phoneNumber ="sms:6127082661";
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse(phoneNumber));
                sendIntent.putExtra("sms_body", "Hi");

                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(sendIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(sendIntent);
                }
                else {
                    txtView.setText("Text could not be sent");
                }
            }
        });
    }
    public void setupButtonClickEvents3(){
        btnCall3 = (Button) findViewById(R.id.buttonCall3);
        txtView = (TextView) findViewById(R.id.textView);
        btnCall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Response to button click
                String phoneNumber ="6127082661";
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phoneNumber));
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(callIntent);
                }
                else{
                    txtView.setText("Call could not go through");
                }
            }
        });

        btnTxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Response to button click
                String phoneNumber ="sms:6127082661";
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse(phoneNumber));
                sendIntent.putExtra("sms_body", "Hi");

                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(sendIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(sendIntent);
                }
                else {
                    txtView.setText("Text could not be sent");
                }
            }
        });
    }
}
