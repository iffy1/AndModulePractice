package com.finddreams.module_home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.finddreams.module_base.base.BaseFragment;
import com.finddreams.module_base.utils.RouteUtils;

/**
 * Created by lx on 17-10-24.
 */
@Route(path = RouteUtils.Home_Fragment_Main)
public class HomeMainFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment_main, null);

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
