import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int H= Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		int time = (H*60 + M - 45 +1440)%1440;
		H=time/60;
		M=time%60;
		System.out.println(H+" "+M);
	}

}
