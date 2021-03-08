package Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PokerGame {
    public static String[] suits = {"♥", "♠", "♣", "♦"};

    public static List<Card> buyPoker(){
        List<Card> poker = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                poker.add(new Card(suits[i] , String.valueOf(j)));
            }
            poker.add(new Card(suits[i] , "J"));
            poker.add(new Card(suits[i] , "Q"));
            poker.add(new Card(suits[i] , "K"));
            poker.add(new Card(suits[i] , "A"));
        }
        poker.add(new Card("" , "red King"));
        poker.add(new Card("" , "black King"));
        return poker;
    }

    public static void shuffle(List<Card> poker){
        Random random = new Random();
        for (int i = poker.size() - 1; i > 0; i--) {
            int index = random.nextInt(i);
            swap(poker,i,index);
        }
    }

    private static void swap(List<Card> poker, int i, int index) {
        Card temp = poker.get(i);
        poker.set(i,poker.get(index));
        poker.set(index,temp);
    }

    public static void main(String[] args) {
        List<Card> poker = buyPoker();
//        Collections.shuffle(poker);
        shuffle(poker);
        System.out.println(poker);
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card top = poker.remove(0);
                players.get(j).add(top);
            }
        }
        for (int i = 0; i < players.size(); i++) {
            List<Card> player = players.get(i);
            System.out.println("玩家" + i + "的手牌是：" + player);
        }
    }
}
