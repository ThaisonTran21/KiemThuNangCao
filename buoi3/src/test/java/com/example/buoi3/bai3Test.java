package com.example.buoi3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class bai3Test {
    bai3 bai3;
    @BeforeEach
    void setUp() {
        bai3 = new bai3();
    }

    @AfterEach
    void tearDown() {
        bai3 = null;
    }

    @Test
    void testTrungBinhDanhSachBinhThuong() {
        assertEquals(3.0, bai3.tinhTrungBinh(Arrays.asList(2, 3, 4)), 0.001);
    }

    @Test
    void testTrungBinhSoAm() {
        assertEquals(-2.0, bai3.tinhTrungBinh(Arrays.asList(-1, -2, -3)), 0.001);
    }

    @Test
    void testTrungBinhMotPhanTu() {
        assertEquals(5.0, bai3.tinhTrungBinh(Arrays.asList(5)), 0.001);
    }

    @Test
    void testTrungBinhCoSoKhong() {
        assertEquals(2.0, bai3.tinhTrungBinh(Arrays.asList(0, 3, 3)), 0.001);
    }

    @Test
    void testTrungBinhSoLon() {
        assertEquals(500000.0, bai3.tinhTrungBinh(Arrays.asList(100000, 500000, 900000)), 0.001);
    }

    @Test
    void testTrungBinhDanhSachRongNemNgoaiLe() {
        Exception exception = assertThrows(ArithmeticException.class, () -> bai3.tinhTrungBinh(Arrays.asList()));
        assertEquals("Danh sách rỗng, không thể tính trung bình", exception.getMessage());
    }
}