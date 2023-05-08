package com.ap.hackerrank11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int answer=0;
        int distinct =0;


        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            if(hashMap.get(num) == null) hashMap.put(num, 0);
            hashMap.put(num, hashMap.get(num)+1);

            if(hashMap.get(num)==1)
                distinct++;

            if(deque.size() == m+1){
                int ele = deque.removeFirst();
                hashMap.put(ele, hashMap.get(ele)-1);
                if(hashMap.get(ele) == 0) distinct--;

            }
            if(deque.size() == m){
                if(distinct > answer) answer = distinct;
            }

        }

        System.out.println(answer);
        in.close();
    }
}
