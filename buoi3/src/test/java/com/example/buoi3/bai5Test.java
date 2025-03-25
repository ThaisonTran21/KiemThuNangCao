package com.example.buoi3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bai5Test {

    bai5 bai5;
    @BeforeEach
    void setUp() {
        //bai5 = new bai5();
    }

    @AfterEach
    void tearDown() {
        bai5 = null;
    }

    @Test
    void testLayTenNguoiDungHopLe() {
        bai5 hoSo = new bai5("Nguyen Van A");
        assertEquals("Nguyen Van A", hoSo.getTenNguoiDung());
    }

    @Test
    void testHoSoKhongCoTenNemNgoaiLe() {
        bai5 hoSo = new bai5(null);
        Exception exception = assertThrows(NullPointerException.class, hoSo::getTenNguoiDung);
        assertEquals("Hồ sơ không có tên người dùng!", exception.getMessage());
    }
}