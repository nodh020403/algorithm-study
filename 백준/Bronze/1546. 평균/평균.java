import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        double sum=0;
        double max=0;
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
        	double score = Double.parseDouble(st.nextToken());
        	if(score>max)
        		max=score;
        	sum += score;
        }
        double mean = (sum/max*100)/N;
        System.out.println(mean);
    }
}
