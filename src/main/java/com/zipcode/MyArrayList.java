package com.zipcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by vidyachandasekhar on 5/18/17.
 * <p>
 * Part 1:
 * Implement your own version of an ArrayList (we'll call it MyArrayList), with the following features:
 * MyArrayList must be a generic type, which can store any other type of object
 * MyArrayList must not use List, ArrayList or any other collection type in its implementation, only Arrays (The purpose of
 * this is to practice designing your own generic class from the ground up, so that you can appreciate their complexities
 * and usefulness)MyArrayList must have add(), get(), remove(), set(), clear(), isEmpty(), contains() and other methods
 * to provide the same basic functionality described in the ArrayList documentation add() should be overridden to add an
 * element to the end of the Array, or to add the element to a specified index in the array.MyArrayList must have a
 * no-argument constructor (MyArrayList()) to initialize a new instance, it should also have a one-argument constructor
 * (MyArrayList(int)) that takes an int and starts the list off at the specified size.
 * MyArrayList should automatically resize and maintain its order.
 */
public class MyArrayList<E> implements List<E> {

    private E[] arr = null;
    private int lastIndex = -1;


    public MyArrayList(){
        super();
        arr = (E[]) new Object[100];
    }

    public  MyArrayList(int size){
        super();
        arr = (E[]) new Object[size];
    }

    private void doubleTheArray() {
        E[] newArray = (E[]) new Object[arr.length*2];
        for (int i=0; i < arr.length-1;i++){
            newArray[i]= arr[i];
        }
        arr=newArray;
    }


    @Override
    public boolean add(E entry) {

        if(arr.length-1 < lastIndex+1){
            doubleTheArray();
        }
        lastIndex++;

        arr[lastIndex] = entry;
        return true;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public E get(int index) {
        if (index > arr.length - 1) {
            new IndexOutOfBoundsException();
        }
        if (lastIndex < index) {
            return null;
        }
        return arr[index];

    }


    @Override
    public E set(int index, E element) {
        if (index > arr.length - 1) {
            new IndexOutOfBoundsException();
        }
        E previousElement = arr[index];
        arr[index] = element;
        return previousElement;
    }


    @Override
    public E remove(int index) {
        if (index > arr.length - 1) {
            new IndexOutOfBoundsException();
        }
        return removeArrayElement(index);
    }

    @Override
    public boolean remove(Object entry) {
        for (int i = 0; i <= lastIndex - 1; i++) {
            if (arr[i].equals(entry)) {
                removeArrayElement(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object entry) {
        if (lastIndex == -1) {
            return false;
        }
        for (int i = 0; i <= lastIndex; i++) {
            if (arr[i].equals(entry)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    private E removeArrayElement(int removeindex) {
        E previousEntry = arr[removeindex];
        for (int i = removeindex + 1; i <= lastIndex; i++) {
            arr[i - 1] = arr[i];
        }
        arr[lastIndex] = null;
        lastIndex--;
        return previousEntry;
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
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }




    @Override
    public void clear() {
        //recreate the array to clear all the object from existing array
        arr = (E[]) new Object[100];
        lastIndex = -1;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return (lastIndex == -1);

    }


}