import java.util.*;
import java.io.*;

public class Main_Bruteforece {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N*N];
        int idx = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[idx] = Integer.parseInt(st.nextToken());
                idx ++;
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[N*N-N]);
    }
}
