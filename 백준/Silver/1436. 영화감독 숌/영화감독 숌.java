import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int count=0;
        int x=665;
        String line;
        while(count!=N){
            x++;
            line=Integer.toString(x);
            if(line.contains("666")){
                count++;
            }   
        }
        System.out.println(x);
        
    }
}
