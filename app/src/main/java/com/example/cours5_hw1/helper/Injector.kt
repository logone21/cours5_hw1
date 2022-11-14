package com.example.cours5_hw1.helper

import com.example.cours5_hw1.model.CounterModel
import com.example.cours5_hw1.presenter.Presenter

class Injector {
    companion object{
        fun getModel(): CounterModel{
            return CounterModel()
        }
        fun getPresenter(): Presenter {
            return Presenter()
        }
    }
}