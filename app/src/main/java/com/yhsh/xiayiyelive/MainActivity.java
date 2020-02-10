package com.yhsh.xiayiyelive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.tencent.liteav.demo.R;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author xiayiye
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startLive(View view) {
        startActivity(new Intent(this, CameraPusherActivity.class));
    }

    public void startPlay(View view) {
    }
}
