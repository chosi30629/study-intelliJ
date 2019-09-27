package com.chosi.intellij;

import java.time.Instant;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main7 {
    private String name;


    public static void main(String[] args) {
        // 컨트롤 스페이스 = 일반 자동완성
        // 컨트롤 쉬프트 스페이스 = 스마트 자동완성(관련된 것 만 나옴)
        Calendar c = new GregorianCalendar(Locale.KOREAN);

        // 컨트롤 스페이스 두번 = static 메소드 자동완성
        Instant.now();
     }

    // 오버라이드 게터 세터 생성자 = 커멘드 N
    // 오버라이드만 = 컨트롤 I
    public Main7(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
