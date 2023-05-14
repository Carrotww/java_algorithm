// https://www.acmicpc.net/problem/2295

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] array;
    static ArrayList<Integer> sum2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        array = new int[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        sum2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum2.add(array[i] + array[j]);
            }
        }

        Arrays.sort(array);
        Collections.sort(sum2);

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int gap = array[i] - array[j];

                if (check(gap) && array[i] > result) {
                    result = array[i];
                }
            }
        }

        System.out.println(result);
    }

    static boolean check(int num) {
        int start = 0;
        int end = sum2.size() - 1;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;

            if (sum2.get(mid) < num) {
                start = mid + 1;
            }
            else if (sum2.get(mid) > num) {
                end = mid - 1;
            }
            else if (sum2.get(mid) == num) {
                return true;
            }
        }
        return false;
    }
}
