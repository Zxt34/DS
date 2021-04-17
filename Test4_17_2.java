public class Test4_17_2 {
    public int StrToInt(String str) {
        if(str.length() == 0)
            return 0;
        char[] chArr = str.toCharArray();
        int flag = 0;
        if(chArr[0] == '+')
            flag = 1;
        else if(chArr[0] == '-')
            flag = 2;
        int start = flag > 0 ? 1 : 0;
        int res = 0;
        for (int i = start; i < chArr.length; i++) {
            if(Character.isDigit(chArr[i])){
                int temp = chArr[i] - '0';
                res = res * 10 + temp;
            }else{
                return 0;
            }
        }
        return flag == 1 ? res : -res;
    }
}