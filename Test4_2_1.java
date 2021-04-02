import java.util.*;

    public class Test4_2_1 {
        public static void main(String[]args){
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int f1=0;
            int f2=1;
            int f3=0;
            while (f2 < n){
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            if(Math.abs(f2 - n) > Math.abs(f1 - n)){
                System.out.println(Math.abs(f1-n));
            } else{
                System.out.println(Math.abs(f2-n));
            }
        }
    }