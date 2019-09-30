import java.util.*;
class SeatingArrangement {
    public static void main(String args[] ) throws Exception {
	    Scanner sc = new Scanner(System.in);
        int n=0;
        if(sc.hasNextInt())
        {
            n=sc.nextInt();
        }
        while(n-->0)
        {
            int seatNum = sc.nextInt();
            int facingseatNum = 13-(seatNum%12);
            if(facingseatNum==13)
            {
                facingseatNum=1;
                seatNum--;
            }
            facingseatNum = facingseatNum+12*(seatNum/12);
            int seatType = facingseatNum%6;
            String type = "AS";
            if(seatType==0||seatType==1)
            type = "WS";
            else if(seatType==2||seatType==5)
            type = "MS";
            
            System.out.println(facingseatNum+" "+type);
        }
    }
}