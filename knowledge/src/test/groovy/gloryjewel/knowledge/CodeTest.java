package gloryjewel.knowledge;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CodeTest {

    /**
     * 📝 모의 코딩 테스트 (생명 백엔드용)
     * 문제 1. 문자열 압축
     *
     * 설명: 같은 문자가 연속으로 나올 때, 문자 뒤에 반복 횟수를 붙여서 압축
     * 예시: "aaabbc" → "a3b2c1"
     *
     * 풀이 전략
     *
     * 반복문으로 문자열 순회
     *
     * 현재 문자와 이전 문자 비교
     *
     * 카운트 누적 후 새로운 문자로 결과 문자열 생성
     *
     * 문제 2. 배열에서 최대 연속 합
     *
     * 설명: 정수 배열이 주어졌을 때, 연속된 원소들의 합 중 최대값 구하기
     * 예시: [1, -2, 3, 4, -1, 2] → 8
     *
     * 풀이 전략
     *
     * 카데인 알고리즘(Kadane’s Algorithm) 활용
     *
     * 현재 합이 음수면 버리고, 다음 원소부터 새로 시작
     *
     * 문제 3. 괄호 짝 확인
     *
     * 설명: 문자열에 괄호 (), {}, []가 섞여 있을 때, 올바르게 닫혔는지 확인
     * 예시: "([{}])" → true, "([)]" → false
     *
     * 풀이 전략
     *
     * 스택 사용
     *
     * 여는 괄호는 스택에 push, 닫는 괄호는 pop 후 매칭 확인
     *
     * 문제 4. 중복 없는 가장 긴 부분 문자열
     *
     * 설명: 문자열에서 중복 문자 없이 만들 수 있는 가장 긴 연속 부분 문자열 길이 구하기
     * 예시: "abcabcbb" → 3 ("abc")
     *
     * 풀이 전략
     *
     * 슬라이딩 윈도우 사용
     *
     * 해시맵/집합으로 중복 문자 체크
     *
     * 포인터 이동하며 최대 길이 갱신
     *
     * 문제 5. 배열의 두 수 합
     *
     * 설명: 정수 배열과 목표 값이 주어질 때, 합이 목표 값이 되는 두 수 인덱스 반환
     * 예시: [2, 7, 11, 15], target=9 → [0,1]
     *
     * 풀이 전략
     *
     * 해시맵으로 값과 인덱스 저장
     *
     * 배열 순회하면서 target - 현재값 존재 여부 확인
     *
     * O(n) 시간 복잡도로 구현 가능
     *
     * 💡 실전 대비 팁
     *
     * 문제 당 15~20분 목표로 풀기
     *
     * 작은 입력값으로 테스트 케이스 먼저 확인
     *
     * 기본 자료구조 숙지: 배열, 문자열, 스택, 해시맵
     */

    /**
     * 설명: 같은 문자가 연속으로 나올 때, 문자 뒤에 반복 횟수를 붙여서 압축
     * 예시: "aaabbc" → "a3b2c1"
     */
    @Test
    void testAdd() {

        final String inString = "aaabbc";
        StringBuilder outString = new StringBuilder();
        Map<String,Integer> mapString = new HashMap<>();

        for(int i=0; i < inString.length(); i++) {

            final String key = inString.charAt(i) + "";
            final Integer value = mapString.get(key);
            if(value == null) {
                mapString.put(key, 1);
            }else{
                mapString.put(key, value + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : mapString.entrySet()) {
            outString.append(entry.getKey());
            outString.append(entry.getValue());
        }

        assertEquals("a3b2c1", outString.toString());
    }

    @Test
    void testMinus() {
        assertEquals(5, 5);
    }
}