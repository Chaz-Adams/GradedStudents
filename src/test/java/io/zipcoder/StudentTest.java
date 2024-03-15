package io.zipcoder;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class StudentTest {



    @Test
    public void testGetExamScores(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.00);
        examScores.add(95.0);
        Student student = new Student(firstName, lastName, examScores);

        String expectedExamScores = "Exam Scores: \n"+
                100.0+"\n"+95.0;
        // When
        String actualExamScores = student.getExamScores();

        // Then
        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void testAddExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);

        // When
        String expectedExamScore = "Exam Scores: \n"+ 100.0;
        student.addExamScore(100.0);
        String actualExamScore = student.getExamScores();

        // Then
        Assert.assertEquals(expectedExamScore, actualExamScore);

    }

    @Test
    public void testSetExamScoreTest() {
        String firstName = "Joe";
        String lastName = "Smith";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(85.0);
        String expectedExamScore = "Exam Scores: \n"+ 100.0;
        student.setExamScore(0,100.0);
        String actualExamScore = student.getExamScores();

        Assert.assertEquals(expectedExamScore, actualExamScore);

    }




}