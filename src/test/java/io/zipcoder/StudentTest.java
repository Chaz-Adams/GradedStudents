package io.zipcoder;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

public class StudentTest {


// Developer Advocate jobs (leadership and technical)

    @Test
    public void testConstructor(){
        String firstname = "Chaz";
        String lastname = "Adams";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student1 = new Student(firstname,lastname,examScores);

        Assert.assertEquals(firstname, student1.getFirstName());
        Assert.assertEquals(lastname, student1.getLastName());
        //Assert.assertEquals(examScores, student1.getExamScores());
    }

    @Test
    public void testSetAndGetFirstName() {
        String expectedFirstName = "Chaz";
        Student student = new Student(null,null,null);
        student.setFirstName(expectedFirstName);

        Assert.assertEquals(expectedFirstName, student.getFirstName());
    }

    @Test
    public void testSetAndGetLastName() {
        String expectedLastName = "Adams";
        Student student = new Student(null,null,null);
        student.setLastName(expectedLastName);

        Assert.assertEquals(expectedLastName, student.getLastName());
    }

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
                100.0+"\n"+95.0+"\n";
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
        String expectedExamScore = "Exam Scores: \n"+ 100.0+"\n";
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
        String expectedExamScore = "Exam Scores: \n"+ 100.0+"\n";
        student.setExamScore(0,100.0);
        String actualExamScore = student.getExamScores();

        Assert.assertEquals(expectedExamScore, actualExamScore);

    }

    @Test
    public void testGetAverageExamScore(){
        String firstName = "Leon";
        String lastName = "Hunter";
        double exam1 = 100.0;
        double exam2 = 90.0;
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(exam1);
        examScores.add(exam2);

        Student student = new Student(firstName, lastName, examScores);

        Double expectedAverageScore = (exam1 + exam2) / 2;

        Double output = student.getAverageExamScore();

        Assert.assertEquals(expectedAverageScore,output);
    }

    @Test
    public void testToString(){
        String firstName = "Leon";
        String lastName = "Hunter";
        double exam1 = 100.0;
        double exam2 = 90.0;
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(exam1);
        examScores.add(exam2);

        Student student = new Student(firstName, lastName, examScores);
        String expectedOutput = "Student Name: Leon Hunter\n" +
                "> Average Score: 95.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 -> 100.0\n" +
                "Exam 2 -> 90.0\n";
        String actualOutput = student.toString();

        Assert.assertEquals(expectedOutput,actualOutput);
    }

}
