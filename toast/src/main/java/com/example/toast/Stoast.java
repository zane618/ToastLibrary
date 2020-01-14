package com.example.toast;

import android.content.Context;
import android.widget.Toast;

/**
 * create by zhangshi on 2020/1/14.
 */
public class Stoast {

    public static void show(Context context, String content) {
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }
}
