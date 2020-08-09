package com.mpigot.mvvm_skeleton.ui.base

import android.util.Log
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    init {
        Log.i("ViewModel", "BaseViewModel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ViewModel", "BaseViewModel destroyed")
    }
}