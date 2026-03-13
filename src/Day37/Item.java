package Day37;

public class Item {
    private String name;
    private int stat;

    public Item(String name, int stat) { // 이름과 전투력을 입력받아 초기화.
        this.name = name;
        this.stat = stat;
    }

    public int getStat() { // 전투력 수치를 밖으로 꺼내주는 Getter.
        return stat;
    }

    public String getName() { // 아이템 이름을 밖으로 꺼내주는 Getter.
        return name;
    }

    @Override
    public String toString() { // "[아이템명] (전투력: +[stat])" 형식으로 문자열을 반환.
        return "[" + name + "] (전투력 + [" + stat + "])";
    }
}
