package com.double7;

import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        System.out.println(15 | (15>>>2));

        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("aaa","abc");
        map.get("aaa");
    }
}
