import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String x = br.readLine();
        
        int n = x.length();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            char w =x.charAt(i);
        	if(Character.isUpperCase(w)) {
        		sb.append(Character.toLowerCase(w));
        	}
        	else{
        		sb.append(Character.toUpperCase(w));
        	}
        	
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}