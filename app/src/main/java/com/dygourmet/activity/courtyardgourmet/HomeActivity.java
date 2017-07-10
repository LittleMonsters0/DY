package com.dygourmet.activity.courtyardgourmet;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.dygourmet.activity.courtyardgourmet.Fragment.DingdanFragment;
import com.dygourmet.activity.courtyardgourmet.Fragment.FujinFragment;
import com.dygourmet.activity.courtyardgourmet.Fragment.GuangyiguangFragment;
import com.dygourmet.activity.courtyardgourmet.Fragment.ShouyeFragment;
import com.dygourmet.activity.courtyardgourmet.Fragment.WodeFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends Activity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private static final String TAG = "HomeActivity";
    private ViewPager pager;
    private RadioGroup rg;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        initView();
    }

    private void initView() {
        pager = (ViewPager) findViewById(R.id.vp);
        rg = (RadioGroup) findViewById(R.id.rg);
        findViewById(R.id.home).setOnClickListener(this);
        findViewById(R.id.fujin).setOnClickListener(this);
        findViewById(R.id.guangyiguang).setOnClickListener(this);
        findViewById(R.id.dingdan).setOnClickListener(this);
        findViewById(R.id.wode).setOnClickListener(this);
        fragments = new ArrayList<Fragment>();
        fragments.add(new ShouyeFragment());
        fragments.add(new FujinFragment());
        fragments.add(new GuangyiguangFragment());
        fragments.add(new DingdanFragment());
        fragments.add(new WodeFragment());

        pager.setOnPageChangeListener(this);
    }






    @Override
    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.home:
                pager.setCurrentItem(0,true);
                break;
            case R.id.fujin:
                pager.setCurrentItem(1, true);
                break;
            case R.id.guangyiguang:
                pager.setCurrentItem(2, true);
                break;
            case R.id.dingdan:
                pager.setCurrentItem(3, true);
                break;
            case R.id.wode:
                pager.setCurrentItem(4, true);
                break;
        }
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int position) {

        switch(position) {
            case 0:
                rg.check(R.id.home);
                break;
            case 1:
                rg.check(R.id.fujin);
                break;
            case 2:
                rg.check(R.id.guangyiguang);
                break;
            case 3:
                rg.check(R.id.dingdan);
                break;
            case 4:
                rg.check(R.id.wode);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int position) {

    }
}
