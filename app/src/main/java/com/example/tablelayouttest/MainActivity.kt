package com.example.tablelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.marginTop
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            val tableRow = TableRow(applicationContext)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            layoutParams.setMargins(5, 5, 5,5)
            tableRow.layoutParams = layoutParams
            tableRow.background = ResourcesCompat.getDrawable(resources, android.R.color.holo_red_dark, null)

            val androidName = androidVersionEditText.text.toString()
            val androidNameTextView = TextView(this)
            androidNameTextView.text = androidName

            val code = codeName.text.toString()
            val codeTextView = TextView(this)
            codeTextView.text = code

            tableRow.addView(androidNameTextView,0)
            tableRow.addView(codeTextView,1)
            tableLayout.addView(tableRow)

            androidVersionEditText.setText("")
            codeName.setText("")
        }
    }
}
