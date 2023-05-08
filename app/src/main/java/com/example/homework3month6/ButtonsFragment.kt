package com.example.homework3month6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homework3month6.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {

    private lateinit var binding: FragmentButtonsBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[(MainViewModel::class.java)]

        binding.increment.setOnClickListener {
            viewModel.increment()
        }

        binding.decrement.setOnClickListener {
            viewModel.decrement()
        }
    }
}