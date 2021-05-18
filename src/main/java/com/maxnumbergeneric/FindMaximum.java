package com.maxnumbergeneric;

public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("find Maximum Number ");
    }
    public Integer findMaximum(Integer i,Integer j,Integer k) // method to check maximum Number
    {
        Integer max=i;
        if(j.compareTo(max)>0)
        {
            max=j;
        }
        if(k.compareTo(max)>0)
        {
            max=k;
        }
        return max;
    }
}
