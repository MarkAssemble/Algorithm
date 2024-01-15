import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] n = new int[28];
        
        for(int i=0;i<28;i++){
            n[i]=Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(n);
        
        for(int x=1;x<=30;x++){
            boolean A = false;
            
            for(int j=0;j<28;j++){
                if(x==n[j]){
                    A=true;
                    break;
                }
            }
         if(!A){
                bw.write(Integer.toString(x));
                bw.newLine();
                }
            }
        bw.flush();
        bw.close();
    }
}
