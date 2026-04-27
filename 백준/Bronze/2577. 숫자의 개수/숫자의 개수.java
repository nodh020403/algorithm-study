import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[]arr=new int[10];
		int total=1;
		for(int i=0;i<3;i++) {
			int val=Integer.parseInt(br.readLine());
			total=total*val;
		}
		String tot = Integer.toString(total);
		for(int i=0;i<tot.length();i++) {
			arr[(tot.charAt(i)-'0')]++;
		}
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}
}
