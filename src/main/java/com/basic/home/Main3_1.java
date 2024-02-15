package com.basic.home;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3_1 {


    public ArrayList<Integer> solution(int n, int m, int[] a , int[] b) {

        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0, p2=0;

        while (p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        while (p1<n) answer.add(a[p1++]);
        while (p2<n) answer.add(b[p2++]);



        return answer;

    }

    public static void main(String[] args) {

        Main3_1 T = new Main3_1();

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=kb.nextInt();
        }
        int m = kb.nextInt();
        int b[] = new int[m];


        for (int i = 0; i < m; i++) {
            a[i]=kb.nextInt();
        }



        System.out.print(T.solution(n,m,a,b));


    }
}
