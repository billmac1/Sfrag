package com.example.billmac1.sfrag;

/**
 * Created by billmac1 on 10/26/2015.
 */

import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends LifecycleLoggingActivity {
    public static final String EXTRA_MESSAGE="msg";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);

        TextView tv=(TextView)findViewById(R.id.msg);

        tv.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
    }
}