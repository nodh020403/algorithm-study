import java.io.*;
import java.util.*;

public class Main{
    static int N,M,H;
    static int tomato[][][];
    static int[] dx={0,0,1,-1,0,0};
    static int[] dy={0,0,0,0,1,-1};
    static int[] dz={1,-1,0,0,0,0};
    static Queue<int[]> queue=new LinkedList<>();
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
                                               
        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        H=Integer.parseInt(st.nextToken());
                                               
        tomato=new int[H][N][M];
        for(int k=0;k<H;k++) {
        	for(int i=0;i<N;i++){
                st =new StringTokenizer(br.readLine());
                for(int j=0;j<M;j++){
                    tomato[k][i][j]=Integer.parseInt(st.nextToken());
                    if(tomato[k][i][j]==1){
                        queue.add(new int[]{k,i,j});
                    }
                }
            }
        }                                       
       
        bfs();
        int max=0; 
        for(int k=0;k<H;k++) {
        	for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(tomato[k][i][j]==0){
                         System.out.println(-1);
                         return;
                    }
                    max=Math.max(max,tomato[k][i][j]);
                }
            }
        }
        System.out.println(max-1);
    }
    static void bfs(){
        while(!queue.isEmpty()){
            int[] current=queue.poll();
            int cz=current[0];
            int cx=current[1];
            int cy=current[2];
            
            for(int i=0;i<6;i++){
            	int nz= cz+dz[i];
                int nx= cx+dx[i];
                int ny= cy+dy[i];
                
                if(nx>=0&&ny>=0&&nz>=0&&nx<N&&ny<M&&nz<H){
                    if(tomato[nz][nx][ny]==0){
                        tomato[nz][nx][ny]=tomato[cz][cx][cy]+1;
                        queue.add(new int[]{nz,nx,ny});
                    }
                }
            }
        }
    }
}

     