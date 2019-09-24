package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;
    public Student(Long id) {
        super(id);
    }

    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;

    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }



}
