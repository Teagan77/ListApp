package org.randall.teagan;

import java.util.*;

/**
 *@author: Teagan Randall
 *@studNo: 215 095 111
 */

public class CollectionServiceImplementation implements CollectionService {

    @Override
    public Collection add(Collection a, Object b) {
        a.add(b);
        return a;
    }

    @Override
    public Collection remove(Collection a, Object b) {
        a.remove(b);
        return a;
    }

    @Override
    public TreeMap sort(HashMap a) {

        TreeMap<Integer, String> sorted = new TreeMap<>();

        sorted.putAll(a);

        for (Map.Entry<Integer, String> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        return sorted;
    }
}


