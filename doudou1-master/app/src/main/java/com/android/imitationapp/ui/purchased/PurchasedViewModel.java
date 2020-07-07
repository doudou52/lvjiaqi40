package com.android.imitationapp.ui.purchased;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PurchasedViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PurchasedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is purchased fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
