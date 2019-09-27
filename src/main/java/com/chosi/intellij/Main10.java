package com.chosi.intellij;

public class Main10 {

    public static void main(String[] args) {
        // 클래스, 메소드, 변수 사용하는 것까지 다 변경 : 이름에서 쉬프트 F6
        // 타입 변경 : 커멘트 쉬프트 F6 사용하는 곳까지 다 변경
        String name = "abc";

        System.out.println(name);
        System.out.println(name.equalsIgnoreCase(name));

        // 안쓰는 임포트 제거 = 컨트롤 옵션 O
        // 자동 제거 = Auto import 의 optimize import 체크

        // 코드 정렬. 포커스 어디든 상관 없이 = 커멘트 옵션 L
        String abc = "abc"; for (int i = 0; i < 10; i++) { System.out.println(abc);}System.out.println();
    }

}
