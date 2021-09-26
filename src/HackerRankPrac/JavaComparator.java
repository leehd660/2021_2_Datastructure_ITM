package HackerRankPrac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        int result = 1;
        if (a.score == b.score){
            if (a.name.compareTo(b.name) > 0){
                result = 1;
            }
            else {
                result=-1;
            }
        }
        else {
            if (a.score>b.score){
                result = -1;
            }
            else {
                result =1;
            }
        }
        return result;
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}


