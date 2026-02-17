package Day14_Abstract;

// 상속받는 순간 빨간 줄이 뜰 겁니다. (왜? 부모의 숙제 cook()을 안 해서!)
public class PastaRecipe extends Recipe {

    public PastaRecipe(String name) {
        super(name);
    }

    // 부모가 비워둔 메서드를 반드시 오버라이딩(구현)해야 함. (강제성)
    @Override
    public void cook() {
        System.out.println("🍝 파스타를 삶고 소스를 부어서 만듭니다.");
    }
}
