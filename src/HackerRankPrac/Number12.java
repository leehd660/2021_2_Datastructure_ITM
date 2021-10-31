package HackerRankPrac;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Number12 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int X = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int result = Result1.powerSum(X, N);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        int X = 100;
        int N = 3;
        int answer = 0;
        List<Long> table = new ArrayList<>();
        long upperNum = (long) Math.pow(X,1.0/N);
        for (int i=1; i<=upperNum; i++){
            table.add((long) Math.pow(i,N));
        }
//        for (long i:table){
//            System.out.println(i);
//        }
        int result = Result1.powerSum(X, N);
        System.out.println(result);
    }
}
class Result1 {
    public static int powerSum(int X, int N) {
        // Write your code here
        int answer = 0;
        List<Long> table = new ArrayList<>();
        long upperNum = (long) Math.pow(X,1.0/N);
        for (int i=1; i<=upperNum; i++){
            table.add((long) Math.pow(i,N));
//            System.out.println((long) Math.pow(i,N));
        }
        for (int i=1; i<=table.size(); i++) {
            //i는 몇개의 수가 더해져서 만드는가
//            for (int j=0; j<=table.size(); j++) {
                answer += test(X, table, i, 0, 0, 1);
//            }
        }

        return answer;
    }

    static int test(int num, List<Long> table, int n, int i, long total, int count) {
        //num은 다 합쳤을 때,비교하는 대상, table은 table, n은 몇개를 조합할지, i=0
        int answer = 0;
//        long copyTotal = total;
        if (count<=n){
//            System.out.printf("n is %d\n",n);
            for (int a=i; a<table.size()-n+count; a++) {
//                System.out.printf("a is %d\n",a);
                long testNum =total + table.get(a);
//                System.out.println(testNum +"here");
                answer += test(num,table,n,a+1,testNum,count+1);

                if (count==n) {
                    if (total + table.get(a) == num) {
//                        System.out.println(total + table.get(a));
                        answer++;
                    } else {
//                        System.out.println(testNum + "here");
                    }
                }
            }
        }
        return answer;
    }
}
