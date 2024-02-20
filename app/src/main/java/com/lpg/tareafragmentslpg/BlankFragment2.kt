package com.lpg.tareafragmentslpg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.navArgs
import androidx.navigation.fragment.findNavController


class BlankFragment2 : Fragment() {


    val args: BlankFragment2Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root2 = inflater.inflate(R.layout.fragment_blank2, container, false)
        val guerrero = root2.findViewById<ImageView>(R.id.image3)

        if(args.idGuerrero.toString() == "1"){
            guerrero.setImageResource(R.drawable.xenavertical2)
        }else{
            guerrero.setImageResource(R.drawable.conanvertical)
        }

        // Inflate the layout for this fragment
        return root2
    }

}