package exampleOne.iterator;

import exampleOne.collection.ToyCar;

public interface Iterator {
    boolean HasNext();
    ToyCar Next();
}
