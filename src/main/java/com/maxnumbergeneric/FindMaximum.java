package com.maxnumbergeneric;

public class FindMaximum<S extends Comparable<S>>  //generic class
{
    S i,j,k;
    public FindMaximum(S i,S j, S k) //constructor
    {
        this.i=i;
        this.j=j;
        this.k=k;
    }
    public S findMaximum(){
        return FindMaximum.findMaximum(i,j,k);
    }
    public static void main(String[] args) {
        System.out.println("find Maximum Number ");
        new FindMaximum(95,96,100).findMaximum();
        new FindMaximum(252.5f,2563.5f,456.2f).findMaximum();
        new FindMaximum("Apple","Banan","Watermelon").findMaximum();
    }

    public static <S extends Comparable<S>> S findMaximum(S i, S j, S k) // method to check maximum Number
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