package exampleOne.iterator;

import exampleOne.collection.ToyCar;
import exampleOne.collection.ToyCarCollection;

public class ToyCarIterator implements Iterator{

    private ToyCarCollection collection;
    private int index;

    public ToyCarIterator(ToyCarCollection collection)
    {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public boolean HasNext() {
        return index < collection.count();
    }

    @Override
    public ToyCar Next() {
        ToyCar car = collection.getCar(index);
        index++;
        return car;
    }
}
