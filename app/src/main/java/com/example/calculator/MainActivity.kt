package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val bottomSheet: View =findViewById(R.id.bottom_sheet)

            val standardBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

            val advMath:Button=findViewById(R.id.advanceMaths)

            advMath.setOnClickListener{
                val state=if(standardBottomSheetBehavior.state==BottomSheetBehavior.STATE_EXPANDED)
                    BottomSheetBehavior.STATE_COLLAPSED else BottomSheetBehavior.STATE_EXPANDED
                standardBottomSheetBehavior.state=state
                }
            }
    }