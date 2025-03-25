package com.example.buoi3;

public class bai2 {
    public static int chiaHaiSo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }
}
