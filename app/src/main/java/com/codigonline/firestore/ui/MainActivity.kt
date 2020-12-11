package com.codigonline.firestore.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.codigonline.firestore.R
import com.codigonline.firestore.viewmodels.UsuarioViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MAIN_ACTIVITY"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val viewModel = ViewModelProvider(this).get(UsuarioViewModel::class.java)
        viewModel.findAll().observe(this, {it-> textView.text = it.toString() //RecyclerView

        })


    }


}
