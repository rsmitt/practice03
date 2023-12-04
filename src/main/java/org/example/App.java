package org.example;

import org.example.pecs.Bird;
import org.example.pecs.Duck;
import org.example.pecs.EmperiorPenguin;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        MyWrapper<String> wrapper = new MyWrapper<>();
        wrapper.setValue("1");
        wrapper.setValue("2");
        wrapper.getValue();
        System.out.println(wrapper);


        String[] cities = new String[] {"Moscow", "Sochi"};
        Integer[] years = new Integer[] {1999, 2000};

        Object[] objects = cities;
        //objects[1] = 1;

        //foo(objects);
        List<? super Bird> list = new ArrayList<>();
        list.add(new Duck());
        list.add(new EmperiorPenguin());
        //list.add(new Object());

        List<String> books = new ArrayList<>(2);
        books.add("book1");
        books.add("book2");
        books.add("book3");

    }

    public static void foo(Object[] list) {
        for (Object o: list) {
            System.out.println("item: " + o);
        }
    }
}
