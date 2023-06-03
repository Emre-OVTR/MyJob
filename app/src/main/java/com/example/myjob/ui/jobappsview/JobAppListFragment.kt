package com.example.myjob.ui.jobappsview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myjob.databinding.FragmentJobAppListBinding


class JobAppListFragment : Fragment() {

    private lateinit var fragmentJobAppListBinding: FragmentJobAppListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentJobAppListBinding = FragmentJobAppListBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return fragmentJobAppListBinding.root
    }

    companion object
}