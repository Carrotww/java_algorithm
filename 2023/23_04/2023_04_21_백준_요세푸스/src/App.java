// https://www.acmicpc.net/problem/1158

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class App {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
 
        Queue<Integer> q = new LinkedList<>();
 
        // 1번부터 N번까지 N명의 사람
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
 
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        // k-1까지 처음에 있던 값을 맨 뒤로 보낸다.
        while (q.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        // 마지막 값
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}