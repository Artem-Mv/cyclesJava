package ru.netology.sqr;

public class SQRService {

    public int sqrt(int underLimit, int overLimit) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= underLimit && i * i <= overLimit) {
                count++;
            }
        }

        return (count);
    }
}
