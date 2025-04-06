package ymd20250406.q004;

import java.util.Scanner;

/* 
문제 설명

영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
제한사항

    1 ≤ str의 길이 ≤ 20
        str은 알파벳으로 이루어진 문자열입니다.

입출력 예

입력 #1

aBcDeFg

출력 #1

AbCdEfG
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
        
        sc.close();
    }
}
