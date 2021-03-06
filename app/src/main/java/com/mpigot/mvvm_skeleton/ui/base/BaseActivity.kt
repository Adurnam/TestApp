package com.mpigot.mvvm_skeleton.ui.base

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import com.mpigot.mvvm_skeleton.R
import com.mpigot.mvvm_skeleton.ui.login.LoginFragment
import com.mpigot.mvvm_skeleton.utils.NetworkUtils

abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel> : AppCompatActivity(), BaseFragment.CallBack {

    private lateinit var viewModel : V
    private lateinit var binding : T

    private lateinit var progressDialog : ProgressBar

    abstract override fun onFragmentAttached()

    abstract override fun onFragmentDetached(tag : String)

    fun hideKeyboard() {
        val view : View? = this.currentFocus
        val imm : InputMethodManager? = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm?.hideSoftInputFromWindow(view?.windowToken, 0)
    }

    fun isNetworkConnected() : Boolean {
        return NetworkUtils.isNetworkConnected(applicationContext)
    }

    fun openNewFragment(navigation : Int) {
        var navController = findNavController(R.id.fragment_container)
        navController.navigate(navigation)
    }

    fun openFragmentOnTokenExpire() {
        openNewFragment(R.id.loginFragment)
    }
}