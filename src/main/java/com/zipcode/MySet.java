package com.zipcode;

import java.util.Arrays;
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
public class MySet<E> {
    private Object[] theArray;
    private int sizeOfSet;

    public MySet() {
        theArray = (E[]) new Object[0];
        sizeOfSet = 0;

    }

    public boolean add(E element) {
        if (contains(element)) {
            return false;
        }
        if (theArray.length == sizeOfSet)
            theArray = Arrays.copyOf(theArray, theArray.length + 1);
        theArray[sizeOfSet++] = element;
        return true;
    }

    boolean addAll(Collection<? extends E> collection) {
        boolean result = false;
        for (E element : collection) {
            if (add(element)) {
                result = true;
            }
            System.out.println(sizeOfSet);

        }    return result;

    }

    public void clear() {
        theArray = (E[]) new Object[0];
        sizeOfSet = 0;
    }

    public boolean contains(Object obj) {

        for (int i = 0; i < sizeOfSet; i++) {
            if (theArray[i].equals(obj))
                return true;
        }
        return false;
    }

    public boolean equal (Object o){

        return false;
    }


    public boolean isEmpty() {
        return false;
    }

    public boolean remove(Object O) {
        boolean result= false;
        for (int i=0;i <sizeOfSet; i++){
            if(theArray[i].equals(O)){
                //Shifts all the elements to the right of this to the left
                for(int j=i;j< sizeOfSet -1 ; j++){
                    theArray[j] = theArray[j+1];
                }
                sizeOfSet--;
                result = true;
            }
        }
        return result;
    }

    public int size() {
        return sizeOfSet;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    //public <T> T[] toArray(T []){
    //    return (T[]) new Object [0];
    //}


}