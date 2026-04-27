import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int length=Integer.toString(num).length();
		long total=0;
		long start=1;
        
		for(int i=1;i<length;i++){
			total += 9*start*i;
			start *=10;
		}
		total += (long)(num-start+1)*length; 
		System.out.println(total);
	}
}
