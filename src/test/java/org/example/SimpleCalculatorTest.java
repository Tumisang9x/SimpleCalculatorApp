package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addShouldReturnThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test case 1
        assertEquals(3,calculator.addTest1(1,2));
    }
    @Test
    void addShouldReturnNegativeTwo(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test case 2
        assertEquals(-2,calculator.addTest1(-1,-1));
    }

    @Test
    void addSumShouldReturnFifteen(){
        SimpleCalculator calculator = new SimpleCalculator();
        // Test case 3
        assertEquals(15,calculator.add(1,2,3,4,5));
    }
    @Test
    void addSumShouldReturnThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test case 4
        assertEquals(3, calculator.add(1,2));
    }
    @Test
    void addSumShouldReturnNegative2(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test case 5
        assertEquals(-2,calculator.add(-1,-1));

    }
    @Test
    void multipleSumShouldReturnThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test Case 6
        assertEquals(3,calculator.multiplyTest3(1,3));
    }
    @Test
    void multipleSumShouldReturnNegativeThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test Case 7
        assertEquals(-3,calculator.multiplyTest3(-1,3));
    }


    @Test
    void sumShouldReturnOneHundredAndTwenty(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test Case 8
        assertEquals(120,calculator.multiply(1,2,3,4,5));
    }
    @Test
    void sumShouldReturnThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test Case 9
        assertEquals(3,calculator.multiply(1,3));
    }
    @Test
    void sumShouldReturnNegativeThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        //Test Case 10
        assertEquals(-3,calculator.multiply(-1,3));
    }

}
