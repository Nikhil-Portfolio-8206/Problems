package P_02_Functions_String_Arrays;

public class p_02_count_no_of_factor {
    public static int add(int A) {
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
