package ir.androidexception.datatableexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

import ir.androidexception.datatable.DataTable;
import ir.androidexception.datatable.model.DataTableHeader;
import ir.androidexception.datatable.model.DataTableRow;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataTable dt = findViewById(R.id.dt);
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/iran_sans.ttf");
        DataTableHeader header = new DataTableHeader.Builder()
                .item("Product Name" , 3)
                .item("Quantity", 1)
                .item("Price", 2)
                .item("Discount", 2)
                .build();
        ArrayList<DataTableRow> rows = new ArrayList<>();
        for(int i=0;i<200;i++){
            Random r = new Random();
            int random = r.nextInt(i+1);
            int randomDiscount = r.nextInt(20);
            DataTableRow row = new DataTableRow.Builder()
                    .value("Product #" + i)
                    .value(String.valueOf(random))
                    .value(String.valueOf(random*1000).concat("$"))
                    .value(String.valueOf(randomDiscount).concat("%"))
                    .build();
            rows.add(row);
        }
        dt.setTypeface(tf);
        dt.setHeader(header);
        dt.setRows(rows);
        dt.inflate(this);
    }
}
