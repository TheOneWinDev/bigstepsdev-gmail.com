package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        int paramsStartIndex = url.indexOf('?');
        if (paramsStartIndex != -1) {
            String paramsString = url.substring(paramsStartIndex + 1);
            String[] paramsArray = paramsString.split("&");
            for (String param : paramsArray) {
                String[] keyValue = param.split("=");
                String value = (keyValue.length > 1) ? keyValue[1] : null;
                System.out.print(keyValue[0] + " ");
            }
            System.out.print("\n");
            for (String param : paramsArray) {
                String[] keyValue = param.split("=");
                String value = (keyValue.length > 1) ? keyValue[1] : null;
                if (keyValue[0].equals("obj"))
                {
                    if(isDouble(value))
                        alert(Double.parseDouble(value));
                    else
                    {
                        alert(value);
                    }
                }
            }
        } else {
            System.out.println("В URL нет параметров запроса.");
        }
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
