package ir.androidexception.datatable.utility;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import ir.androidexception.datatable.adapter.RowItemAdapter;

public class ViewGenerator {
    @SuppressLint("RtlHardcoded")
    public static TextView generateTextView(Context context, String text, int weight, @ColorInt Integer backgroundColor, @ColorInt Integer textColor,
                                            float leftPadding, float topPadding, float rightPadding, float bottomPadding,
                                            float leftMargin, float topMargin, float rightMargin, float bottomMargin,
                                            float textSize, Typeface typeface, Integer style, ir.androidexception.datatable.enums.Gravity gravity){
        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0,LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.weight = weight;
        layoutParams.leftMargin = (int)leftMargin;
        layoutParams.topMargin = (int)topMargin;
        layoutParams.rightMargin = (int)rightMargin;
        layoutParams.bottomMargin = (int)bottomMargin;
        tv.setLayoutParams(layoutParams);
        tv.setBackgroundColor(backgroundColor!=null ? backgroundColor : Color.TRANSPARENT);
        tv.setTextColor(textColor!=null ? textColor : Color.BLACK);
        switch (gravity){
            case RIGHT:
                tv.setGravity(Gravity.RIGHT);
                break;
            case CENTER:
                tv.setGravity(Gravity.CENTER);
                break;
            case LEFT:
                tv.setGravity(Gravity.LEFT);
                break;
        }
        tv.setPadding((int)leftPadding,(int)topPadding,(int)rightPadding,(int)bottomPadding);
        tv.setTextSize(textSize);
        if (typeface!=null) tv.setTypeface(typeface, style!=null ? style : Typeface.NORMAL);
        else tv.setTypeface(null, style!=null ? style : Typeface.NORMAL);
        return tv;
    }

    public static RecyclerView generateRecyclerView(Context context, RowItemAdapter rowItemAdapter){
        RecyclerView recyclerView = new RecyclerView(context);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setId(View.generateViewId());
        recyclerView.setAdapter(rowItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false));
        return recyclerView;
    }

    public static LinearLayout generateVerticalLinearLayout(Context context){
        LinearLayout verticalLinearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        verticalLinearLayout.setOrientation(LinearLayout.VERTICAL);
        verticalLinearLayout.setId(View.generateViewId());
        verticalLinearLayout.setLayoutParams(layoutParams);
        return verticalLinearLayout;
    }

    public static LinearLayout generateHorizontalLinearLayout(Context context){
        LinearLayout horizontalLinearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        horizontalLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        horizontalLinearLayout.setId(View.generateViewId());
        horizontalLinearLayout.setLayoutParams(layoutParams);
        horizontalLinearLayout.setGravity(Gravity.CENTER_VERTICAL);
        return horizontalLinearLayout;
    }

    public static View generateDivider(Context context, Integer height, @ColorInt Integer color){
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height!=null ? height : 1);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(color!=null ? color : Color.parseColor("#e0e2e5"));
        view.setId(View.generateViewId());
        return view;
    }
}
