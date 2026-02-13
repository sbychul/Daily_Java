package Day10_Inheritance;

public class Student {
    protected String name; // protected: 상속받은 자식한테는 물려줄게! (private은 자식도 못 씀)
    protected int age;

    public void eat() {
        System.out.println(name + "이(가) 급식을 먹습니다.");
    }

    public void sayHello() {
        System.out.println("안녕하세요, 저는 학생입니다.");
    }
}
