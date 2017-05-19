package com.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vidyachandasekhar on 5/18/17.
 */
public class MyArrayListTest {
    @Test
    public void testAddAndGet() throws Exception {
        //Given

        MyArrayList<String> myArrayList =new MyArrayList();
        //When
        myArrayList.add("Foo");
        //Then
        Assert.assertEquals("Foo", myArrayList.get(0));
    }


    @Test
    public void testRemoveAndContains() throws Exception {
        //Given
        MyArrayList<String> myArrayList =new MyArrayList();
        myArrayList.add("Foo1");
        myArrayList.add("Foo2");
        //When
        myArrayList.remove("Foo1");

        //Then
        Assert.assertFalse(myArrayList.contains("Foo1"));
    }



    @Test
    public void testSet() throws Exception {
        //Given
        MyArrayList<String> myArrayList =new MyArrayList();
        myArrayList.add("Foo1");
        myArrayList.add("Foo2");
        myArrayList.add("Foo3");

        //when
        myArrayList.set(1,"Bar1");

        //then
        assertEquals("Bar1", myArrayList.get(1));
    }

    @Test
    public void testClear() throws Exception {
        //Given
        MyArrayList<String> myArrayList =new MyArrayList();
        myArrayList.add("Foo1");
        myArrayList.add("Foo2");
        myArrayList.add("Foo3");

        //when
        myArrayList.clear();

        //then
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testIsEmpty() throws Exception {
        //Given
        MyArrayList<String> myArrayList =new MyArrayList();

        //then
        assertTrue(myArrayList.isEmpty());

    }

    @Test
    public void testContains() throws Exception {
        //Given
        MyArrayList<String> myArrayList =new MyArrayList();

        myArrayList.add("Foo1");
        myArrayList.add("Foo2");
        myArrayList.add("Foo3");

        //then
        assertTrue(myArrayList.contains("Foo3"));

    }

}