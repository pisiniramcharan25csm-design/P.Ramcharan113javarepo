import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Bufferedreader1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int even=0,odd=0;
            int N = Integer.parseInt(br.readLine().trim());
            while(N>0)
                {
                    int digit =N%10;
                    if(digit%2==0)
                        even++;
                    else
                        odd++;
                    N=N/10;
                }
            sb.append(even).append(" ").append(odd).append("\n");
	    }
        System.out.println();
        System.out.println(sb);
    }
}