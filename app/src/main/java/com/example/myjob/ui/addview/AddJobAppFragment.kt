package com.example.myjob.ui.addview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myjob.databinding.FragmentJobAppListBinding


class AddJobAppFragment : Fragment() {

    private lateinit var fragmentJobAppListBinding: FragmentJobAppListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            fragmentJobAppListBinding = FragmentJobAppListBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       return fragmentJobAppListBinding.root
    }

    companion object
}