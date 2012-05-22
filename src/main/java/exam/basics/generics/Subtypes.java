package exam.basics.generics;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * User: andrey.osipov
 */
public class Subtypes {

    public static void main(String[] args) {
//        ERROR!!!  lionCage "is not a" animalCage
//        Cage<Animal> animalCage = new Cage<Lion>();
    }
}

/*
*  Cage for animals
*/

class Cage<E> extends AbstractCollection<E> {

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

// Animals

interface Animal {
}

class Lion implements Animal {
}