package Day59;

import java.util.ArrayList;

// 실행, 디버깅 미진행본
public class Day59_Main {
    public static void main(String[] args) {
        DataStorage<Driver> driversStorage = new DataStorage<>(new ArrayList<>());

        driversStorage.addData(new Driver("Lewis Hamilton", "Scuderia Ferrari HP"));
        driversStorage.addData(new Driver("Max Verstappen", "ORACLE RED BULL RACING"));
        driversStorage.addData(new Driver("Lando Norris", "McLaren MasterCard F1 Team"));

        driversStorage.getList().forEach(System.out::println);
    }
}
