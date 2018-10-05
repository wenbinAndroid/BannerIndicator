package com.mrz.bannerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @author Mrz
 * @date 2018/10/5 23:03
 */
public class BannerFragment extends Fragment {


    private View mView;
    private ImageView iv;
    public static final String IMAGE = "image";

    public static BannerFragment newInstant(String img) {
        Bundle bundle = new Bundle();
        bundle.putString(IMAGE, img);
        BannerFragment fragment = new BannerFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mView = View.inflate(getContext(), R.layout.fragment_banner, null);
        initView();
        return mView;
    }

    private void initView() {
        iv = mView.findViewById(R.id.iv);
        String img = getArguments().getString(IMAGE);
        Glide.with(this).load(img).into(iv);
    }
}
