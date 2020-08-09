package com.mpigot.mvvm_skeleton.ui.main

import com.mpigot.mvvm_skeleton.R
import com.mpigot.mvvm_skeleton.databinding.FragmentMainBinding
import com.mpigot.mvvm_skeleton.ui.base.BaseFragment

class MainFragment() : BaseFragment<FragmentMainBinding, MainViewModel>() {

    override lateinit var binding : FragmentMainBinding
    override lateinit var viewModel: MainViewModel

    override fun getBindingVariable(): Int {
        return 0
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_main
    }

    override fun setUpUi() {

    }

    override fun setUpObserver() {

    }
}