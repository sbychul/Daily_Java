package Day53;

import java.util.ArrayList;

public class Day53_Main {
    public static void main(String[] args) {
        ArrayList<String> drivers = new ArrayList<>();
        drivers.add("Lando Norris");
        drivers.add("Max Verstappen");
        drivers.add("Oscar Piastri");
        drivers.add("George Russell");
        drivers.add("Charles Leclerc");

        // 람다식을 활용한 이름이 L로 시작하는 드라이버만 필터링하여 출력.
        System.out.println("[이름이 L로 시작하는 드라이버]");
        drivers.forEach((name) -> { if(name.startsWith("L"))
            System.out.println(name);});

        // 메소드 참조를 이용한 전체 출력
        System.out.println("\n[전체 드라이버 명단]");
        drivers.forEach(System.out::println);
    }
}
