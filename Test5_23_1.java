import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test5_23_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int y = sc.nextInt();
            int mon[] = new int[]{1,2,5,9,11};
            int len = mon.length;
            int wek[] = new int[len];
            Calendar cal = Calendar.getInstance();
            try{
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
                for (int i = 0; i < len; i++) {
                    Date date = dateFormat.parse(y + "-" + mon[i] + "-1");
                    cal.setTime(date);
                    int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
                    if(week == 0)
                        week = 7;
                    wek[i] = week;
                    System.out.println(week);
                }
            } catch (Exception e) {

            }
            System.out.println(y + "-01-01");
            int jan = wek[0];
            int rs = 0;
            String strRs = "";
            if(jan == 1){
                rs = 2 * 7 + 1;
            }else{
                rs = 3 * 7 - (jan - 1) + 1;
            }
            strRs = rs / 10 == 0 ? "0" + rs : String.valueOf(rs);
            System.out.println(y + "-01-" + strRs);
            int feb = wek[1];
            if(feb == 1){
                rs=2*7+1;
            }
            else{
                rs=3*7-(feb-1)+1;
            }
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-02-"+strRs);
            int may=wek[2];
            if(may>=6){
                rs=may==6?31:30;
            }
            else{
                rs=4*7-(may-1)+1;
            }
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-05-"+strRs);
            System.out.println(y+"-07-04");
            int sep=wek[3];
            if(sep==1){
                rs=1;
            }
            else{
                rs=1*7-(sep-1)+1;
            }
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-09-"+strRs);
            int nov=wek[4];
            rs=4*7-(nov-1)+1+3;
            strRs=rs/10==0?"0"+rs:String.valueOf(rs);
            System.out.println(y+"-11-"+strRs);
            System.out.println(y+"-12-25");
            System.out.println();
        }
    }
}