package ir.androidexception.datatable.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ir.androidexception.datatable.R;
import ir.androidexception.datatable.enums.Gravity;
import ir.androidexception.datatable.model.DataTableRow;
import ir.androidexception.datatable.utility.Util;
import ir.androidexception.datatable.utility.ViewGenerator;

public class RowItemAdapter extends RecyclerView.Adapter<RowItemAdapter.RowItemViewHolder> {
    private Context context;
    private ArrayList<DataTableRow> values;
    private ArrayList<Integer> weights;
    private Integer dividerThickness;
    private Integer dividerColor;
    private Integer rowTextColor;
    private Integer rowBackgroundColor;
    private float verticalPadding;
    private float horizontalPadding;
    private float verticalMargin;
    private float horizontalMargin;
    private float rowTextSize;
    private Typeface typeface;
    private Gravity rowGravity;
    private boolean persianNumber;

    public RowItemAdapter(Context context, ArrayList<DataTableRow> values, ArrayList<Integer> weights, Integer dividerThickness, Integer dividerColor, Integer rowTextColor, Integer rowBackgroundColor,
                          float verticalPadding, float horizontalPadding, float verticalMargin, float horizontalMargin, float rowTextSize,
                          Typeface typeface, Gravity rowGravity, boolean persianNumber) {
        this.context = context;

        if(values!=null) this.values = values;
        else this.values = new ArrayList<>();

        if(weights!=null) this.weights = weights;
        else this.weights = new ArrayList<>();

        this.dividerThickness = dividerThickness;
        this.dividerColor = dividerColor;
        this.rowTextColor = rowTextColor;
        this.rowBackgroundColor = rowBackgroundColor;
        this.verticalPadding = verticalPadding;
        this.horizontalPadding = horizontalPadding;
        this.verticalMargin = verticalMargin;
        this.horizontalMargin = horizontalMargin;
        this.rowTextSize = rowTextSize;
        this.typeface = typeface;
        this.rowGravity = rowGravity;
        this.persianNumber = persianNumber;
    }

    @NonNull
    @Override
    public RowItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RowItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RowItemViewHolder holder, int position) {
        holder.removeAllViews();
        LinearLayout itemLinearLayout = ViewGenerator.generateHorizontalLinearLayout(context);
        LinearLayout valueLinearLayout = ViewGenerator.generateHorizontalLinearLayout(context);
        if(values.get(position).getValues().size()!=weights.size()) return;
        for(int j=0; j<values.get(position).getValues().size(); j++){
            String text = values.get(position).getValues().get(j);
            if(this.persianNumber)
                text = Util.convertToPersianNumbers(text);
            TextView textView = ViewGenerator.generateTextView(context, text, weights.get(j),
                    rowBackgroundColor, rowTextColor, horizontalPadding, verticalPadding, horizontalPadding, verticalPadding,
                    horizontalMargin, verticalMargin, horizontalMargin, verticalMargin, rowTextSize, typeface, Typeface.NORMAL, rowGravity);
            valueLinearLayout.addView(textView);
        }
        itemLinearLayout.addView(valueLinearLayout);

        View divider = ViewGenerator.generateDivider(context, dividerThickness, dividerColor);

        holder.addView(itemLinearLayout);
        holder.addView(divider);
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class RowItemViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout rootItem;
        public RowItemViewHolder(@NonNull View itemView) {
            super(itemView);
            rootItem = itemView.findViewById(R.id.row_item_root);

        }

        private void removeAllViews(){
            rootItem.removeAllViews();
        }

        private void addView(View child){
            rootItem.addView(child);
        }

    }
}
