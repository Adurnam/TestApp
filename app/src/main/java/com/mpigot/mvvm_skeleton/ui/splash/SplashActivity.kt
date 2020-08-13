package com.mpigot.mvvm_skeleton.ui.splash

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.mpigot.mvvm_skeleton.R
import com.mpigot.mvvm_skeleton.databinding.ActivitySplashBinding
import com.mpigot.mvvm_skeleton.ui.base.BaseActivity
import com.mpigot.mvvm_skeleton.ui.login.LoginFragment


class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>() {

    lateinit var binding : ActivitySplashBinding
    private lateinit var drawerLayout : DrawerLayout
    private lateinit var navController : NavController
    private lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupUI()
    }

    private fun setupUI() {
        toolbar = binding.splashToolbar
        setSupportActionBar(toolbar)
        navController = findNavController(R.id.fragment_container)

        drawerLayout = binding.drawerLayout
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
    }

    private fun setupBinding() {
        binding = DataBindingUtil
            .setContentView(this, R.layout.activity_splash)
    }

    fun appBarState(visibility : Boolean) {
        if (visibility) {
            toolbar.visibility = View.VISIBLE
        } else {
            toolbar.visibility = View.INVISIBLE
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragment_container)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }

    override fun onFragmentAttached() {

    }

    override fun onFragmentDetached(tag: String) {

    }
}
