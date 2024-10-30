package exampleTwo.iterators;

import exampleTwo.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
