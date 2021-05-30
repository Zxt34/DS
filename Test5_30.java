public class Test5_30 {
    public static void main(String[] args) {
        String s1 = "/usr/login/bin";
        String s2 = "/usr/bin";
        if(!s1.startsWith(s2 + "/"))
            System.out.println("mkdir -p " + s2);
    }
}