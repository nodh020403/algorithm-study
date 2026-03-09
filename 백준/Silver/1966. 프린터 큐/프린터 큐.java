import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            Queue<int[]> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N =Integer.parseInt(st.nextToken());
            int M =Integer.parseInt(st.nextToken());
  
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N;j++){
                int x=Integer.parseInt(st.nextToken());
                queue.add(new int[]{x,j});
            }
            int count=0;
            while(!queue.isEmpty()){
                int[] check=queue.poll();
                boolean hasBigger=false;
                for(int[]q : queue){
                    if(q[0]>check[0]){
                        hasBigger=true;
                        break;
                    }
                }
                if(hasBigger){
                    queue.add(check);
                }else{
                    count++;
                    if(check[1]==M){
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
    }
}
