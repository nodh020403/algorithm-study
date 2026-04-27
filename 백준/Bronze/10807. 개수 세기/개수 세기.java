import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;

        int N = Integer.parseInt(br.readLine());
        int count=0;
        int [] arr = new int[N];
    
        for (int i = 0; i < N; i++) {
        	while (st == null || !st.hasMoreTokens()) {
        		st = new StringTokenizer(br.readLine());
        	}
            arr[i] = Integer.parseInt(st.nextToken());	
        }
        int key = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
        	if(arr[i]==key)
        		count++;
        }
        System.out.println(count);
    }
}

