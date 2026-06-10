package Day58;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day58_Main {
    public static void main(String[] args) {
        ArrayList<String> drivers = new ArrayList<>();
        drivers.add("Antonelli");
        drivers.add("Hamilton");
        drivers.add("Hadjar");
        drivers.add("Piastri");

        System.out.println("[원본 데이터, 6R 모나코 그랑프리 1위~4위]");
        System.out.println(drivers);

        System.out.println("\n[소문자 변환 결과]");
        drivers.stream()
                .map(driver -> driver.toLowerCase())
                .forEach(System.out::println);

        List<Integer> nameLengths = drivers.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("\n[글자 수 추출 결과]");
        System.out.println(nameLengths);
    }
}
