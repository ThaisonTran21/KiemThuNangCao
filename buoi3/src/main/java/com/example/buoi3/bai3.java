package com.example.buoi3;

import java.util.List;

public class bai3 {
    public static double tinhTrungBinh(List<Integer> danhSach) {
        if (danhSach.isEmpty()) {
            throw new ArithmeticException("Danh sách rỗng, không thể tính trung bình");
        }
        return danhSach.stream().mapToInt(Integer::intValue).average()
                .orElseThrow(() -> new ArithmeticException("Không thể tính trung bình"));
    }
}
