package com.java.oops.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    static void main() {
        Set set = new HashSet();//
        set.add(1);
        set.add("john");
        set.add("madhu");
        set.add(1);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.remove(1));
        System.out.println(set.contains(1));
        set.add("venky");
        set.add(123456);
        System.out.println(set);


        //iterator() returns a iterator element
        // Iterator iterator = set.iterator();
        //hasNext()-check if there is next element
        //next()- get next element
//        while(iterator.hasNext()){
//         String name = (String)  iterator.next();//return object
//            System.out.println(name.toUpperCase());
//        }
        //generic collection is used for differet typeof of types


        Set<String> names = new HashSet<>();
        names.add("madhu");
        names.add("john");
        names.add("venky");
        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name.toUpperCase());
        }
        Set <String> emails = new TreeSet<>();
        emails.add("ujwala@123");
        emails.add("john@123");
        emails.add("haritha@143");
        System.out.println(emails);

    }
}