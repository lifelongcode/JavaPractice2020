package com.ap.hackerranktwo;

import java.util.ArrayList;
import java.util.List;

public class SolvingIt {
    //Complete the odd method below
    public List<Integer> oddNumbers(int l, int r){
        List<Integer> output = new ArrayList<>();
        if(l%2 == 0){
            l = l+1;
        }
        while (l <= r){
            output.add(l);
            l = l + 2;
        }
        return output;
    }

}
