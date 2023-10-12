/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.anhdev.mathutil.main;

import com.anhdev.mathutil.core.MathUtility;

/**
 *
 * @author Tuấn Anh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TEST CASE #1 - N = 0
        int n = 0; // given n = 0, ý là muốn tính 0!
        long expected = 1; // ý muốn là hàm n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); //ý nói rằng hàm chạy ra mấy, invoke, call
        
        //so sánh giữa expected với actual
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
        
        //TEST CASE #2 - N = 1
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
        
        //TEST CASE #3 - N = 5
        System.out.println("5! -> expected: 120" + " | actual = " + MathUtility.getFactorial(5));

    }
    //TEST CASE #2:  Verify getFactorial(With n = 5)
    //STEPS/PROCEDURES:
    //      1.Given n = 5;
    //      2.Call/Invoke getFactorial(n = 5)
    
    //EXPECTED RESULT:
    //       The method must return 120 in case of 5!
    //STASTUS: PASSED/FAILED
    
    
    //TEST CASE #2:  Verify getFactorial(With n = 1)
    //STEPS/PROCEDURES:
    //      1.Given n = 1;
    //      2.Call/Invoke getFactorial(n = 1 )
    
    //EXPECTED RESULT:
    //       The method must return 1 in case of 1!
    //STASTUS: PASSED/FAILED
    

    //MÌNH LÀ DEV, MÌNH PHẢI TEST CODE CỦA MÌNH NGON TRƯỚC ĐÃ
    //MUỐN TEST CODE (DEV) HAY TEST APP (QC/TESTER) THÌ PHẢI CHUẨN BỊ TEST CASE - TÌNH HUỐNG KIỂM THỬ - CÁCH TA KIỂM THỬ
    //TRONG 1 NGỮ CẢNH NÀO ĐÓ - BÀN VỀ BỘ DATA
    //1 TEST CASE CÓ CẤU TRÚC NHƯ SAU:
    //ID | Description | Steps/Procedures | Expected Result | Status (Passed/Failed) 
    
    //DEV  EM MUỐN KIỂM THỬ COI HÀM CHÍNH EM VIẾT getFactorial() đúng hay sai
    //thì em phải viết test case
    
    //Test Case #1: Verify getFactorial(With n = 0;
    //Steps-Procedures:         [Các bước run app để test]
    //      1.Given n = 0;
    //      2.Execute/Call/Invoke funtional getFactorial(0)
    
    //Expected Result: the funtion must return 1 (standing for 0! = 1)
    //Status: PASSED, or FAILED, ai biết, chờ run app/hàm cái đã!!!
    //RUN HÀM, RUN APP, ĐƯA TEST DATA VÀO, ĐƯỢC GỌI LÀ TEST RUN
    
    
}
