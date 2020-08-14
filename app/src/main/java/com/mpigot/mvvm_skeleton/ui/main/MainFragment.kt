package com.mpigot.mvvm_skeleton.ui.main

import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.mpigot.mvvm_skeleton.R
import com.mpigot.mvvm_skeleton.databinding.FragmentMainBinding
import com.mpigot.mvvm_skeleton.ui.base.BaseFragment
import com.mpigot.mvvm_skeleton.ui.splash.SplashActivity

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
        (activity as SplashActivity).appBarState(true)
    }

    override fun setUpObserver() {
    
    }
}