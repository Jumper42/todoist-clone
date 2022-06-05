package com.bawp.todoister.util;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.bawp.todoister.model.Priorty;
import com.bawp.todoister.model.Task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    //Date'i formatlamamızı sağlayacak helper function
    public static String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance();
        simpleDateFormat.applyPattern("MMM d"	);

        return simpleDateFormat.format(date);
    }

    public static void hideSoftKeyboard(View view){
        InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(
                Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public  static int priorityColor(Task task){
        int color;
        if(task.getPriorty() == Priorty.HIGH){
            color = Color.argb(200, 201, 21, 23);
        } else if(task.getPriorty() == Priorty.MEDIUM){
            color = Color.argb(200, 235, 185, 0);
        } else {
            color = Color.argb(200, 51, 181, 159);
        }
        return color;
    }
}
