import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while (N!=0) {
			int temp=N%B;
			if(temp>=10) {
				sb.append((char)(temp-10+'A'));
			}else {
				sb.append((char)(temp+'0'));
			}
			N=N/B;
		}
		System.out.println(sb.reverse().toString());
	}
}
