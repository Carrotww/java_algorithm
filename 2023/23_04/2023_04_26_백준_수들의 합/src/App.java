// https://www.acmicpc.net/problem/1158

import java.io.*;
import java.util.*;
 
public class App {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long num = Long.parseLong(br.readLine());

        // System.out.println(num);
        long result = 0;
        int i = 0;

        while (num >= result) {
            i += 1;
            result += i;
        }

        System.out.println(i-1);
    }
}