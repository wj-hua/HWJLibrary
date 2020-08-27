package com.example.hwjlibrary

import android.content.Context
import android.widget.Toast

/**
 * @author hwj
 * @data 8/27/20
 * des 测试功能类
 **/
class MyFunction {
    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}