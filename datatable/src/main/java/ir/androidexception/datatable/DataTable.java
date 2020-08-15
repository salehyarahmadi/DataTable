package ir.androidexception.datatable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

import ir.androidexception.datatable.adapter.RowItemAdapter;
import ir.androidexception.datatable.enums.Direction;
import ir.androidexception.datatable.enums.Gravity;
import ir.androidexception.datatable.model.DataTableHeader;
import ir.androidexception.datatable.model.DataTableRow;
import ir.androidexception.datatable.utility.Util;
import ir.androidexception.datatable.utility.ViewGenerator;

public class DataTable extends CardView {
    private float headerTextSize;
    private float rowTextSize;
    private int headerTextColor;
    private int headerBackgroundColor;
    private int rowTextColor;
    private int rowBackgroundColor;
    private Typeface typeface;
    private float headerVerticalPadding;
    private float headerHorizontalPadding;
    private float headerVerticalMargin;
    private float headerHorizontalMargin;
    private float rowVerticalPadding;
    private float rowHorizontalPadding;
    private float rowVerticalMargin;
    private float rowHorizontalMargin;
    private float dividerThickness;
    private int dividerColor;
    private Gravity headerGravity;
    private Gravity rowGravity;
    private float cornerRadius = 8.0f;
    private float shadow = 8.0f;
    private int direction;
    private boolean persianNumber;
    private DataTableHeader header;
    private ArrayList<DataTableRow> rows = new ArrayList<>();

    public DataTable(@NonNull Context context) {
        super(context);
    }

    public DataTable(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        fetchAttrs(context,attrs);
    }

    public DataTable(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        fetchAttrs(context,attrs);
    }

    public float getHeaderTextSize() {
        return headerTextSize;
    }

    public void setHeaderTextSize(float headerTextSize) {
        this.headerTextSize = headerTextSize;
    }

    public float getRowTextSize() {
        return rowTextSize;
    }

    public void setRowTextSize(float rowTextSize) {
        this.rowTextSize = rowTextSize;
    }

    public int getHeaderTextColor() {
        return headerTextColor;
    }

    public void setHeaderTextColor(int headerTextColor) {
        this.headerTextColor = headerTextColor;
    }

    public int getHeaderBackgroundColor() {
        return headerBackgroundColor;
    }

    public void setHeaderBackgroundColor(int headerBackgroundColor) {
        this.headerBackgroundColor = headerBackgroundColor;
    }

    public int getRowTextColor() {
        return rowTextColor;
    }

    public void setRowTextColor(int rowTextColor) {
        this.rowTextColor = rowTextColor;
    }

    public int getRowBackgroundColor() {
        return rowBackgroundColor;
    }

    public void setRowBackgroundColor(int rowBackgroundColor) {
        this.rowBackgroundColor = rowBackgroundColor;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public float getHeaderVerticalPadding() {
        return headerVerticalPadding;
    }

    public void setHeaderVerticalPadding(float headerVerticalPadding) {
        this.headerVerticalPadding = headerVerticalPadding;
    }

    public float getHeaderHorizontalPadding() {
        return headerHorizontalPadding;
    }

    public void setHeaderHorizontalPadding(float headerHorizontalPadding) {
        this.headerHorizontalPadding = headerHorizontalPadding;
    }

    public float getHeaderVerticalMargin() {
        return headerVerticalMargin;
    }

    public void setHeaderVerticalMargin(float headerVerticalMargin) {
        this.headerVerticalMargin = headerVerticalMargin;
    }

    public float getHeaderHorizontalMargin() {
        return headerHorizontalMargin;
    }

    public void setHeaderHorizontalMargin(float headerHorizontalMargin) {
        this.headerHorizontalMargin = headerHorizontalMargin;
    }

    public float getRowVerticalPadding() {
        return rowVerticalPadding;
    }

    public void setRowVerticalPadding(float rowVerticalPadding) {
        this.rowVerticalPadding = rowVerticalPadding;
    }

    public float getRowHorizontalPadding() {
        return rowHorizontalPadding;
    }

    public void setRowHorizontalPadding(float rowHorizontalPadding) {
        this.rowHorizontalPadding = rowHorizontalPadding;
    }

    public float getRowVerticalMargin() {
        return rowVerticalMargin;
    }

    public void setRowVerticalMargin(float rowVerticalMargin) {
        this.rowVerticalMargin = rowVerticalMargin;
    }

    public float getRowHorizontalMargin() {
        return rowHorizontalMargin;
    }

    public void setRowHorizontalMargin(float rowHorizontalMargin) {
        this.rowHorizontalMargin = rowHorizontalMargin;
    }

    public float getDividerThickness() {
        return dividerThickness;
    }

    public void setDividerThickness(float dividerThickness) {
        this.dividerThickness = dividerThickness;
    }

    public int getDividerColor() {
        return dividerColor;
    }

    public void setDividerColor(int dividerColor) {
        this.dividerColor = dividerColor;
    }

    public Gravity getHeadeerGravity() {
        return headerGravity;
    }

    public void setHeaderGravity(Gravity headerGravity) {
        this.headerGravity = headerGravity;
    }

    public Gravity getRowGravity() {
        return rowGravity;
    }

    public void setRowGravity(Gravity rowGravity) {
        this.rowGravity = rowGravity;
    }

    public float getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public float getShadow() {
        return shadow;
    }

    public void setShadow(float shadow) {
        this.shadow = shadow;
    }

    public Direction getDirection() {
        if(this.direction==View.LAYOUT_DIRECTION_LTR)
            return Direction.LRT;
        else
            return Direction.RTL;
    }

    public void setDirection(Direction direction) {
        switch (direction){
            case LRT:
                this.direction = View.LAYOUT_DIRECTION_LTR;
            case RTL:
                this.direction = View.LAYOUT_DIRECTION_RTL;
        }
    }

    public boolean isPersianNumber() {
        return persianNumber;
    }

    public void setPersianNumber(boolean persianNumber) {
        this.persianNumber = persianNumber;
    }

    public DataTableHeader getHeader() {
        return header;
    }

    public void setHeader(DataTableHeader header) {
        this.header = header;
    }

    public ArrayList<DataTableRow> getRows() {
        return rows;
    }

    public void setRows(ArrayList<DataTableRow> rows) {
        this.rows = rows;
    }



    private void fetchAttrs(@NonNull Context context, @Nullable AttributeSet attrs){
        @SuppressLint("CustomViewStyleable")
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.DataTable, 0, 0);
        try {
            this.headerTextSize = ta.getDimension(R.styleable.DataTable_header_text_size, 16.0f);
            this.rowTextSize = ta.getDimension(R.styleable.DataTable_row_text_size, 16.0f);
            this.headerTextColor = ta.getColor(R.styleable.DataTable_header_text_color, Color.BLACK);
            this.headerBackgroundColor = ta.getColor(R.styleable.DataTable_header_background_color, Color.TRANSPARENT);
            this.rowTextColor = ta.getColor(R.styleable.DataTable_row_text_color, Color.BLACK);
            this.rowBackgroundColor = ta.getColor(R.styleable.DataTable_row_background_color, Color.TRANSPARENT);
            this.headerVerticalPadding = ta.getDimension(R.styleable.DataTable_header_vertical_padding, 0.0f);
            this.headerHorizontalPadding = ta.getDimension(R.styleable.DataTable_header_horizontal_padding, 0.0f);
            this.headerVerticalMargin = ta.getDimension(R.styleable.DataTable_header_vertical_margin, 0.0f);
            this.headerHorizontalMargin = ta.getDimension(R.styleable.DataTable_header_horizontal_margin, 0.0f);
            this.rowVerticalPadding = ta.getDimension(R.styleable.DataTable_row_vertical_padding, 0.0f);
            this.rowHorizontalPadding = ta.getDimension(R.styleable.DataTable_row_horizontal_padding, 0.0f);
            this.rowVerticalMargin = ta.getDimension(R.styleable.DataTable_row_vertical_margin, 0.0f);
            this.rowHorizontalMargin = ta.getDimension(R.styleable.DataTable_row_horizontal_margin, 0.0f);
            this.dividerThickness = ta.getDimension(R.styleable.DataTable_divider_thickness, 1.0f);
            this.dividerColor = ta.getColor(R.styleable.DataTable_divider_color, Color.parseColor("#e0e2e5"));
            int rg = ta.getInt(R.styleable.DataTable_row_gravity, 2);
            switch (rg){
                case 0:
                    this.rowGravity = Gravity.RIGHT; break;
                case 1:
                    this.rowGravity = Gravity.CENTER; break;
                case 2:
                    this.rowGravity = Gravity.LEFT; break;
                default:
                    this.rowGravity = Gravity.CENTER; break;
            }
            int hg = ta.getInt(R.styleable.DataTable_header_gravity, 2);
            switch (hg){
                case 0:
                    this.headerGravity = Gravity.RIGHT; break;
                case 1:
                    this.headerGravity = Gravity.CENTER; break;
                case 2:
                    this.headerGravity = Gravity.LEFT; break;
                default:
                    this.headerGravity = Gravity.CENTER; break;
            }
            this.cornerRadius = ta.getDimension(R.styleable.DataTable_corner_radius,8.0f);
            this.shadow = ta.getDimension(R.styleable.DataTable_shadow,8.0f);
            int di  = ta.getInt(R.styleable.DataTable_direction,0);
            this.direction = (di==0) ? View.LAYOUT_DIRECTION_LTR : View.LAYOUT_DIRECTION_RTL;
            this.persianNumber = ta.getBoolean(R.styleable.DataTable_persian_number, false);
        } finally {
            ta.recycle();
        }
    }

    public void inflate(@NonNull Context context){
        if(this.header==null || this.header.getItems()==null || this.header.getItems().size()==0 || this.header.getWeights()==null || this.header.getWeights().size()==0 || this.header.getItems().size()!=this.header.getWeights().size())
            return;
        // table
        LinearLayout tableLinearLayout = ViewGenerator.generateVerticalLinearLayout(context);
        tableLinearLayout.setLayoutDirection(this.direction);

        // table header
        LinearLayout headerLinearLayout = ViewGenerator.generateHorizontalLinearLayout(context);
        for(int i=0; i<this.header.getItems().size(); i++){
            String name = this.header.getItems().get(i);
            Integer weight = this.header.getWeights().get(i);
            if(this.persianNumber)
                name = Util.convertToPersianNumbers(name);
            TextView textView = ViewGenerator.generateTextView(context, name, weight, this.headerBackgroundColor, this.headerTextColor,
                    headerHorizontalPadding, headerVerticalPadding, headerHorizontalPadding, headerVerticalPadding,
                    headerHorizontalMargin, headerVerticalMargin, headerHorizontalMargin, headerVerticalMargin,
                    this.headerTextSize, this.typeface, Typeface.BOLD, headerGravity);
            headerLinearLayout.addView(textView);
        }

        //divider
        View divider = ViewGenerator.generateDivider(context, (int)this.dividerThickness, this.dividerColor);



        // add views
        tableLinearLayout.addView(headerLinearLayout);
        tableLinearLayout.addView(divider);

        // recycler view
        RowItemAdapter adapter = new RowItemAdapter(context, this.rows, this.header.getWeights(), (int)this.dividerThickness, this.dividerColor,
                this.rowTextColor, this.rowBackgroundColor, this.rowVerticalPadding, this.rowHorizontalPadding, this.rowVerticalMargin, this.rowHorizontalMargin,
                this.rowTextSize, this.typeface, this.rowGravity, this.persianNumber);
        tableLinearLayout.addView(ViewGenerator.generateRecyclerView(context,adapter));


        //card view
        this.removeAllViews();
        this.addView(tableLinearLayout);
        this.setRadius(this.cornerRadius);
        this.setCardElevation(this.shadow);
    }


}
