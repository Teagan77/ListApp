package org.randall.teagan;

import configuration.CollectionConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class MainClass {

    public static void main(String[] args){
        
    ApplicationContext ctx = new AnnotationConfigApplicationContext(CollectionConfiguration.class);

    CollectionServiceImplementation collectionServiceImplementation = ctx.getBean(CollectionServiceImplementation.class);
    
    Scanner scanner = new Scanner(System.in);

        List<String> stringNameArray = new ArrayList<>();
        Set<String> stringColorArray = new TreeSet<>();
        HashMap employeeMap = new HashMap<>();
        Collection<Integer> intList = new ArrayList<>();

        collectionServiceImplementation.add(stringNameArray,"Jhon");
        collectionServiceImplementation.add(stringNameArray,"Jeff");
        collectionServiceImplementation.add(stringNameArray,"Jeremy");
        collectionServiceImplementation.add(stringNameArray,"Jack");

        collectionServiceImplementation.add(stringColorArray,"Blue");
        collectionServiceImplementation.add(stringColorArray,"Yellow");
        collectionServiceImplementation.add(stringColorArray,"Green");
        collectionServiceImplementation.add(stringColorArray,"Red");
        collectionServiceImplementation.add(stringColorArray,"Purple");

        employeeMap.put(111, "Chad");
        employeeMap.put(112, "Dk");
        employeeMap.put(113, "Teagan");
        employeeMap.put(114, "Michael");

        collectionServiceImplementation.add(intList,1621);
        collectionServiceImplementation.add(intList,6544);
        collectionServiceImplementation.add(intList,8547);
        collectionServiceImplementation.add(intList,9524);
        collectionServiceImplementation.add(intList,9654);

        boolean inputValid;
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
                        collectionServiceImplementation.sort(employeeMap);
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
