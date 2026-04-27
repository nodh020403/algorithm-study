import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st=null;
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());	
            String str=st.nextToken();
            for(int j=0;j<str.length();j++) {
            	for(int k=0;k<num;k++) {
            		//System.out.print(str.charAt(j));
            		sb.append(str.charAt(j));
            	}
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}