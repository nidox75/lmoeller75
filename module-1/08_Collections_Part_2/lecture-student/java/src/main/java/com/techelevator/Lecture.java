package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

    public static void main(String[] args) {

        System.out.println("####################");
        System.out.println("        MAPS");
        System.out.println("####################");
        System.out.println();

        Map<String, String> stateMap = new HashMap<String, String>();
        stateMap.put("OH", "Ohio");
        stateMap.put("KY", "Kentucky");
        stateMap.put("IA", "Indiana");

        System.out.println(stateMap.size());
        System.out.println("OH = " + stateMap.get("OH"));
        if (stateMap.containsKey("OH")) {
            System.out.println(stateMap.get("OH"));
        }

        Set<Long> couponNums = new HashSet<Long>();
        couponNums.add(53L);
        long butter = 21L;
        couponNums.add(butter);
        couponNums.add(butter);
        System.out.println(couponNums.add(butter));
        System.out.println(couponNums.add(butter));

        System.out.println(couponNums);
    }

}






        }