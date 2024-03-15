package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getExamScores() {
        String printExamScores = "Exam Scores:\n";
        for(int i =0;i <= examScores.size()-1;i++){
            printExamScores += "Exam "+ ((int)i+1) +" -> "+examScores.get(i) + "\n";
        }
        return printExamScores;

    }

    public void addExamScore(double examScoreToBeAdded) {
        examScores.add(examScoreToBeAdded);
    }

    public void setExamScore(int index, double updateExamScore) {
        examScores.set(index, updateExamScore);
    }

    public Double getAverageExamScore(){
        double total = 0;
        for(int i = 0; i < examScores.size();i++){
            total += examScores.get(i);
        }
        double average = total / examScores.size();
        return average;
    }


    @Override
    public String toString(){
        return "Student Name: "+getFirstName()+" "+getLastName()+
                "\n"+">"+" Average Score: "+getAverageExamScore()+
                "\n"+"> "+getExamScores();
    }
}
