import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max=-1;
		int x=0;
		int y=0;
		for(int i=0;i<9;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				int val=Integer.parseInt(st.nextToken());
				if(val>max) {
					max=val;
					x=i;
					y=j;
				}
			}
		}
		System.out.println(max);
		System.out.println((x+1)+" "+(y+1));
	}
}