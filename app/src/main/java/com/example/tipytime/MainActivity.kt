package com.example.tipytime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    private lateinit var tvBaseAmount : EditText
    private lateinit var tvRadioGroup :RadioGroup
    lateinit var radioButton: RadioButton
    private lateinit var tvSwitch : Switch
    private lateinit var tvButton : Button
    private lateinit var tvTipAmount : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvBaseAmount = findViewById(R.id.tvBaseAmount)
        tvRadioGroup = findViewById(R.id.rvRadioGroup)
        tvSwitch = findViewById(R.id.tvSwitch)
        tvButton = findViewById(R.id.tvButton)
        tvTipAmount = findViewById(R.id.tvTipAmount)

        tvButton.setOnClickListener{

            if(tvBaseAmount.text.isEmpty()){
                tvTipAmount.text = ""

                Toast.makeText(applicationContext,"Enter the bill amount!",Toast.LENGTH_SHORT).show()

            }
            val selectedOption : Int = tvRadioGroup!!.checkedRadioButtonId
            radioButton = findViewById(selectedOption)
            if(radioButton.id.toString().isEmpty()){
                radioButton.id.toString() == "2131231174"

                Toast.makeText(applicationContext,"How was the service?",Toast.LENGTH_SHORT).show()

            }
            Log.i(TAG, "afterTextChanged ${radioButton.id.toString()}")


            if (radioButton.id.toString() == "2131231174"){
                //  1. get value of base amunt
                val baseAmount = tvBaseAmount.text.toString().toDouble()
                //  2.  compute tip amount
                val tipAmount = baseAmount * 20 / 100
                // 3. update ui

                if(tvSwitch.isChecked){
                    tvTipAmount.text  = "Tip amount $" + "%.0f".format(tipAmount)
                }else{
                    tvTipAmount.text = "Tip amount $ $tipAmount"
                }
//                tvSwitch.setOnCheckedChangeListener({ _ , isChecked ->
//                    tvTipAmount.text  = if (isChecked) "Tip amount $" + "%.2f".format(tipAmount)
//                    else "Tip amount $ $tipAmount"
//                })

//                tvTipAmount.text = "Tip amount $" + "%.2f".format(tipAmount)
                Log.i(TAG, "afterTextChanged $tipAmount")
            }else if (radioButton.id.toString() == "2131231177"){
                //  1. get value of base amunt
                val baseAmount = tvBaseAmount.text.toString().toDouble()
                //  2.  compute tip amount
                val tipAmount = baseAmount * 18 / 100
                if(tvSwitch.isChecked){
                    tvTipAmount.text  = "Tip amount $" + "%.0f".format(tipAmount)
                }else{
                    tvTipAmount.text = "Tip amount $ $tipAmount"
                }
                // 3. update ui
//                tvTipAmount.text = "Tip amount $" + "%.2f".format(tipAmount)
                android.util.Log.i(TAG, "afterTextChanged $tipAmount")
            }else if (radioButton.id.toString() == "2131231178"){
                //  1. get value of base amunt
                val baseAmount = tvBaseAmount.text.toString().toDouble()
                //  2.  compute tip amount
                val tipAmount = baseAmount * 15 / 100
                // 3. update ui
                if(tvSwitch.isChecked){
                    tvTipAmount.text  = "Tip amount $" + "%.0f".format(tipAmount)
                }else{
                    tvTipAmount.text = "Tip amount $ $tipAmount"
                }
                //tvTipAmount.text = "Tip amount $" + "%.2f".format(tipAmount)
                android.util.Log.i(TAG, "afterTextChanged $tipAmount")
            }
        }


    }
}