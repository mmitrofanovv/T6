package ru.vsu.cs.vvp2021.g82.mitrofanov_m_d.Task6;

public class Solution {
    public static double idealLog (double x) {
        return Math.cosh(x);
    }

    public static Result cosE(double x, double e) {
        double tmp = 1;
        double sum = 1;
        int d = 0;
        while (Math.abs(tmp) > e) {
            d++;
            tmp = tmp*x*x/(((d*2-1)*2*d));
            sum += tmp;
        }
        return new Result(sum, d);
    }

    public static double cosN (double x, int n) {
        double tmp = 1;
        double sum = 0;
        if (n == 0){
            return sum;
        } else {
            sum = 1;
            for (int i = 1; i < n; i++) {
                tmp = tmp*x*x/(((i*2-1)*2*i));
                sum += tmp;
            }
            return sum;
        }
    }
}