import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int[] cows=new int[11];
        boolean[] visited=new boolean[11];
        int count=0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cow=Integer.parseInt(st.nextToken());
            int here=Integer.parseInt(st.nextToken());
            if(visited[cow]==false){
                visited[cow]=true;
                cows[cow]=here;
            }else{
                if(cows[cow]!=here){
                    count++;
                    cows[cow]=here;
                }
            }
        }
        System.out.println(count);
    }
}

