package com.rashem.doppler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

public class fumberPicker extends android.widget.NumberPicker {

    public fumberPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void addView(View child) {
        super.addView(child);
        updateView(child);
    }

    @Override
    public void addView(View child, int index, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        updateView(child);
    }

    @Override
    public void addView(View child, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, params);
        updateView(child);
    }

    private void updateView(View view) {
        if(view instanceof EditText){
            ((EditText) view).setTextSize(30);

            ((EditText) view).setTextColor(getResources().getColor(R.color.colour_of_numberpicker_text));
        }
    }

}
