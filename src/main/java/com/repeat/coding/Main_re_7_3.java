package com.repeat.coding;

import com.example.coding.Main7_3;
import com.example.coding.Main7_4;

public class Main_re_7_3 {
    public int DFS(int n){
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        Main7_3 T = new Main7_3();
        System.out.println(T.DFS(5));
    }
}
