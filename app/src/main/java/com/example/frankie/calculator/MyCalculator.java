package com.example.frankie.calculator;

/**
 * Created by Frankie on 10/11/2016.
 */

public class MyCalculator {

/////////////////////////////Initializing the properties

    public double firstNumber;
    public double secondNumber;
    public String action;

//////////////////////////Setting up the methods

    public double add(double firstNumber,double secondNumber){
        double r=firstNumber+secondNumber;
        return r;
    }

    public double subtract(double firstNumber,double secondNumber){
        double r=firstNumber-secondNumber;
        return r;
    }

    public double multiply(double firstNumber,double secondNumber){
        double r=firstNumber*secondNumber;
        return r;
    }

    public double divide(double firstNumber,double secondNumber){
        double r=firstNumber/secondNumber;
        return r;
    }


////////////////////////Getters and Setters

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}