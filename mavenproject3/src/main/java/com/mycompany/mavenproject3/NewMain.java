/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enter your social security number and the three funny numbers on the back of your credit card
    Scanner deez = new Scanner(System.in);
    
    System.out.println("Please enter the course name.");
    String courseName = deez.nextLine();
    
    System.out.println("Please enter the average time spent in a week for this course in minutes.");
    int courseTime = deez.nextInt();
    
    System.out.println("Please enter the homework grades for this course.");
    int a = deez.nextInt();
    int b = deez.nextInt();
    int c = deez.nextInt();
    int d = deez.nextInt();
    
    System.out.println("Please enter the quiz grades for this course.");
    double x = deez.nextDouble();
    double y = deez.nextDouble();
    
    System.out.println("Please enter the final exam grade for this course.");
    double z = deez.nextDouble();
    
    //math bits
    int courseTimeHours = courseTime/60;
    int courseTimeMin = courseTime%60;
    
    double hwAverage = (double) ((a+b+c+d)/4.0);
    
    double quizAverage = (double) ((x + y)/2);
    
    int examGrade = (int) ((hwAverage * 0.35) + (quizAverage * 0.15) + (z * 0.5) + 0.5);
    
    //re output bits
    System.out.println("Course name: " + courseName);
    System.out.println("Weekly time spent: " + courseTimeHours + "h" + courseTimeMin);
    System.out.println("Average homework grade: " + hwAverage);
    System.out.println("Average quiz grade: " + quizAverage);
    System.out.println("Final exam grade: " + z);
    System.out.println("Overall grade: " + examGrade);
    }
    
}
