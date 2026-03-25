import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        for(int i=0; i<x;i++){
            String s = br.readLine();
            int point =0;
            int stack =0;
            for(int j=0; j<s.length();j++){
                if(s.charAt(j)=='O'){
                    stack++;
                    point=point+stack;
                }else{
                    stack=0;
                }
            }
            System.out.println(point);
        }
    }
}