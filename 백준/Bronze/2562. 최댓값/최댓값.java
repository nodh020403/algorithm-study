import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;

        //int N = Integer.parseInt(br.readLine());
        int max=0;
        int max_seq=0;
        int temp=0;
        
        for (int i = 0; i < 9; i++) {
        	while (st == null || !st.hasMoreTokens()) {
        		st = new StringTokenizer(br.readLine());
        	}
            temp = Integer.parseInt(st.nextToken());
            if(i==0) {
            	max=temp;
            	max_seq=(i+1);
            	continue;
            }
            if(temp>max) {
            	max=temp;
            	max_seq=(i+1);
            }
            	
        }
        System.out.println(max);
        System.out.println(max_seq);
    }
}
