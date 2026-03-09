import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        String word = br.readLine().toUpperCase();
        
        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-'A']++;
        }
        
        int max_num=-1;
        int max=-1;
        boolean duplicate=false;
        for(int i=0;i<26;i++){
            if(count[i]>max){
                max=count[i];
                max_num=i;
                duplicate=false;
            }else if(count[i]==max){
                duplicate=true;
            }
        }
        
        if(duplicate==true){
            System.out.println("?");
        }else{
            System.out.println((char)('A'+max_num));
        }
    }
}

