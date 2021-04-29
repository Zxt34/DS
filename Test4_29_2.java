import java.util.Scanner;

public class Test4_29_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] pokers = str.split("-");
            String[] player1 = pokers[0].split(" ");
            String[] player2 = pokers[1].split(" ");
            if(player1.length == 2 && player1[0].equals("joker") && player1[1].equals("JOKER") || player2.length == 2 && player2[0].equals("joker") && player2[1].equals("JOKER")){
                System.out.println("joker JOKER");
            }else if(player1.length == 4 && player1.length > player2.length || player1.length > player2.length && player2.length == 4){
                if(player1.length == 4 && player1[0].equals(player1[1]) && player1[1].equals(player1[2]) && player1[2].equals(player1[3])){
                    System.out.println(player1[0] + " " + player1[1] + " " + player1[2] + " " + player1[3]);
                }else if(player2.length == 4 && player2[0].equals(player2[1]) && player2[1].equals(player2[2]) && player2[2].equals(player2[3])){
                    System.out.println(player2[0] + " " + player2[1] + " " + player2[2] + " " + player2[3]);
                }
            }else if(player1.length == 4 && player1.length < player2.length || player1.length < player2.length && player2.length == 4){
                if(player1.length == 4 && player1[0].equals(player1[1]) && player1[1].equals(player1[2]) && player1[2].equals(player1[3])){
                    System.out.println(player1[0] + " " + player1[1] + " " + player1[2] + " " + player1[3]);
                }else if(player2.length == 4 && player2[0].equals(player2[1]) && player2[1].equals(player2[2]) && player2[2].equals(player2[3])){
                    System.out.println(player2[0] + " " + player2[1] + " " + player2[2] + " " + player2[3]);
                }
            }else if(player1.length == player2.length){
                String strP1 = player1[0];
                strP1 += " ";
                for (int i = 1; i < player1.length; i++) {
                    strP1 += player1[i];
                    if(i != player1.length - 1)
                        strP1 += " ";
                }
                String strP2 = player2[0];
                strP2 += " ";
                for (int i = 1; i < player2.length; i++) {
                    strP2 += player2[i];
                    if(i != player2.length - 1)
                        strP2 += " ";
                }
                if(player1[0].equals("2"))
                    System.out.println(strP1);
                else if(player2[0].equals("2"))
                    System.out.println(strP2);
                else {
                    if(player1[0].equals("10"))
                        player1[0] = "A";
                    else if(player1[0].equals("J"))
                        player1[0] = "B";
                    else if(player1[0].equals("Q"))
                        player1[0] = "C";
                    else if(player1[0].equals("K"))
                        player1[0] = "D";
                    else if(player1[0].equals("A"))
                        player1[0] = "E";
                    if(player2[0].equals("10"))
                        player2[0] = "A";
                    else if(player2[0].equals("J"))
                        player2[0] = "B";
                    else if(player2[0].equals("Q"))
                        player2[0] = "C";
                    else if(player2[0].equals("K"))
                        player2[0] = "D";
                    else if(player2[0].equals("A"))
                        player2[0] = "E";
                    if(Integer.parseInt(player1[0],16) > Integer.parseInt(player2[0],16)){
                        System.out.println(strP1);
                    }else{
                        System.out.println(strP2);
                    }
                }
            }else{
                System.out.println("ERROR");
            }
        }
    }
}