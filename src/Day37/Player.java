package Day37;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Item> inventory = new ArrayList<>();

    public Player(String name) { // 용사 이름을 입력받아 초기화.
        this.name = name;
    }

    public void acquireItem(Item item) { // 전달받은 아이템 객체를 inventory 리스트에 추가.
        inventory.add(item);
        System.out.printf("\uD83C\uDF92 [%s]이(가) [%s]을(를) 획득했습니다!%n", name, item.getName());
    }

    public void showInventory() {
        if (inventory.isEmpty()) { // 가방이 비어있다면
            System.out.println("텅~ (가방에 아무것도 없습니다.)");
        } else { // 비어있지 않다면
            for (Item myItem : inventory) { // for문을 돌며 가방 안의 모든 아이템 정보를 한 줄씩 출력.
                System.out.println(myItem);
            }
        }
    }

    public void showTotalStat() { // 모든 아이템의 전투력(stat)을 합산하여 총 전투력을 계산.
        int totalStat = 0;
        for (Item myItem : inventory) {
            totalStat += myItem.getStat();
        }
        System.out.printf("\uD83D\uDCAA [%s]의 현재 총 전투력: [%d]%n", name, totalStat + 100);
    }
}
