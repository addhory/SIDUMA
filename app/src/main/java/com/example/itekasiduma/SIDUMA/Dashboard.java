package com.example.itekasiduma.SIDUMA;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Dashboard extends AppCompatActivity {
    CardView mUnduhFile, mSyarat, mFAQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }

    public void faq(View view) {
        Intent mFaq = new Intent (getApplicationContext(),FAQs.class);
        startActivity(mFaq);
        finish();

    }


    public void sSyarat(View view) {
        Intent mSyarat = new Intent(getApplicationContext(),Syarat.class);
        startActivity(mSyarat);
        finish();
    }

    public void inputForm(View view) {
        //Intent mInput = new Intent(getApplicationContext(), Inpu)
    }

    public void UnduhFile(View view) {
        Intent mUnduhfile = new Intent(getApplicationContext(), Unduhfile.class);
        startActivity(mUnduhfile);
        finish();
    }
}
