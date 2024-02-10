package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            int num = 0;
            if (reader.ready())
            {
                num = reader.read();
                if (num%2 == 0)
                    list.add(num);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        Collections.sort(list);
        for (Integer num : list)
        {
            System.out.println(num);
        }
    }
}
