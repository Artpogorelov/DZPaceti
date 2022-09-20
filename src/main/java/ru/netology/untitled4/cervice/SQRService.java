package ru.netology.untitled4.cervice;

public class SQRService {
    public int calc(int minlimit, int maxlimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minlimit && i * i <= maxlimit) {
                count++;
            }
        }
        return count;
    }
}


