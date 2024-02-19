package com.example.kita_abenteuer.ui.aboutUs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kita_abenteuer.R
import com.example.kita_abenteuer.databinding.FragmentAboutUsBinding
import com.example.kita_abenteuer.databinding.FragmentSettingsBinding

class AboutUsFragment : Fragment() {


    private lateinit var binding : FragmentAboutUsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutUsBinding.inflate(inflater, container, false)
        return binding.root
    }
}