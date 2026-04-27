import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int H= Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		int S= Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(br.readLine());
		int time = (H*60*60 + M*60 + S + D)%(60*60*24);
		H=time/(60*60);
		time=time%(60*60);
		M=time/60;
		S=time%60;
		System.out.println(H+" "+M+" "+S);
	}

}
