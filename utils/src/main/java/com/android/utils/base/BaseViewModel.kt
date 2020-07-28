package com.android.utils.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.disposables.CompositeDisposable
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {


    val compositeDisposable: CompositeDisposable = CompositeDisposable()
    protected val exceptionLiveData = MutableLiveData<Any>()
    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    fun getExceptionData(): LiveData<Any> = exceptionLiveData
}

