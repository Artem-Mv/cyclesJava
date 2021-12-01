package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void mustHaveCheckTest() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int underLimit = 200;
        int overLimit = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.sqrt(underLimit, overLimit);

        assertEquals(expected, actual);
    }

    @Test
    void nullRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int underLimit = 0;
        int overLimit = 0;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.sqrt(underLimit, overLimit);

        assertEquals(expected, actual);
    }
    @Test
    void negativeRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int underLimit = -200;
        int overLimit = -300;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.sqrt(underLimit, overLimit);

        assertEquals(expected, actual);
    }
    @Test
    void oneRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int underLimit =1;
        int overLimit = 1;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.sqrt(underLimit, overLimit);

        assertEquals(expected, actual);
    }
}