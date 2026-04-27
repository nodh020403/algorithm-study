import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr= new int[10];
        for(int i=0;i<10;i++) {
        	arr[i]= (Integer.parseInt(br.readLine()))%42;
        }
        long count=Arrays.stream(arr).distinct().count();
        
        System.out.println(count);
    }
}
