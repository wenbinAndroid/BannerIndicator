package com.mrz.bannerview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewpager;
    private BannerIndicatorView mIndicatorView;
    private List<String> imgs = Arrays.asList("https://wx4.sinaimg" +
            ".cn/mw690/67be458fgy1fvxqbhidhxj20c80gego6.jpg", "https://wx1.sinaimg" +
            ".cn/mw690/67be458fgy1fvxqbh3icbj20c80h43zm.jpg", "https://wx4.sinaimg" +
            ".cn/mw690/67be458fgy1fvxqbi9zwcj20c80icdhy.jpg", "https://wx1.sinaimg" +
            ".cn/mw690/67be458fgy1fvxqbj64igj20c80icjsy.jpg");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mIndicatorView = findViewById(R.id.indicator);
        mViewpager = findViewById(R.id.viewpager);
        int size = imgs.size();
        List<BannerFragment> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String img = imgs.get(i);
            BannerFragment fragment = BannerFragment.newInstant(img);
            list.add(fragment);
        }
        mViewpager.setAdapter(new BannerAdapter(list, getSupportFragmentManager()));
        mIndicatorView.setViewpager(mViewpager);
    }
}
