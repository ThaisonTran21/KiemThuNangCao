package com.example.buoi3;

public class bai5 {
    private String tenNguoiDung;

    // Constructor đúng cú pháp
    public bai5(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getTenNguoiDung() {
        if (tenNguoiDung == null) {
            throw new NullPointerException("Hồ sơ không có tên người dùng!");
        }
        return tenNguoiDung;
    }
}
