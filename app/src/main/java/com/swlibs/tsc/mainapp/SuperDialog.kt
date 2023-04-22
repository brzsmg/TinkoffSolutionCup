package com.swlibs.tsc.mainapp

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.swlibs.tsc.mainapp.databinding.SuperDialogBinding


open class SuperDialog(context: Context?) : android.app.AlertDialog(context, 0) {
    private val binding: SuperDialogBinding = SuperDialogBinding.inflate(layoutInflater)

    init {
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setView(binding.root)
    }
}