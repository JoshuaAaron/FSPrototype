package com.bit271.fsprototype.ui.listings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ListingsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ListingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is listings fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}