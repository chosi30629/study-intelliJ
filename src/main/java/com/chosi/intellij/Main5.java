package com.chosi.intellij;

public class Main5 {

    public static void main(String[] args) {
        // 옵션 방향키 : 단어 단위 이동
        // 옵셥 쉬프트 방향키 : 단어 단위 블럭
        String s = "안녕하세요 반갑습니다. 하이 하이 intelliJ";

        // 커멘드 방향키 라인 : 맨끝 맨 처음
        // 커멘트 쉬프트 방향키 : 라인 블럭


        // 옵션 위로 : 단어 블록 - 한 번 더 하면 관련된 것도 다 블럭, 계속 가능
        System.out.println("ㅁㄴㅇㄹ");
        System.out.println("ㅁㄴㅇㄹ");
        System.out.println("ㅁㄴㅇㄹ");
        System.out.println("ㅁㄴㅇㄹ");
        System.out.println("ㅁㄴㅇㄹ");

        // 커멘드 좌측 대괄호 : 이전 포커스 - 클래스 이동도 가능
        // 커멘드 우측 대활호 : 원래 포커스 - 클래스 이동도 가능

        // 옵션 두 번 누른채로 위아래 : 멀티포커스
    }

    public void tesT() {
        // 오류가 난 곳으로 바로 이동 F2
//        return "asd";
    }

}
