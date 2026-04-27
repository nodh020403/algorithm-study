import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>(); 

		for(int i=0;i<N;i++) {
			set.add(br.readLine());
		}
		List<String> list=new ArrayList<>(set);
		
		Collections.sort(list,(a,b)->{
			if (a.length()==b.length()) {
				return a.compareTo(b);
			}else {
				return Integer.compare(a.length(), b.length());
			}
		});
		
		for(String s:list) {
			System.out.println(s);
		}
		

	}
}
