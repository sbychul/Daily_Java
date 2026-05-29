package Day48;

public class D48_Main {
    public static void main(String[] args) {
        SecureRepo<String> strRepo = new SecureRepo<>();

        strRepo.store("Kimi Antonelli");
        strRepo.store("George Russell");
        strRepo.store("Charles Leclerc");
        strRepo.store("Lewis Hamilton");
        strRepo.store("Lando Norris");
        strRepo.store("Oscar Piastri");

        System.out.println(strRepo.retrieve(4));
        System.out.println(strRepo.retrieve(5));

        strRepo.showAll();
    }
}
