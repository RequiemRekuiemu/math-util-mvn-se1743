/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.requiem.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.requiem.mathutil.core.MathUtility;
import static org.requiem.mathutil.core.MathUtility.*;

/**
 *
 * @author acer
 */
public class MathUtilityAdvancedTest {

    //method: prepare data sets to fill into assertequals below
    public static Object[][] initTestData() {
        Object testData[][] = {
            {0, 1},
            {1, 1},
            {2, 2},
            {4, 24},
            {5, 120},
            {6, 720}
        };

        return testData;
    }

    //DATA DRIVEN TESTING (PARAMETERIZED TEST) DDT
    //extract data sets from test functions
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }

    @Test
    public void testFactorialGivenWrongArgumentThrowsException() {
//        Executable gF = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtility.getFactorial(-5);
//            }
//        };

        Executable gF = () -> {
            MathUtility.getFactorial(-5);
        };

        assertThrows(IllegalArgumentException.class, gF);
    }
}
