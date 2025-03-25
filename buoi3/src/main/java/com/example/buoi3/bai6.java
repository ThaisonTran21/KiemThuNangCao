package com.example.buoi3;

public class bai6 {
    public static int timPhanTuNhoNhat(int[] mang) {
        if (mang == null || mang.length == 0) {
            throw new IllegalArgumentException("Mảng rỗng, không thể tìm phần tử nhỏ nhất!");
        }

        int min = mang[0];
        for (int so : mang) {
            if (so < min) {
                min = so;
            }
        }
        return min;
    }
}
