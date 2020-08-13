package com.mpigot.mvvm_skeleton.ui.login

import android.widget.Button
import androidx.navigation.findNavController
import com.mpigot.mvvm_skeleton.R
import com.mpigot.mvvm_skeleton.databinding.FragmentLoginBinding
import com.mpigot.mvvm_skeleton.ui.base.BaseActivity
import com.mpigot.mvvm_skeleton.ui.base.BaseFragment
import com.mpigot.mvvm_skeleton.ui.main.MainFragment
import com.mpigot.mvvm_skeleton.ui.splash.SplashActivity

class LoginFragment() : BaseFragment<FragmentLoginBinding, LoginViewModel>() {

    override lateinit var binding : FragmentLoginBinding
    override lateinit var viewModel: LoginViewModel
    lateinit var btLogin : Button

    override fun getBindingVariable(): Int {
        return 0
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_login
    }

    override fun setUpUi() {
        btLogin = binding.btAuthentication
        (activity as SplashActivity).appBarState(false)
        btLogin.setOnClickListener {
            binding.unbind()
            (activity as BaseActivity<*, *>)
                .openNewFragment(R.id.action_loginFragment_to_mainFragment) }
    }

    override fun setUpObserver() {

    }
}