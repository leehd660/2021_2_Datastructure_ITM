package HackerRankPrac;

import java.io.*;

public class Number11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(bufferedReader.readLine().trim());

            String result = Result.isFibo(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
class Result {

    /*
     * Complete the 'isFibo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String isFibo(long n) {
        // Write your code here
        String answer = "";
        long beforeNum = 0;
        long nowNum = 1;
        while (nowNum<=n) {
            if (nowNum==n) {
                answer = "IsFibo";
                break;
            }
            long keepNum = nowNum;
            nowNum = nowNum+beforeNum;
            beforeNum = keepNum;
        }
        if (answer.equals("")){
            answer = "IsNotFibo";
        }
        return answer;
    }

}
