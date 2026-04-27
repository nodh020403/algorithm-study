import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
        st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int cook = Integer.parseInt(br.readLine());
    
        int total = hour * 60 + minute + cook;
        hour = (total / 60) % 24;
        minute = total % 60;
        
        System.out.println(hour+" "+minute);
    }
}
