package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    int count =0;
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView image = (ImageView) findViewById(R.id.android_cookie_image_view);
        image.setImageResource(R.drawable.after_cookie);
        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView text = (TextView) findViewById(R.id.status_text_view);
        text.setText("I'm so Full");

        Button button = (Button) findViewById(R.id.status_button_view);
        button.setText("Go Work");
        count +=1;
        if(count>1){
            goToWork();
        }
    }

    public void goToWork(){
        ImageView image = (ImageView) findViewById(R.id.android_cookie_image_view);
        image.setImageResource(R.drawable.gowork);
        

        TextView text = (TextView) findViewById(R.id.status_text_view);
        text.setText("I'm Working");

        Button button = (Button) findViewById(R.id.status_button_view);
        button.setText("Excellent");

    }

}
