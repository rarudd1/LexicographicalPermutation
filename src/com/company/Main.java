package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static String biggerByOne(String w) {

        char last = w.charAt(w.length()-1);
        int pivot =-1;
        //Locate the pivot point in the string
        for(int i =w.length()-2; i>=0;i--)
        {
            if(last<=w.charAt(i))
            {
                last = w.charAt(i);
            }
            else
            {
                pivot = i;
                break;
            }
        }
        String newW ="no answer";//If no pivot point is found leave string as 'no answer'
        if(pivot != -1)
        {
            last = w.charAt(pivot);
            int lastGreat =w.length()-1;
            //Find the last character in the string that is greater than the pivot point
            for(int i =w.length()-1; i>pivot;i--)
            {
                if(w.charAt(i)>last)
                {
                    lastGreat = i;
                    break;
                }
            }
            newW = "";
            //Add to the sting all characters before pivot point
            for(int i =0; i<pivot;i++)
            {
                newW = newW + w.charAt(i);
            }
            newW = newW +w.charAt(lastGreat); //add the character found greater than the pivot
            //Add the last of the string in reverse order
            for(int i =w.length()-1;i>pivot;i--)
            {
                if(i ==lastGreat)
                {
                    newW = newW +w.charAt(pivot);
                }
                else{
                    newW = newW +w.charAt(i);
                }
            }
        }
        return(newW);
    }


    public static void main(String[] args) throws IOException {


        try (Scanner scanner = new Scanner(new FileReader("tests.txt"))) {


            int testCases = scanner.nextInt();

            for(int i=0; i<testCases; i++)
            {
                String caseOne = scanner.next();
                System.out.println(biggerByOne(caseOne));
            }
        }
    }
}
