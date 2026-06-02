package Day52;

@FunctionalInterface // 람다식 전용 인터페이스임을 명시
public interface NumericOperator {
    int operate(int a, int b);
}