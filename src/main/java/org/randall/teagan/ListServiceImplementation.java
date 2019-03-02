package org.randall.teagan;

import java.util.*;

/**
 *@author: Teagan Randall
 *@studNo: 215 095 111
 */

public class ListServiceImplementation implements ListService {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> stringNameArray = new ArrayList<>();
        Set<String> stringColorArray = new TreeSet<>();
        Map<Integer, String> employeeMap = new HashMap<>();
        Collection<Integer> intList = new ArrayList<>();

        stringNameArray.add("Jhon");
        stringNameArray.add("Jeff");
        stringNameArray.add("Jeremy");
        stringNameArray.add("Jack");

        stringColorArray.add("Blue");
        stringColorArray.add("Yellow");
        stringColorArray.add("Green");
        stringColorArray.add("Red");
        stringColorArray.add("Purple");

        employeeMap.put(123, "Chad");
        employeeMap.put(124, "Dk");
        employeeMap.put(125, "Teagan");
        employeeMap.put(126, "Michael");

        intList.add(1621);
        intList.add(6544);
        intList.add(8547);
        intList.add(9524);
        intList.add(9654);

        boolean inputValid = false;
        boolean repeat = true;

        while(repeat) {
            System.out.println("Pick a list: (NUMBERS, COLORS, NAMES or EMPS)");
            String choice = scanner.next();

            if (choice.equals("NUMBERS") || choice.equals("COLORS") || choice.equals("NAMES") || choice.equals("EMPS")) {
                inputValid = true;
            } else {
                inputValid = false;
            }

            if (!inputValid) {
                while (!inputValid) {
                    System.out.println("Invalid, pick a list: (NUMBERS, COLORS, NAMES or EMPS)");
                    choice = scanner.next();

                    if (choice.equals("NUMBERS") || choice.equals("COLORS") || choice.equals("NAMES") || choice.equals("EMPS")) {
                        inputValid = true;
                    } else {
                        inputValid = false;
                    }
                }
            }

            if (inputValid) {
                switch (choice) {
                    case "NUMBERS":
                        System.out.println(intList);
                        break;
                    case "COLORS":
                        System.out.println(stringColorArray);
                        break;
                    case "NAMES":
                        System.out.println(stringNameArray);
                        break;
                    case "EMPS":
                        System.out.println(employeeMap);
                        break;
                }
            }

            System.out.println("\nWould you like to pick another list? (Y/N)");
            String answer = scanner.next();

            if (answer.toUpperCase().equals("Y")||answer.toUpperCase().equals("N")) {
                inputValid = true;
            } else {
                inputValid = false;
            }

            if (!inputValid) {
                while (!inputValid) {
                    System.out.println("Invalid, try again: (Y/N)");
                    answer = scanner.next();

                    if (answer.toUpperCase().equals("Y")||answer.toUpperCase().equals("N")) {
                        inputValid = true;
                    } else {
                        inputValid = false;
                    }
                }
            }

            if (inputValid && answer.toUpperCase().equals("Y")) {
                repeat = true;
            } else if(inputValid && answer.toUpperCase().equals("N")){
                repeat = false;
            }
        }
    }
}


