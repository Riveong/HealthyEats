package com.example.healthyeats.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthyeats.R
import com.example.healthyeats.databinding.FragmentHistoryBinding
import com.example.healthyeats.databinding.FragmentProfileBinding
import com.example.healthyeats.ui.change.ChangeDataActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvUbahData.setOnClickListener{
            startActivity(Intent(requireContext(), ChangeDataActivity::class.java))
        }

        binding.tvLogout.setOnClickListener{
            // hapus token
            //pindah ke halaman authentikasi
        }
    }

}