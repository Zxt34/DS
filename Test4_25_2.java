import java.util.*;

public class Test4_25_2 {
    public int binInsert(int n, int m, int j, int i) {
        String strN = Integer.toBinaryString(n);
        String strM = Integer.toBinaryString(m);
        String M = new StringBuffer(strM).reverse().toString();
        StringBuffer sbN = new StringBuffer(strN).reverse();
        String zero = "";
        for (int k = j; k < i + 1; k++) {
            zero += '0';
        }
        sbN.replace(j,i + 1,zero);
        sbN.replace(j,j + M.length(),M);
        String res = sbN.reverse().toString();
        return Integer.parseInt(res,2);
    }
}