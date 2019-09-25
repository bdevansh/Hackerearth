import java.util.*;
 
class Prom01 {
    public static void main(String args[] ) throws Exception {
 
        Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        
        while(T-- > 0) {
            int M = s.nextInt(); //# of boys
            int N = s.nextInt(); //# of girls
            
            int boys[] = new int[M];
            
            for(int i=0; i<M; i++) {
                boys[i] = s.nextInt();
            }
            
            int girls[] = new int[N];
            
            for(int i=0; i<N; i++) {
                girls[i] = s.nextInt();
            }
            
            System.out.println(possible(boys, girls, M, N) ? "YES" : "NO");
        }
    }
    
    static boolean possible(int[] boys, int[] girls, int m, int n) {
        if(n < m) return false;
        
        Arrays.sort(boys);
        Arrays.sort(girls);
        
        for(int i=0; i<m; i++) {
            if(boys[i] <= girls[i]) return false;
        }
        return true;
    }
}