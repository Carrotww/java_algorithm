import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                deque.offer(value);
            }
            else if (command.equals("front")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(deque.peek()).append("\n");
                }
            }
            else if (command.equals("back")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
            else if (command.equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            else if (command.equals("pop")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                }
                else {
                    sb.append(deque.poll()).append("\n");
                }
            }
            else {
                if (deque.isEmpty()) {
                    sb.append("1").append("\n");
                }
                else {
                    sb.append("0").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
