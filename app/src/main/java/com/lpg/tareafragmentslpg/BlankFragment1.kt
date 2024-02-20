package com.lpg.tareafragmentslpg

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController


class BlankFragment1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_blank1, container, false)
        // Inflate the layout for this fragment

        val xena = root.findViewById<ImageView>(R.id.image1)
        val conan = root.findViewById<ImageView>(R.id.image2)

        xena.setOnClickListener(){
            val accion1 = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2(1)
            dialogoAlerta("Xena",accion1, "¿Quieres que tu grito de guerra sea Ayayayayaya?")
        }

        conan.setOnClickListener(){
            val accion2 = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2(2)
            dialogoAlerta("Conan", accion2, "¿De verdad piensas que lo mejor de la vida es Aplastar enemigos, verles destrozados y oir el lamento de sus mujeres?")
        }

        return root
    }

    private fun dialogoAlerta(guerrero:String, eleccion:NavDirections, mensaje:String){
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Confirma tu elección de $guerrero").setCancelable(false).setMessage(
            mensaje
        ).setPositiveButton("Sí, Maestro"){ dialog, _->
            findNavController().navigate(eleccion)
            dialog.dismiss()
        }.setNegativeButton("No soy un pusilanime"){dialog, _->
            dialog.dismiss()
        }.show()

    }

}