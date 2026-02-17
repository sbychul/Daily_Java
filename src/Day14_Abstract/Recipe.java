package Day14_Abstract;

// abstract class: "나는 미완성 설계도야. 나를 직접 new 하지 마."
public abstract class Recipe {
    String chefName;

    public Recipe(String name) {
        this.chefName = name;
    }

    public void introduce() {
        System.out.println("이 요리는 " + chefName + " 셰프의 레시피입니다.");
    }

    // abstract method: "요리법은 자식마다 다르니 비워둔다. (자식이 채워라!)"
    // 중괄호 {}가 없고 세미콜론 ;으로 끝납니다.
    public abstract void cook();
}