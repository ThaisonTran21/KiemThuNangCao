package com.example.buoi3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class bai4Test {
    bai4 bai4;
    private final List<Integer> danhSach = Arrays.asList(10, 20, 30, 40, 50);

    @BeforeEach
    void setUp() {
        bai4 = new bai4();
    }

    @AfterEach
    void tearDown() {
        bai4 = null;
    }

    @Test
    void testLayPhanTuHopLe() {
        assertEquals(30, bai4.getElementAtIndex(danhSach, 2));
    }

    @Test
    void testLayPhanTuDauTien() {
        assertEquals(10, bai4.getElementAtIndex(danhSach, 0));
    }

    @Test
    void testLayPhanTuCuoiCung() {
        assertEquals(50, bai4.getElementAtIndex(danhSach, danhSach.size() - 1));
    }

    @Test
    void testChiMucNhoHon0NemNgoaiLe() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                bai4.getElementAtIndex(danhSach, -1));
        assertEquals("Chỉ mục nằm ngoài phạm vi của danh sách!", exception.getMessage());
    }

    @Test
    void testChiMucVuotQuaDoDaiNemNgoaiLe() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                bai4.getElementAtIndex(danhSach, danhSach.size()));
        assertEquals("Chỉ mục nằm ngoài phạm vi của danh sách!", exception.getMessage());
    }
}