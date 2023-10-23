package com.example.tugas_tab_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_tab_layout.databinding.ActivityDashboardBinding

class Dashboard : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(LoginFragment.NAMA_EXTRA)
        with(binding){
            txtusername.text = nama
        }
    }
}