package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //Given
        Person skywalker = new Person(1L);
        //When
        long expected = 1L;
        long actual = skywalker.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Given
        String expected = "Skywalker";
        Person testPerson = new Person(1L);
        //When
        testPerson.setName(expected);
        //Then
        String actual = testPerson.getName();
        Assert.assertEquals(expected, actual);
    }
}
