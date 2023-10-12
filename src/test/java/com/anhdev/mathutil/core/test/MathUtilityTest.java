/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anhdev.mathutil.core.test;

import com.anhdev.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tuấn Anh
 */
public class MathUtilityTest {
        
    //Test case #1 - Verify getFacorial(with n = 0)
    //Steps/Procedures
    //      1.Given n = 0;
    //      2.Call/Invoke getFactorial(n = 0 )
    //Expected Result:
    //      The method must return 1 as the result of 0! = 1;
    //Status: PASSED||FAILED chờ tới lúc runtime mới biết
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk(){
        
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
}
