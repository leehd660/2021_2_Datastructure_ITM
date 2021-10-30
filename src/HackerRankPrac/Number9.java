package HackerRankPrac;

import java.util.Scanner;

public class Number9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input=scanner.next();
            String[] arr = input.split("");
            boolean answer = true;
            int aOpenCount = 0;
            int aCloseCount = 0;
            int bOpenCount = 0;
            int bCloseCount = 0;
            int cOpenCount = 0;
            int cCloseCount = 0;
            for (String s : arr) {
                if (s.equals("[")) {
                    aOpenCount++;
                }
                else if (s.equals("]")) {
                    aCloseCount++;
                }
                else if (s.equals("{")) {
                    bOpenCount++;
                }
                else if (s.equals("}")) {
                    bCloseCount++;
                }
                else if (s.equals("(")) {
                    cOpenCount++;
                }
                else if (s.equals(")")) {
                    cCloseCount++;
                }
                if (aOpenCount < aCloseCount || bOpenCount < bCloseCount || cOpenCount < cCloseCount) {
                    answer = false;
                    break;
                }
            }
            if (aOpenCount == aCloseCount && bOpenCount == bCloseCount && cOpenCount == cCloseCount) {
                answer = true;
            }
            else {
                answer = false;
            }
            System.out.println(answer);
        }
    }
}
