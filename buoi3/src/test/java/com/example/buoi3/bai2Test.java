package com.example.buoi3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bai2Test {
    bai2 bai2;

    @BeforeEach
    void setUp() {
        bai2 = new bai2();
    }

    @AfterEach
    void tearDown() {
        bai2 = null;
    }

    @Test
    void testChiaHaiSoDuong() {
        assertEquals(2, bai2.chiaHaiSo(10, 5));
    }

    @Test
    void testChiaHaiSoAm() {
        assertEquals(3, bai2.chiaHaiSo(-9, -3));
    }

    @Test
    void testChiaSoDuongChoSoAm() {
        assertEquals(-4, bai2.chiaHaiSo(8, -2));
    }

    @Test
    void testChiaSoAmChoSoDuong() {
        assertEquals(-5, bai2.chiaHaiSo(-10, 2));
    }

    @Test
    void testChiaChoMot() {
        assertEquals(7, bai2.chiaHaiSo(7, 1));
    }

    @Test
    void testChiaChoTruMot() {
        assertEquals(-6, bai2.chiaHaiSo(6, -1));
    }

    @Test
    void testChiaSoNhoChoSoLon() {
        assertEquals(0, bai2.chiaHaiSo(1, 10));
    }

    @Test
    void testChiaSoLonChoSoNho() {
        assertEquals(5, bai2.chiaHaiSo(10, 2));
    }

    @Test
    void testChiaChoKhongNemNgoaiLe() {
        Exception exception = assertThrows(ArithmeticException.class, () -> bai2.chiaHaiSo(5, 0));
        assertEquals("Không thể chia cho 0", exception.getMessage());
    }

    @Test
    void testChiaKhongDu() {
        assertEquals(2, bai2.chiaHaiSo(5, 2));
    }
}