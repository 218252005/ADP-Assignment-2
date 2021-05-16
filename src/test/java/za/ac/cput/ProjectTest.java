package za.ac.cput;

import java.util.*;

public class ProjectTest
{
    public static void main(String args[])
    {

        //List
        List<String> student1 = new ArrayList<>();
        List<String> student2 = new ArrayList<>();

        //add
        student1.add("Tyreeq");
        student1.add("Caelum");

        student2.add("Tyreeq");

        //remove
        student1.remove("Caelum");

        System.out.println("List:");
        System.out.println(student1);
        System.out.println(student2);

        //find
        if(student1.contains("Tyreeq"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        //Set
        Set<String> food1 = new HashSet<>();

        //add
        food1.add("Pizza");
        food1.add("Pie");

        //remove
        food1.remove("Pizza");

        System.out.println("Set:");
        System.out.println(food1);

        //find
        if(food1.contains("Pizza"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        //Map
        Map<String,Integer> gameOrder = new HashMap<>();

        //add
        gameOrder.put("Bloodborne",0);
        gameOrder.put("God of War", 1);

        //remove
        gameOrder.remove("God of War", 1);

        System.out.println("Map:");
        System.out.println(gameOrder);

        //find
        if(gameOrder.containsValue(1))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        //Collection


    }
}
