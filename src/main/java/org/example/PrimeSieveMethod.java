package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeSieveMethod {

    public static void main(String[] args) {
        int n = 10;
        boolean isPrime[]  = new boolean[n];
        Arrays.fill (isPrime,true);
        List<Integer>  res = new ArrayList<> ();
        for(int i = 2; i <= Math.sqrt ( n ); i++){
            if(isPrime[i] == true){
                for(int j =2;  i * j < n; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        int count = 0;
        for( int i = 2;i<n;i++){
            if(isPrime[i] == true) {
                count++;
                res.add ( i );
            }
        }
        System.out.println (count);
        System.out.println (res);
    }
}
