public class Test1_29 {
    public static void main(String[] args) {
//        System.out.println(fib(8));
//        System.out.println(sum(10));
//        System.out.println(fic(5));
//        System.out.println(digitSum(513));
    }

    public static int digitSum(int i) {
        if(i == 0)
            return 0;
        else
            return (i % 10 + digitSum(i / 10));
    }

    public static int fic(int i) {
        if(i == 1)
            return 1;
        else
            return i * fic(i - 1);
    }

    public static int sum(int i) {
        if(i == 1)
            return 1;
        else
            return i + sum(i - 1);
    }

    public static int fib(int i) {
        if(i == 1 || i == 2)
            return 1;
        else
            return fib(i - 2) + fib(i - 1);
    }
}