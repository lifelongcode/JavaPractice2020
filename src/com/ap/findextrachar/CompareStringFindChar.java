package com.ap.findextrachar;

public class CompareStringFindChar {

    public char findExtraCharacter(char[] strA, char[] strB){
        int[] map = new int[256];

        for(int i=0; i<strB.length; i++)
            map[strB[i]]++;

        for(int j=0; j<strA.length; j++)
            map[strA[j]]--;

        for(int f=0; f<map.length; f++){
            if(map[f] == 1){
                return (char) f;
            }
        }
    return Character.MIN_VALUE;
    }
}
