import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C= Integer.parseInt(br.readLine());
		for(int i=0;i<C;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int N= Integer.parseInt(st.nextToken());
			double sum=0;
			int [] arr = new int[N];
			for(int j=0; j<N;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum+=arr[j];
			}
			double mean=sum/N;
			int count=0;
			for(int j=0; j<N;j++) {
				if(arr[j]>mean) {
					count++;
				}
			}
			double percent = (double) count/N*100;
			System.out.printf("%.3f%%\n", percent);
		}
		
	}
}