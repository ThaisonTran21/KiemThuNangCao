package com.example.buoi3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bai1Test {
    bai1 bai1;

    @BeforeEach
    void setUp() {
    bai1 = new bai1();
    }

    @AfterEach
    void tearDown() {
        bai1 = null;
    }

    @Test
    void testSoNguyenDuong() {
        assertEquals(20, bai1.nhanHaiSo(4, 5));
    }

    @Test
    void testSoNguyenAm() {
        assertEquals(6, bai1.nhanHaiSo(-2, -3));
    }

    @Test
    void testSoNguyenDuongVaAm() {
        assertEquals(-15, bai1.nhanHaiSo(3, -5));
    }

    @Test
    void testNhanVoiKhong() {
        assertEquals(0, bai1.nhanHaiSo(7, 0));
    }

    @Test
    void testNhanVoiMotVaTruMot() {
        assertEquals(-1, bai1.nhanHaiSo(1, -1));
    }

    @Test
    void testNhanVoiMaxInt() {
        assertEquals(Integer.MAX_VALUE, bai1.nhanHaiSo(Integer.MAX_VALUE, 1));
    }

    @Test
    void testNhanVoiMinInt() {
        assertEquals(Integer.MIN_VALUE, bai1.nhanHaiSo(Integer.MIN_VALUE, 1));
    }

    @Test
    void testDauVaoKhongPhaiSoNguyenKyTu() {
        assertFalse(bai1.laSoNguyen('A'));
    }

    @Test
    void testDauVaoKhongPhaiSoNguyenSoThapPhan() {
        assertFalse(bai1.laSoNguyen(3.5));
    }

    @Test
    void testDauVaoNull() {
        assertFalse(bai1.laSoNguyen(null));
    }
}