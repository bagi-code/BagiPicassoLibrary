package com.bagicode.www.bagipicassolibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisalisasi imageview
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        // loading image form url
        Picasso.with(this)
                .load("http://i.imgur.com/DvpvklR.png")
                .placeholder(R.mipmap.ic_launcher) // you can add here
                .error(R.mipmap.ic_launcher) // maybe error
                .resize(250,250) // size
                .rotate(90) // transf and try again
                .into(imageView);

        // you can search with google chrome about picasso
        // i will show image from http://i.imgur.com/DvpvklR.png

        // now, i will try
        // nice <code></code>

        // you can add picasso with place holder, error fallback, image resize and transformation
        // go try

//        go try
        // you see we have cache. go uninstall and run again

        // you see it. and try resize and transform

//        ok very nice and see you guys..
    }
}
