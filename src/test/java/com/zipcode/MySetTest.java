package com.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by vidyachandasekhar on 5/19/17.
 */

public class MySetTest {
    MySet<String> mySet;
    ArrayList<String> mylist;

    @Before
    public void setUp() {
        mySet = new MySet();
        mylist= new ArrayList<String>();
        mylist.add("ZipCode");
        mylist.add("Wilmington");
        mylist.add("2017");

    }

    @Test
    public void addTest() {
        //given
        int expected = 1;

        //when
        boolean result = mySet.add("Stephen");
        int actual = mySet.size();

        //then
        assertEquals("Size of set should be 1", expected, actual);
        assertTrue("The result of the add is true ", result);

    }

    @Test
    public void addTestDoesNotWork() {
        //given
        int expected = 1;

        //when
        mySet.add("Stephen");
        boolean result = mySet.add("Stephen");
        int actual = mySet.size();


        //then
        assertEquals("Size of set should be 1", expected, actual);
        assertFalse("The result of the 2nd add is false", result);


    }
    @Test
    public void addAllTestThreeAdded(){
        //Given
        mylist.add("ZipCode");
        mylist.add("Dr.Yoo");
        mylist.add("Dr.Yoo");
        int expected = 4;

        //When
        boolean result = mySet.addAll(mylist);
        int actual = mySet.size();

        //Then
        assertEquals("Size of set should be 4",expected,actual);
        assertTrue("Result of add is true", result);


    }

    @Test
    public void addAllTest() throws Exception {
        //Given
        mySet.add("Yoo");
        mySet.add("Yoo");
        int expected =4 ;

        //When
        mySet.addAll(mylist);
        int actual =mySet.size();

        //Then
        assertEquals("Size of set should be 4",expected,actual);
        assertTrue("Result of addAll is true", true);
    }

    @Test
    public void clearTest() {
        //Given
        int expected = 0;

        //When

        mySet.add("Paco");
        //Then

    }

    @Test
    public void contains() throws Exception {
    }

    @Test
    public void isEmpty() throws Exception {
    }

    @Test
    public void removeTestFail() {
        //Given
        mySet.add("Vilena");
        mySet.add("Vidya");
        int expected =2;

        //When
        boolean result =mySet.remove("paco");
        int actual =mySet.size();
        //Then
        assertFalse("paco was not in the set",result);
        assertEquals("Size of set is still 2", expected, actual);
    }


    @Test
    public void removeTestSuccess() {
        //Given
        mySet.add("Del");
        mySet.add("NJ");
        int expected =1 ;

        //When
        boolean result =mySet.remove("NJ");
        int actual = mySet.size();
        //Then
        assertTrue("paco was not in the set",result);
        assertEquals("Size of set should now be 1",expected,actual);
    }

    @Test
    public void size() throws Exception {
    }

    @Test
    public void toArray() throws Exception {
    }

    @Test
    public void toArray1() throws Exception {
    }

}
