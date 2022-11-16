package ru.vsu.cs.vvp2021.g82.mitrofanov_m_d.Task6;

public class Result {
    public double sum;
    public int count;

    public Result(double sum, int count) {
        this.sum = sum;
        this.count = count;
    }

    public double getSum(){
        return sum;
    }

    public int getCount(){
        return count;
    }
}