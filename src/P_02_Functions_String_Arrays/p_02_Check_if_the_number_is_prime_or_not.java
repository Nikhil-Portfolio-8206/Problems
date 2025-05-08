package P_02_Functions_String_Arrays;

public class p_02_Check_if_the_number_is_prime_or_not {
    public int add(int A) {
        int Count= 0;
        for(int i=1;i<=A;i++){
            if(A%i==0){
                Count++;
            }
        }
//        if(count==2){
//            return "yes";
//        }
//        return "no";
        return Count;
    }
}
