package org.adp;

import java.util.*;

/**
 * Author: Sherwin Adams (216177499)
 * ADP Assignment 4 main class
 */
public class App 
{
    static List<Integer> list = Arrays.asList(00,10,20,30,40,50,60,70,80,90);
    static Map<Integer, String> map = new HashMap<>();
    static Set<Integer> set = new HashSet<>();

    static void demonstrateList() {
        System.out.println("\nDemonstrating List");
        System.out.println("Original list: " + list.toString());
        System.out.println("Changing 5th index to 200...");
        list.set(5,200);
        System.out.println("New list: " + list.toString());
    }

    static void demonstrateMap() {
        System.out.println("\nDemonstrating Map");
        map.put(1, "Java");
        map.put(3, "iOS");
        map.put(2, "Android");
        System.out.println("Original map: " + map);
        System.out.println("Removing key 3...");
        map.remove(3);
        System.out.println("New map: " + map);
    }

    static void demonstrateSet() {
        System.out.println("\nDemonstrating Set");
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);
        set.add(2);
        System.out.println("Set with duplicates: 1,2,3,4,5,6,1,2");
        System.out.println("Set without duplicates: " + set);
    }
    public static void main( String[] args ) {
        demonstrateList();
        demonstrateMap();
        demonstrateSet();
    }
}
