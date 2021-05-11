import java.util.Scanner;

public class Test5_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            String str = "";
            int pos = 1;
            int[] result = new int[4];
            for (int i = 1; i <= num && i <= 4; i++) {
                result[i - 1] = i;
            }
            String commond = sc.next();
            char com;
            if (num <= 4) {
                for (int i = 0; i < commond.length(); i++) {
                    com = commond.charAt(i);
                    if (com == 'U') {
                        pos = pos == 1 ? num : pos - 1;
                    } else {
                        pos = pos == num ? 1 : pos + 1;
                    }
                }
            } else {
                for (int i = 0; i < commond.length(); i++) {
                    com = commond.charAt(i);
                    if (com == 'U') {
                        if (pos == 1) {
                            pos = num;
                            for (int j = 0; j < 4; j++) {
                                result[3 - j] = num - j;
                            }
                        } else if (pos == result[0]) {
                            for (int j = 0; j < 4; j++) {
                                result[j] = result[j]--;
                            }
                            pos--;
                        } else {
                            pos--;
                        }
                    } else {
                        if (pos == num) {
                            pos = 1;
                            for (int j = 0; j < 4; j++) {
                                result[j] = j + 1;
                            }
                            pos++;
                        } else if (pos == result[3]) {
                            for (int j = 0; j < 4; j++) {
                                result[j] = result[j]++;
                            }
                            pos++;
                        } else {
                            pos++;
                        }
                    }
                }
            }
            for (int i = 0; i < result.length && result[i] != 0; i++) {
                str = str + result[i] + " ";
            }
            System.out.println(str.substring(0, str.length() - 1));
            System.out.println(pos);
        }
    }
}