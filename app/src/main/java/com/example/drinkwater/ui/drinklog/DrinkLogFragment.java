package com.example.drinkwater.ui.drinklog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.drinkwater.R;
import com.example.drinkwater.ui.drinklog.DrinkLogViewModel;

public class DrinkLogFragment extends Fragment {

    private DrinkLogViewModel drinklogViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        drinklogViewModel =
                new ViewModelProvider(this).get(DrinkLogViewModel.class);
        View root = inflater.inflate(R.layout.fragment_drinklog, container, false);
        final TextView textView = root.findViewById(R.id.ui_drinklog);
        drinklogViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}