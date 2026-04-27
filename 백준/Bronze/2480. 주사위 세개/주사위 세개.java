import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
        int [] arr=new int[3];
        int prize=0;
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        if (arr[0]==arr[1]&&arr[1]==arr[2]) {
        	prize=10000+(1000*arr[0]);
        }else if (arr[0]==arr[1]||arr[0]==arr[2]) {
			prize=1000+(100*arr[0]);
		}else if (arr[1]==arr[2]) {
			prize=1000+(100*arr[1]);
		}else {
			prize=100*(Arrays.stream(arr).max().getAsInt());
		}

        System.out.println(prize);
    }
}
