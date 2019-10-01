package com.example.interfaceinteraction;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TestFragment.TestInteraction {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt = findViewById(R.id.txt);

        TestFragment testFragment = new TestFragment();

        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout, testFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }


    @Override
    public void getNumber(String number) {
        txt.setText(number);
    }
}
