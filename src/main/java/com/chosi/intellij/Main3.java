package com.chosi.intellij;

public class Main3 {

    public static void main(String[] args) {
        // 한줄 복사 = 커멘드 D
        // 한줄 삭제 = 커멘드 딜리트(백스페이스)
        System.out.println("현재 줄 복사1");
        System.out.println("현재 줄 복사1");
        System.out.println("현재 줄 복사");

        // 컨트롤 쉬프트 J = '+' 기준 위아래 합치기 / 블록 지정도 가능 / J 는 조인
        String dd = "문장1" +
                "문장2" +
                "문장3";

        // 라인 옮기기
        // 문법 오류 없이 옮기기 : 옵션 쉬프트 방향키
        // 문법 오류 있이 옮기기 : 커멘드 쉬프트 방향키
        System.out.println("라인옮기기1");
        System.out.println("라인옮기기2");

        System.out.println("라인옮기기3");
    }

}
