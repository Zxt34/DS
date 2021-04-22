public class Test4_22_3 {
    public int getLCA(int a, int b) {
        while(a != b){
            if(a > b)
                a /= 2;
            else
                b /= 2;
        }
        return a;
    }
}