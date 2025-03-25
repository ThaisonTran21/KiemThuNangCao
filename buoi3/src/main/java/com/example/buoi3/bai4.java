package com.example.buoi3;

import java.util.List;

public class bai4 {
    public static int getElementAtIndex(List<Integer> danhSach, int index) {
        if (index < 0 || index >= danhSach.size()) {
            throw new IndexOutOfBoundsException("Chỉ mục nằm ngoài phạm vi của danh sách!");
        }
        return danhSach.get(index);
    }
}
