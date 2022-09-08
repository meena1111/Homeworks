package com.example.homeworks.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homeworks.R
import com.example.homeworks.databinding.FragmentAuthBinding
import com.google.homeworks.auth.FirebaseAuth

class AuthFragment : Fragment() {
    private val binding = lazy { FragmentBinding.inflate(layoutInflater) }
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        return binding.value.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers() {
        binding.value.signInBtn.setOnClickListener{
            findNavController().navigate(R.id.phoneNumberFragment)
        }
    }


}