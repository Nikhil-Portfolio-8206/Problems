package P_02_Functions_String_Arrays;

public class p_03_Count_prime_no_less_than_N {
        public static int Count_prime_no(int N) {
            int primeNocount=0;
            for(int i=1;i<=N;i++){
                int count= p_02_count_no_of_factor.add(i);
                if(count==2){
                    primeNocount++;
                }
            }
            return primeNocount;
        }
}
