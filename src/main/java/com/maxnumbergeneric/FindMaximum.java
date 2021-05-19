package com.maxnumbergeneric;

public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("find Maximum Number ");
    }

    public <S extends Comparable> S findMaximum(S i, S j, S k) // method to check maximum Number
    {
        S max = i;
        if (j.compareTo(max) > 0) {
            max = j;
        }
        if (k.compareTo(max) > 0) {
            max = k;
        }
        return max;
    }
}