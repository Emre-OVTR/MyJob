package com.example.myjob.ui.mapview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myjob.databinding.FragmentMapBinding


class MapFragment : Fragment() {

    private lateinit var fragmentMapBinding: FragmentMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentMapBinding = FragmentMapBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return fragmentMapBinding.root
    }

    companion object
}