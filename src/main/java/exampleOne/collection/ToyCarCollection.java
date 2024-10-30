package exampleOne.collection;

import exampleOne.iterator.Iterator;
import exampleOne.iterator.ToyCarIterator;

import java.util.ArrayList;
import java.util.List;

public class ToyCarCollection {
    private List<ToyCar> cars = new ArrayList<>();

    public void addCar(ToyCar car)
    {
        cars.add(car);
    }


// The most important method is CreateIterator, which returns an instance of the iterator
// for this collection.
    public Iterator createIterator()
    {
        return new ToyCarIterator(this);
    }

    public int count()
    {
        return cars.size();
    }

    public ToyCar getCar(int index)
    {
        return cars.get(index);
    }
}
