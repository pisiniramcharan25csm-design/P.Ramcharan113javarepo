import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Bufferedreader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int sum=0;
            int N = Integer.parseInt(br.readLine().trim());
            while(N>0)
            {
                sum+=N%10;
                N=N/10;
            }
            sb.append(sum).append("\n");
        }
        System.out.println();
        System.out.println(sb);
    }
}