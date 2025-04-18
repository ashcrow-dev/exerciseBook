package ymd20250406.q002;

import java.util.Scanner;

/* 
문제 설명

정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
제한사항

    -100,000 ≤ a, b ≤ 100,000

입출력 예

입력 #1

4 5

출력 #1

a = 4
b = 5
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // System.out.println(a + b);
        System.out.println(String.join(" = ", "a", String.valueOf(a)));
        System.out.println(String.join(" = ", "b", String.valueOf(b)));
        sc.close();
    }
}
