package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {

    @Test
    public void testImplementation() {
        //Given
        Student skywalker = new Student(1L);
        //Then
        Assert.assertTrue(skywalker instanceof Learner);

    }

    @Test
    public void testInheritance() {
        //Given
        Student skywalker = new Student(1L);
        //Then
        Assert.assertTrue(skywalker instanceof Person);

    }
    @Test
    public void testLearn() {
        //Given
        Student skywalker = new Student(1L);
        Double expected = 25.0;
        //When
        skywalker.learn(expected);
        Double actual = skywalker.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual);

    }
}
