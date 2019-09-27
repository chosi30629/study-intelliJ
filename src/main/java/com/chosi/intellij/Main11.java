package com.chosi.intellij;

import java.time.LocalDate;

public class Main11 {

    public static void main(String[] args) {
        // 브레이크 포인트 잡기 = 왼쪽 숫자 있는 부분에서 클릭
        // 디버깅 실행 = 컨트롤 쉬프트 D
        // 이전 실행환경 디버깅 = 컨트롤 D
        // 다음 브레이크 포인트, Resume = 커멘트 옵션 R
        // step over 다음줄 = F8
        // step info 안으로 들어가기 = F7
        // 안으로 들어간거 빠져나오기 step out = 쉬프트 F8
        LocalDate now = LocalDate.now();

        now.getMonth();

        // 조건 브레이크 i 가 5 일때만 브레이크 = 브레이크 포인트에서 우클릭 후 조건 설정(자바 코드 쓰면 됨)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(now.getYear());

        // 브레이크 걸고 코드 실행. Evaluate Expression = 옵션 F8
        // 밑에서 플러스 버튼 누르고 변수 설정 i; 순서 오면 값 채워
    }

}
