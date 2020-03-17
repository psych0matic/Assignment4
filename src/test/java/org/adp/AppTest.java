package org.adp;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Author: Sherwin Adams (216177499)
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void demonstrateList() {
        List<Integer> listActual = Arrays.asList(00,10,20,30,40,50,60,70,80,90);
        List<Integer> listExpected = Arrays.asList(00,10,20,30,40,200,60,70,80,90);

        System.out.println("Testing change of index 5");
        assertEquals("There was an error in your list:",listActual.get(5) == 200,listExpected.get(5) == 50);
    }

    @Test
    public void demonstrateMap() {
        Map<Integer, String> mapActual = new HashMap<>();
        mapActual.put(1, "Java");
        mapActual.put(3, "iOS");
        mapActual.put(2, "Android");

        Map<Integer, String> mapExpected = new HashMap<>();
        mapExpected.put(1,"Java");
        mapExpected.put(2,"Android");

        System.out.println("Testing size of map");
        assertThat("Map has changed:",mapActual,is(mapExpected));
    }

    @Test
    public void demonstrateSet() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);
        set.add(2);
        System.out.println("Testing if set removed duplicates");
        assertTrue("Size of set has changed",set.size() == 6);
    }
}
