package com.guigu.mygittest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView girl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        girl = (ImageView) findViewById(R.id.girl);

    }

    public void change(View view){
        girl.setBackgroundResource(R.drawable.adeaa01091f3d18e1571c903843a5b14);
    }
}
