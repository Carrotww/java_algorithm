// https://www.acmicpc.net/problem/1822

import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int M;
    static int[] array_A;
    static int[] array_B;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        array_A = new int[N];

        for (int i = 0; i < N; i++) {
            array_A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int temp;
        TreeSet<Integer> hash_B= new TreeSet<Integer>();
        array_B = new int[M];

        for (int i = 0; i < M; i++) {
            temp = Integer.parseInt(st.nextToken());
            array_B[i] = temp;
            hash_B.add(temp);
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            temp = array_A[i];
            if (!hash_B.contains(temp)) {
                result.add(temp);
            }
            else {
                continue;
            }
        }
        System.out.println(result.size());
        if (result.size() != 0) {
            Collections.sort(result);
            for (Integer val : result) {
                System.out.print(val + " ");
            }
        }
    }
}