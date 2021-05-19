package com.maxnumbergeneric;

public class FindMaximum<S extends Comparable<S>>  //generic class
{
    S i,j,k,l,m;
    public FindMaximum(S i,S j, S k,S l,S m) //constructor
    {
        this.i=i;
        this.j=j;
        this.k=k;
        this.l=l;
        this.m=m;
    }
    public S findMaximum(){
        return FindMaximum.findMaximum(i,j,k,l,m);
    }
    public static void main(String[] args) {
        System.out.println("find Maximum Number ");
        new FindMaximum(12,15,20,25,30).findMaximum();
        new FindMaximum(222.5f,225.5f,456.2f,455.1f,555.1f).findMaximum();
        new FindMaximum("Apple","Banan","Watermelon","Orange","Kiwi").findMaximum();
    }

    public static <S extends Comparable<S>> S findMaximum(S i, S j, S k,S l,S m) // method to check maximum Number
    {
        S max = i;
        if (j.compareTo(max) > 0) {
            max = j;
        }
        if (k.compareTo(max) > 0) {
            max = k;
        }
        if (l.compareTo(max) > 0) {
            max = l;
        }
        if (m.compareTo(max) > 0) {
            max = m;
        }
        return max;
    }
}