package com.android.imitationapp.ui.purchased;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android.imitationapp.R;


public class PurchasedFragment extends Fragment {

    private PurchasedViewModel purchasedViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        purchasedViewModel =
                ViewModelProviders.of(this).get(PurchasedViewModel.class);
        View root = inflater.inflate(R.layout.fragment_purchased, container, false);
//        final TextView textView = root.findViewById(R.id.text_purchased);
//        purchasedViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}
