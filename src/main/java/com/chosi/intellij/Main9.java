package com.chosi.intellij;

public class Main9 {

    public void extractVariable() {
        extractVariable(190);
    }

    public void extractVariable(int xpp) {
        // 변수 뽑기 = 커멘트 옵션 V
        // this 는 선택한거 하나만, 그 밑에꺼는 replaceAll 중복된거 다
        String format = String.format("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(format);
        System.out.println(String.format("%d + % d = %d", 1, 2, 1+2));

        // 파라미터 뽑기 = 커멘트 옵션 P
        // delegate 는 파라미터를 받지 않는 오버로딩 메소드 추
        System.out.println(xpp);
        System.out.println(xpp);
    }

    // 메소드 뽑기 = 커멘트 옵션 M
    public void extractMethod() {
        for (int i = 0; i < 10; i++) {
             jFor(i);
        }
    }

    private void jFor(int i) {
        for (int j = 0; j < 10; j++) {
            print(i);
        }
    }

    private void print(int i) {
        if (i % 2 == 0) {
            System.out.println(i + "는 짝");
        }
    }

    public static void main(String[] args) {
        Main9 main9 = new Main9();
        main9.extractMethod();
    }

    // 내부클래스 뽑기
    // 클래스이름에서 F6
    public static class Main10 {

    }

}
