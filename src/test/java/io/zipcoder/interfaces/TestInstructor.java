package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;



public class TestInstructor {

    @Test
    public void testImplementation() {
        //Given
        Instructor mrCooper = new Instructor(4);

        //Then
        Assert.assertTrue(mrCooper instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        Instructor mrCooper = new Instructor(4);

        //Then
        Assert.assertTrue(mrCooper instanceof Person);

    }

    @Test
    public void testTeach() {
        //Given
        Instructor mrCooper = new Instructor(4);
        Student skywalker = new Student(1);
        double expected = 20;

        //When
        mrCooper.teach(skywalker, expected);
        double actual = skywalker.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testLecture() {
        //Given
        Instructor mrCooper = new Instructor(4);
        Student skywalker = new Student(1);
        Student solo = new Student(2);
        Student[] expected = new Student[2];
        expected[0] = skywalker;
        expected[1] = solo;
        for (int i = 0; i < 2; i++) {
            expected[i].learn(3);
        }

        //When
       Student[] actual = new Student[2];
        actual[0] = skywalker;
        actual[1] = solo;
        mrCooper.lecture(expected, 10);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

}
