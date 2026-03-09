import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count=0;
        int x=N;
        
        while(true) {
        	int a=0;
            int b=0;
        	a=(x%10);
        	b=(x/10)+a;
        	x=(a*10)+(b%10);
        	count++;
        	if(N==x)
        		break;
        }
        System.out.print(count);
    }
}
