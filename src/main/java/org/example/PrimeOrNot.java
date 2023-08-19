package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println ("Enter the number : ");
//        int num = sc.nextInt ();
        boolean flag = false;
        int N = 20;
        List<Integer> res = new ArrayList<Integer> ();
        for(int j = 2;j<= N ;j++){
            flag = false;
        for(int i = 2; i <= Math.sqrt ( j ) ;i++){
            if(j%i == 0 ){
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            res.add ( j );
        }
//            System.out.println ("It is a prime number "+num);
//        } else{
//            System.out.println ("It is not prime number "+num);
        }

        System.out.println (res);
        System.out.println (res.size ());
    }
}
