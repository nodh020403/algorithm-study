import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;

        int N = Integer.parseInt(br.readLine());
        int min=0;
        int max=0;
        int temp=0;
        
        for (int i = 0; i < N; i++) {
        	while (st == null || !st.hasMoreTokens()) {
        		st = new StringTokenizer(br.readLine());
        	}
            temp = Integer.parseInt(st.nextToken());
            if(i==0) {
            	min=max=temp;
            	continue;
            }
            if(temp<min)
            	min=temp;
            if(temp>max)
            	max=temp;
        }
        System.out.println(min+" "+max);
    }
}