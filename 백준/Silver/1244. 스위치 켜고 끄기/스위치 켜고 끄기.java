import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int[] switchs=new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            switchs[i]=Integer.parseInt(st.nextToken());
        }
        int S = Integer.parseInt(br.readLine());
        for(int i=0;i<S;i++){
            st = new StringTokenizer(br.readLine());
            int Sex=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            if(Sex==1){
                for(int j=x;j<=N;j=j+x){
                    if(switchs[j-1]==0){
                        switchs[j-1]=1;
                    }else{
                        switchs[j-1]=0;
                    }
                }
            }else{
                int start=x-1;
                int finish=x-1;
                while(start-1>=0&&finish+1<N&&(switchs[start-1]==switchs[finish+1])){
                    start--;
                    finish++;
                }
                for(int j=start; j<=finish;j++){
                    if(switchs[j]==1){
                        switchs[j]=0;
                    }else{
                        switchs[j]=1;
                    }
                }
            }
        }
        for(int i=0; i<N;i++){
            System.out.print(switchs[i]+" ");
            if((i+1)%20==0){
                System.out.println();
            }
        }
    }
}

