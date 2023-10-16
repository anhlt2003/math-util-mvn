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
    
    //Các test case trên không đẹp vì chỉ khác nhau phần data
    //Trong nghề kiểm thử có 1 kĩ thuật là tách hẳn data kiểm thử ra 1 chỗ cho dễ nhing, dễ quản lí được data thiếu đủ hay không
    //Sau đó ta đưa bộ data vào trong câu lệnh so sánh qua các tham số(parameter)
    //Tức là assertequals(expected, actual) là 2 tham số
    //Ứng với bộ data được tách ra
    //                  120     5!
    //                  720     6!
    //                  24      4!
    //                  6       3!
    //                  ...     ...
    //                  Mảng [4][2] {0, 1} {1, 1} {2, 2} {3, 6}
    //Code nhìn gọn, phát hiện thiếu đủ data, test case
    //Kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh -> Được gọi
    //Là DDT - DATA DRIVEN TESTING - Kiểm thử theo hướng tách data riêng rẽ
}
