package es.upm.miw.iwvg.ecosystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DecimalCollection {
    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        this.validateIsNullOrEmpty();
        return this.collection.stream().mapToDouble(Double::doubleValue).sum();

    }

    private void validateIsNullOrEmpty() {
        if ((this.collection == null) || this.collection.isEmpty()) {
            throw new ArithmeticException("Null or Empty collection");
        }
    }

    public double higher() {
        this.validateIsNullOrEmpty();
        return Collections.max(this.collection);
    }

    public double mean(){
        Iterator<Double> it = this.collection.iterator();
        Double acum =0.0;
        this.validateIsNullOrEmpty();
        while (it.hasNext()){
            acum += it.next();
        }
        return acum / this.collection.size();

    }

    public double min(){
        this.validateIsNullOrEmpty();
        return Collections.min(this.collection);
    }

    public double productorio(){
        Iterator<Double> it = this.collection.iterator();
        Double acum =1.0;
        this.validateIsNullOrEmpty();
        while (it.hasNext()){
            acum = acum * it.next();
        }
        return acum;
    }

}
