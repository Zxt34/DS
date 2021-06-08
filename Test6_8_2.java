import java.util.*;

public class Test6_8_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String []strArray=str.split("[^a-zA-Z]+");
            for(int i=strArray.length-1;i>=2;i--){
                 System.out.print(strArray[i]+' ');
            }
            if(strArray[0].length()==0)
                System.out.println(strArray[1]);
            else
                System.out.println(strArray[1]+' '+strArray[0]);
        }
    }
}
