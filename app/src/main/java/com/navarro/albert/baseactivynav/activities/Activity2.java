package com.navarro.albert.baseactivynav.activities;

import android.os.Bundle;
import com.navarro.albert.baseactivynav.BaseActivity;
import com.navarro.albert.baseactivynav.R;

public class Activity2 extends BaseActivity {

    public static final int THIS_ACTIVITY = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setTitle("Activity2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkMenuItem(THIS_ACTIVITY);
    }
}
