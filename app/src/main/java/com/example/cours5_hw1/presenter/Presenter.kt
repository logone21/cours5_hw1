package com.example.cours5_hw1.presenter

import com.example.cours5_hw1.helper.Injector
import com.example.cours5_hw1.model.CounterModel
import com.example.cours5_hw1.view.CounterView

class Presenter {
    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun incremet() {
        model.increment()
        view.showNewCount(model.count)
            when (model.count) {
                10 -> view.showToast()
                15 -> view.changeColor()
            }
    }
    fun decrement() {
        model.decrement()
        view.showNewCount(model.count)
    }

        fun attachView(view: CounterView) {
            this.view = view
        }
    }

