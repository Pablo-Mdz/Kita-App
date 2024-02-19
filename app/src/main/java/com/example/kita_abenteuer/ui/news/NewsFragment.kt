package com.example.kita_abenteuer.ui.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kita_abenteuer.R
import com.example.kita_abenteuer.databinding.FragmentHomeBinding
import com.example.kita_abenteuer.databinding.FragmentNewsBinding


class NewsFragment : Fragment() {

    private lateinit var binding : FragmentNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

}