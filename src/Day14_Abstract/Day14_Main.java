package Day14_Abstract;

public class Day14_Main {
    public static void main(String[] args) {
        // Recipe r = new Recipe("김셰프"); // ⚠️ 에러! (추상 클래스는 객체 생성 불가)

        Recipe pasta = new PastaRecipe("안성재"); // 자식으로 만드는 건 OK (다형성)
        pasta.introduce(); // 부모의 일반 메서드 사용
        pasta.cook();      // 자식이 구현한 메서드 사용
    }
}