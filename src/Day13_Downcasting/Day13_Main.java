package Day13_Downcasting;

// 한 파일에 클래스 여러 개 넣을 땐 Main만 public 붙임 (실습용)
class Item {
    public void name() { System.out.println("아이템"); }
}

class Laptop extends Item {
    public void coding() { System.out.println("타닥타닥 코딩 중... 💻"); }
}

class Camera extends Item {
    public void takePhoto() { System.out.println("찰칵! 사진 촬영 📸"); }
}

public class Day13_Main {
    public static void main(String[] args) {
        // 1. 다형성 배열 (모두 Item으로 업캐스팅)
        Item[] inventory = new Item[3];
        inventory[0] = new Laptop();
        inventory[1] = new Camera();
        inventory[2] = new Laptop();

        // 2. 반복문 돌면서 각자 기능 실행
        for (Item item : inventory) {
            // item.coding(); // ❌ 에러! Item 리모컨에는 coding 버튼이 없음.

            // 3. instanceof로 타입 체크 후 다운캐스팅
            if (item instanceof Laptop) {
                // 참(True)이면 안전하게 변환!
                Laptop lap = (Laptop) item; // 껍데기 벗기기 (Downcasting)
                lap.coding(); // 이제 Laptop 기능 사용 가능!
            }
            else if (item instanceof Camera) {
                Camera cam = (Camera) item;
                cam.takePhoto();
            }
        }
    }
}
