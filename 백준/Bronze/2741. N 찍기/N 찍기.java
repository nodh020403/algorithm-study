import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 입력
        int N = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i =0; i < N; i++) {
            System.out.println(i+1);
        }
    }
}
