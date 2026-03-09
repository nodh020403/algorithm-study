import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int [][] miro;
    static boolean[][] visited;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        miro=new int[N][M];
        visited=new boolean[N][M];
        
        for(int i=0;i<N;i++){
            String line = br.readLine();
            for(int j=0;j<M;j++){
                miro[i][j]=line.charAt(j)-'0';
            }
        }
        System.out.println(bfs(0, 0));
    }
    
    static int bfs(int x, int y){
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y]=true;
        
        while(!queue.isEmpty()){
            int[] current=queue.poll();
            int cx=current[0];
            int cy=current[1];
            
            for(int i=0; i<4;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                
                if(nx>=0&&ny>=0&&nx<N&&ny<M){
                    if(!visited[nx][ny]&&miro[nx][ny]==1){
                        visited[nx][ny]=true;
                        miro[nx][ny]=miro[cx][cy]+1;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }
        return miro[N-1][M-1];
    }
}
