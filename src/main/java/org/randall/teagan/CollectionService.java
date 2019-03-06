package org.randall.teagan;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *@author: Teagan Randall
 *@studNo: 215 095 111
 */
public interface CollectionService {

    Collection add(Collection a, Object b);
    Collection remove(Collection a, Object b);
    TreeMap sort(HashMap a);
}
