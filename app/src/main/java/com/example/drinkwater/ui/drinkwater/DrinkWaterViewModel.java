package com.example.drinkwater.ui.drinkwater;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DrinkWaterViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DrinkWaterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Đây là trang đầu");
    }

    public LiveData<String> getText() {
        return mText;
    }
}