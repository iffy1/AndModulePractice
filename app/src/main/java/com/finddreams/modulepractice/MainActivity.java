package com.finddreams.modulepractice;

import android.os.Bundle;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.finddreams.module_base.utils.RouteUtils;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements NavigationCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("---------startHomeActivity");
        RouteUtils.startHomeActivity(this, this);
        //startActivity(new Intent(this, HomeActivity.class));
        //finish();
    }

    @Override
    public void onFound(Postcard postcard) {
            finish();
    }

    @Override
    public void onLost(Postcard postcard) {
        Toast.makeText(this,"Home模块未找到",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onArrival(Postcard postcard) {

    }

    @Override
    public void onInterrupt(Postcard postcard) {

    }
}
