import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        String[] croatia={"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String s:croatia){
            line=line.replace(s,"X");
        }
        System.out.println(line.length());
    }
}
