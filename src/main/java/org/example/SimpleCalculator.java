package org.example;

public class SimpleCalculator {

    public int addTest1(int numA,int numB){
        int sum = numA + numB;
        return sum;
    }

    public int add (int... numbers){

    int sum = 0;
    for (int number : numbers)
    {
        sum +=number;
    }
        return sum;
    }

    public int multiplyTest3(int numA, int numB){
        int sum = numA *numB;
        return sum;
    }

    public int multiply(int... numbers){
        int sum =1;
        for(int number : numbers) {
        sum *= number;
        }
        return sum;

    }

}
