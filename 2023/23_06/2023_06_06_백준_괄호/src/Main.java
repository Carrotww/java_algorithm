import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++)
        {
            String total = br.readLine();
            Stack<String> stack = new Stack<>();
            Boolean result = true;

            for (char index : total.toCharArray())
            {
                String cur_str = String.valueOf(index);
                if (cur_str.equals("("))
                {
                    stack.push(cur_str);
                }
                else
                {
                    if (!stack.isEmpty() && stack.peek().equals("("))
                    {
                        stack.pop();
                    }
                    else
                    {
                        result = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty())
            {
                result = false;
            }
            if (result)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
