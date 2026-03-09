import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            switch(line){
                case "push_front":
                    int x=Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;
                case "push_back":
                    int y=Integer.parseInt(st.nextToken());
                    deque.addLast(y);
                    break;
                case "pop_front":
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.pollFirst());
                    }
                    break;
                case "pop_back":
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.pollLast());
                    }
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.getFirst());
                    }
                    break;
                case "back":
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.getLast());
                    }
                    break;
            }
        }
        
    }
}
