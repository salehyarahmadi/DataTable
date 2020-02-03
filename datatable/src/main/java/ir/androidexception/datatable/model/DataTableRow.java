package ir.androidexception.datatable.model;

import java.util.ArrayList;

public class DataTableRow {
    private ArrayList<String> values;

    public DataTableRow(ArrayList<String> values) {
        this.values = values;
    }

    public ArrayList<String> getValues() {
        return values;
    }

    public void setValues(ArrayList<String> values) {
        this.values = values;
    }

    public static class Builder{
        private ArrayList<String> values = new ArrayList<>();

        public Builder value(String value){
            this.values.add(value);
            return this;
        }

        public Builder values(ArrayList<String> values){
            this.values = values;
            return this;
        }

        public DataTableRow build(){
            return new DataTableRow(this.values);
        }
    }
}
