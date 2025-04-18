package ymd20250406.q018;

/* 
문제 설명

정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
제한사항

    -10,000 ≤ numbers의 원소 ≤ 10,000
    1 ≤ numbers의 길이 ≤ 1,000

입출력 예
numbers 	result
[1, 2, 3, 4, 5] 	[2, 4, 6, 8, 10]
[1, 2, 100, -99, 1, 2, 3] 	[2, 4, 200, -198, 2, 4, 6]
입출력 예 설명

입출력 예 #1

    [1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.

입출력 예 #2

    [1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.

 */
class Solution {
    public int[] solution(int[] numbers) {
        /* 
        int len = numbers.length;
        int[] answer = new int[len];
        for(int i=0; i<len; i++) {
            int num = Math.multiplyExact(numbers[i], 2);
            answer[i] = num;
        }
        
        return answer;
         */
        return java.util.Arrays.stream(numbers)
                                .map(num -> Math.multiplyExact(num, 2))
                                .toArray();
    }
}