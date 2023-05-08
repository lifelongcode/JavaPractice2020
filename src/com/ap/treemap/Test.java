/**
    TreeMap important for real job. Could be the case loggingProperties in Java class
 */


package com.ap.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("I'm Internal Key", "I'm Internal Value");

        Map<String, Map<String, String>> treeMap = new TreeMap<String, Map<String, String>>();
        treeMap.put("External Key", hashMap);

        for(Map.Entry<String, Map<String, String>> entry : treeMap.entrySet())
        {
            System.out.println(entry.getKey());
            Map<String, String> internalMapping = entry.getValue();
            for(Map.Entry<String, String> internalEntry : internalMapping.entrySet())
            {
                System.out.println(internalEntry.getKey());
                System.out.println(internalEntry.getValue());
            }
        }
    }
}
