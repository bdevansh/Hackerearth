import java.io.BufferedReader;
import java.io.InputStreamReader;
class MagicalWord  {
    public static void main(String args[] ) throws Exception {
	int tc,len;
    String s;
    char dj[] = {'C','G','I','O','S','Y','a','e','g','k','m','q'};
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    tc = Integer.parseInt(reader.readLine());
    while(tc>0)
    {
        len = Integer.parseInt(reader.readLine());
        s=reader.readLine();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<dj.length;j++)
            {
                if(s.charAt(i)<dj[j])
                {
                    if(j>0)
                    {
                        int disL=s.charAt(i)-dj[j-1];
                        int disM=dj[j]-s.charAt(i);
                        if(disM<disL)
                        {
                            System.out.print(dj[j]);
                            break;
                        }
                        else
                        {
                            System.out.print(dj[j-1]);
                            break;
                        }
                    }
                    else
                    {
                        System.out.print(dj[0]);
                        break;
                    }
                }
                else if(s.charAt(i)>='q')
                {
                    System.out.print("q");
                    break;
                }
                else if(s.charAt(i)==dj[j])
                {
                    System.out.print(dj[j]);
                    break;
                }
            }
        }
        System.out.println("");
        tc--;
    }
    }
}