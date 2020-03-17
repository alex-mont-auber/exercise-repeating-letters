package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // START FASE 1

        char[] MyName = {'A','l','e','x','a','n','d','r','e'};

        System.out.println();

        for (char c : MyName) {
            System.out.println("- " + c);
        }
        System.out.println();

        // END FASE 1

        // START FASE 2

        List<Character> NameList = new ArrayList();

        NameList.add('A');
        NameList.add('l');
        NameList.add('e');
        NameList.add('x');
        NameList.add('a');
        NameList.add('n');
        NameList.add('d');
        NameList.add('r');
        NameList.add('e');

        int[] NumberInArray = {'0','1','2','3','4','5','6','7','8','9'};

        System.out.println("Total number of lleters: " + NameList.size());
        System.out.println();

        for(char i: NameList) {
            for (int e : NumberInArray) {
                if(i == e){
                    System.out.println("Los nombres de personas no tienen numeros!");
                    return;
                }
            }
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                System.out.println("It's a vocal");
            } else {
                System.out.println("It's a consonant");
            }
        }

        // END FASE 2

        // START FASE 3

        Map<Integer, Character> myNewMap  = new LinkedHashMap();
        int counterRepeated = 0;

        for(Character e: NameList){
            for(Character i: NameList){
                if(e.equals(i)){
                    counterRepeated++;
                }
            }
            if(counterRepeated > 2){
                System.out.println(e + " = " + counterRepeated + " ");
                myNewMap.put(counterRepeated, e);
            } else {
                System.out.println(e + " = " + counterRepeated + " ");
                myNewMap.put(counterRepeated, e);
            }
            counterRepeated = 0;
        }

        // END FASE 3

        // START FASE 4

        List<Character> SurnameList = new ArrayList();

        SurnameList.add(' ');
        SurnameList.add('M');
        SurnameList.add('o');
        SurnameList.add('n');
        SurnameList.add('t');
        SurnameList.add('s');
        SurnameList.add('e');
        SurnameList.add('r');
        SurnameList.add('r');
        SurnameList.add('a');
        SurnameList.add('t');

        NameList.addAll(SurnameList);

        List<Character> AllName;

        AllName = NameList;

        System.out.println();
        System.out.println("FULLNAME: " + AllName);

        // END FASE 4
    }
}
