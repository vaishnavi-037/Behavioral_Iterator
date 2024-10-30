package exampleOne;

import exampleOne.collection.ToyCar;
import exampleOne.collection.ToyCarCollection;
import exampleOne.iterator.Iterator;

public class Application {
    public static void main(String[] args) {
        ToyCarCollection carCollection = new ToyCarCollection();

        carCollection.addCar(new ToyCar("Hot Wheels", "Red"));
        carCollection.addCar(new ToyCar("Matchbox", "Blue"));
        carCollection.addCar(new ToyCar("Disney", "Yellow"));

        Iterator iterator = carCollection.createIterator();

        while (iterator.HasNext()) {
            ToyCar car = iterator.Next();
            System.out.println("Brand: " + car.getBrand() + ", Color: " + car.getColor());
        }
    }
}
