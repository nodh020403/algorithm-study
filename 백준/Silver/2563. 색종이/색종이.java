import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int[][] paper =new int[100][100];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            
            for(int j=a; j<a+10;j++){
                for(int k=b; k<b+10;k++){
                    paper[j][k]=1;
                }
            }
        }
        int count=0;
         for(int j=0; j<100;j++){
                for(int k=0; k<100;k++){
                    if(paper[j][k]==1){
                        count++;
                    }
                }
            }
        System.out.println(count);
    }
}
