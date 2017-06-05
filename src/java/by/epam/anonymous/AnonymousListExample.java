package com.company.india.anonymous;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//we can make a unique object
public class AnonymousListExample implements Comparable {
    private static long id = 2;
    private static AnonymousListExample[] array;
    private long instanceId;

    public long getId() {
        return instanceId;
    }

    public void setId(long id) {
        instanceId = id;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (instanceId - ((AnonymousListExample) o).instanceId);
    }


    public static List<AnonymousListExample> getFilledList() {
        //must be final or effectively final
        //long id = 0;
        return new ArrayList<AnonymousListExample>() {
            {
                add(new AnonymousListExample() {
                    {
                        setId(--id);
                    }
                });
            }
        };
    }


    public static void main(String[] args) {
        array = new AnonymousListExample[]{
                getFilledList().get(0),
                getFilledList().get(0)
        };

        Arrays.sort(array);

        for (AnonymousListExample example : array) {
            System.out.println(example.getId());
        }
    }


}
