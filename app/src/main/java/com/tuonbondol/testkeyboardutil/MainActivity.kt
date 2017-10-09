package com.tuonbondol.testkeyboardutil

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tuonbondol.keyboardutil.hideSoftKeyboard
import com.tuonbondol.keyboardutil.showSoftKeyboard
import kotlinx.android.synthetic.main.activity_main.*

/****
 *
 * @author TUON BONDOL Date: 10/9/17.
 *
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHideKeyboard.setOnClickListener {
            hideSoftKeyboard()
        }

        btnShowKeyboard.setOnClickListener {
            showSoftKeyboard(etKeyboard)
        }
    }
}