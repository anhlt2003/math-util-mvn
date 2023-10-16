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
        // Dùng đệ quy
        
        return n * getFactorial(n - 1);
    }
    
    //Kĩ thuật kiểm thử gọi là : REGRESSION TESTING
    //                           KIỂM THỬ HỒI QUY - TEST LẠI NHỮNG THỨ
    //                           ĐÃ TỪNG TEST
    //Trong thực tế khi làm dự án, code của chúng ta liên tục được chỉnh sửa
    //Sửa vì:
    //fix bug thì phải sửa code, sửa hàm
    //thêm hàm, thêm tính năng
    //tối ưu hàm cũ, làm hàm cũ gọn hơn, dẽ đọc hơn, chạy nhanh hơn
    //HÀM ĐANG NGON - MÀU XANH, NẾU TA SỬA HÀM THÌ PHẢI TEST LẠI
    //NẾU TEST = TAY, BẰNG LOG, THÌ CỰC KÌ TỐN THỜI GIAN, MẤT SỨC
    //NẾU CODE CỦA TA CÓ SẴN TEST SCRIPT - CODE KIỂM THỬ
    //TA CHỈ VIỆC RUN LẠI CÁI TEST SCRIPT NÀY
    //NẾU HÀM NGON, NÓ PHẢI RA MÀU XANH
    //NHỜ TEST SCRIPT TA VERIFY LẠI 1 HÀM RẤT NHANH -> KIỂM THỬ LẠI
    //THỨ ĐÃ TỪNG KIỂM THỬ ĐỂ ĐẢM BẢO NÓ CÒN NGON SO VỚI LẦN TRƯỚC
    //KHI SỬA ĐƯỢC GỌI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESTING
    //NHỜ CI, HỒI QUY LIÊN TỤC
 
    
    
//    public static long getFactorial(int n){
//        
//        if(n < 0 || n> 20)
//            throw new IllegalArgumentException("Invalid n! n must be 0...20");
//        
//        if(n == 0 || n ==1)
//            return 1;  //kết thúc sớm hàm, nếu có thể
//        
//        long result = 1; // biến tích lũy, gom dồn việc nhân, biến con heo đất
//        
//        //sống sót đến for => n = 2...20
//        for (int i = 2; i <= n; i++)
//            result *= i;
//        
//        return result;
//    }
}
