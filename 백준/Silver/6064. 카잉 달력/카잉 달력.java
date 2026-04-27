import java.io.*;
import java.util.*;

public class Main {
	static int gcd(int a,int b) {
		while (b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
	static int lcm(int a, int b) {
		return a/gcd(a, b)*b;
	}
	static int solve(int M, int N, int x, int y) {
		int limit=lcm(M, N);
		for(int k=x;k<=limit;k+=M) {
			if((k-y)%N==0) {
				return k;
			}
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int M= Integer.parseInt(st.nextToken());
			int N= Integer.parseInt(st.nextToken());
			int x= Integer.parseInt(st.nextToken());
			int y= Integer.parseInt(st.nextToken());
			System.out.println(solve(M, N, x, y));
		}
	}

}