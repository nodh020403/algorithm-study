import java.io.*;
import java.util.*;

public class Main{
    static int N,K;
    static int[] rail;
    static boolean[] visited;
 
    static Queue<Integer> queue=new LinkedList<>();
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
                                               
        N=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken()); 
  
        rail= new int[100001];
        visited= new boolean[100001];
        
        queue.add(N);
        visited[N]=true;
       
        bfs();
        
        System.out.println(rail[K]);
    }
    static void bfs(){
        while(!queue.isEmpty()){
            int cx=queue.poll();
            
            if(cx==K) return;
            
            int[] nextPositions= {cx+1,cx-1,cx*2};
            
            for(int nx:nextPositions) {
            	if(nx>=0&&nx<=100000){
                    if(visited[nx]==false){
                    	visited[nx]=true;
                        rail[nx]=rail[cx]+1;
                        queue.add(nx);
                    }
                }
            }
        }
    }
}

     