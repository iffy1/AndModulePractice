package com.finddreams.shoppingcart;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.finddreams.module_base.base.BaseActivity;
import com.finddreams.module_base.utils.RouteUtils;

public class ShoppingCartActivityASApp extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_as_app);
        Fragment fg = RouteUtils.getShoppingCartFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_holder,fg);
        ft.show(fg).commit();
    }
}
