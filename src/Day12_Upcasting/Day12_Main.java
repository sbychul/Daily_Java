package Day12_Upcasting;

public class Day12_Main {
        public static void main(String[] args) {
            // 1. 다형성 활용: 부모 타입 배열에 자식들 다 때려 넣기
            Monster[] myMonsters = new Monster[3];

            myMonsters[0] = new Slime("초록이", 50);
            myMonsters[1] = new Dragon("투슬리스", 1000);
            myMonsters[2] = new Slime("물컹이", 30);

            // 2. 반복문으로 일괄 명령 내리기
            System.out.println("=== 전군 공격 개시! ===");

            for (Monster m : myMonsters) {
                // 놀라운 점: m은 껍데기가 'Monster'지만,
                // 실제 알맹이(Slime/Dragon)의 오버라이딩된 attack()이 실행됩니다!
                m.attack();
            }
            // m.attack()을 호출할 때, 자바는 "변수 타입(Monster)이 뭐냐?"를 보지 않고, "실제 메모리에 있는 객체(new ...)가 누구냐?"를 보고 실행합니다.
            // 그래서 슬라임은 "점액 발사", 드래곤은 "화염 발사"가 나옵니다.
        }
    }
