package HackerRankPrac;

import java.util.*;

public class Number10 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        Deque deque = new ArrayDeque<>();
//        String numStr = bf.readLine();
//        String[] arr = numStr.split(" ");
//        int n = Integer.parseInt(arr[0]);
//        int m = Integer.parseInt(arr[1]);
////        int[] arr = new int[n];
//        int maxNum = 0;
//        String str = bf.readLine();
//        String[] strArr = str.split(" ");
////        for (int i = 0; i < n; i++) {
////            int num = scanner.nextInt();
////            deque.addLast(num);
//////            arr[i] = num;
////        }
//
//        for (int i=0; i<n-m+1; i++) {
////            for (int k=0;k<i;k++){
////                deque.removeFirst();
////            }
//            Set<String> set = new HashSet<>();
//            for (int j=i; j<i+m; j++){
//                //그냥 m번씩 뽑는거
////                int a = (int) deque.getFirst();
////                set.add(a);
////                deque.removeFirst();
////                deque.addLast(a);
//                set.add(strArr[j]);
//            }
//            maxNum = Math.max(maxNum,set.size());
////            for (int k=0; k<m; k++){
////                deque.addFirst(deque.pollLast());
////            }
////            deque.removeFirst();
//        }
//        bw.write(String.valueOf(maxNum));
//        bw.close();
////        System.out.println(maxNum);
//    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxNum = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            set.add(num);

            if (deque.size()==m) {
                maxNum = Math.max(maxNum, set.size());
//                if (!set.contains(deque.getFirst())) {
//                    set.remove(deque.pollFirst());
//                }
//                if (set.size() > max) max = set.size();
                int first = (int) deque.removeFirst();
                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
        }
        System.out.println(maxNum);
    }
}
