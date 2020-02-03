package ir.androidexception.datatable.model;

import java.util.ArrayList;

public class DataTableHeader {
    private ArrayList<String> items;
    private ArrayList<Integer> weights;

    public DataTableHeader(ArrayList<String> items, ArrayList<Integer> weights) {
        this.items = items;
        this.weights = weights;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public ArrayList<Integer> getWeights() {
        return weights;
    }

    public void setWeights(ArrayList<Integer> weights) {
        this.weights = weights;
    }

    public static class Builder{
        private ArrayList<String> items = new ArrayList<>();
        private ArrayList<Integer> weights = new ArrayList<>();

        public Builder item(String name, Integer weight){
            items.add(name);
            weights.add(weight);
            return this;
        }


        public DataTableHeader build(){
            return new DataTableHeader(this.items,this.weights);
        }
    }
}
