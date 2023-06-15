/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.requiem.mathutil.core.test;

import org.requiem.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author acer
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgument0ReturnsWell() {
        long expected = 1;
        long actual = MathUtility.getFactorial(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //same function name, but different data sets
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        
        //DATA DRIVEN TESTING (PARAMETERIZED TEST) DDT
        //extract data sets from test functions
    }

    //how to catch exceptions (n = -1 as example)
    //if getF(-1) EXPECTED = exception
//    @Test(expected = IllegalArgumentException.class)
//    public void testFactorialGivenWrongArgumentThrowsException() {
//        MathUtility.getFactorial(-1);
//    }
    //Junit 4 does not have compare for exceptions
    //Junit 5 has compare exceptions, but must use Lambda
}

//END TEST when all test cases passed
//IF ONLY ONE TEST CASE FAIL, reject all
