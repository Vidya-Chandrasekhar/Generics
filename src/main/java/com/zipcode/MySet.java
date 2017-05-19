package com.zipcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by vidyachandasekhar on 5/18/17.
 *
 * Implement your own version of a Set (let's call it MySet ... seeing a pattern here?), with the following features:
 * MySet must be a generic type, which can store any other type of object
 * An instance of MySet must contain no duplicates
 *MySet must not use List, ArrayList, or any other built-in collection types in its implementation. You may use Arrays, and you may use your implementation of MyArrayList (if it helps -- you don't have to use it)
 * MySet must have all of the methods listed on the Java Set documentation
 *
 */
public class MySet<E>
        implements Set
{

    @Override
    public int size() {

        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
