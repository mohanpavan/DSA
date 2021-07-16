package com.week1.assignment1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int count = 0;
        double p;
        String champion = "";
        while (!StdIn.isEmpty()) {
            count++;
            p = (double) 1 / count;
            String temp = StdIn.readString();
            if (StdRandom.bernoulli(p)) {
                champion = temp;
            }
        }
        StdOut.println(champion);
    }
}
