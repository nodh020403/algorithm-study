import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
        int count=0;
        int max=0;
        
        for (int i = 0; i < 4; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	int out = Integer.parseInt(st.nextToken());
        	int in = Integer.parseInt(st.nextToken());
        	count=count-out+in;
        	if (count>max) {
				max=count;
			}
        }
        System.out.println(max);
    }
}
