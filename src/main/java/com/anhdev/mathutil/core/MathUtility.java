/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhdev.mathutil.core;

/**
 *
 * @author Tuấn Anh
 */
//Chứa các hàm static dùng làm thư viện cho ccs nơi khác/class khác dùng
public class MathUtility {
    public static final double PI = 3.14;
    // public const double PI = 3.14; //C# không cần static
                                        // vì const ~ final
    
    //0!=1! = 1- quy ước
    //Không tính được giai thừa âm
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 số 0;
    //quy ước <0! và >20! NÉM NGOẠI LỆ, KHÔNG TÍNH ĐƯỢC
    public static long getFactorial(int n){
        
        if(n < 0 || n> 20)
            throw new IllegalArgumentException("Invalid n! n must be 0...20");
        
        if(n == 0 || n ==1)
            return 1;  //kết thúc sớm hàm, nếu có thể
        
        long result = 1; // biến tích lũy, gom dồn việc nhân, biến con heo đất
        
        //sống sót đến for => n = 2...20
        for (int i = 2; i <= n; i++)
            result *= i;
        
        return result;
    }
}
