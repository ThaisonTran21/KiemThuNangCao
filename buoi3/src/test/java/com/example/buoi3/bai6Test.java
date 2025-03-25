package com.example.buoi3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bai6Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testTimPhanTuNhoNhatBinhThuong() {
        assertEquals(1, bai6.timPhanTuNhoNhat(new int[]{3, 1, 4, 5, 2}));
    }

    @Test
    void testTimPhanTuNhoNhatAm() {
        assertEquals(-5, bai6.timPhanTuNhoNhat(new int[]{-1, -3, -5, -2}));
    }

    @Test
    void testTimPhanTuNhoNhatMotPhanTu() {
        assertEquals(7, bai6.timPhanTuNhoNhat(new int[]{7}));
    }

    @Test
    void testTimPhanTuNhoNhatSoLon() {
        assertEquals(100, bai6.timPhanTuNhoNhat(new int[]{500, 200, 100, 300}));
    }

    @Test
    void testMangRongNemNgoaiLe() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> bai6.timPhanTuNhoNhat(new int[]{}));
        assertEquals("Mảng rỗng, không thể tìm phần tử nhỏ nhất!", exception.getMessage());
    }
}