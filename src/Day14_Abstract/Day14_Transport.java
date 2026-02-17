package Day14_Abstract;

public class Day14_Transport {
    public static void main(String[] args) {
        Vehicle rides[] = new Vehicle[2];
        rides[0] = new Car("Porsche 911 Carrera GTS");
        rides[1] = new Boat("Yacht");

        for (Vehicle v : rides) {
            if (v instanceof Car c) {
                c.move();
            } else if (v instanceof Boat b) {
                b.move();
            } else {
                System.out.println("으악 이건 내가 아는 차가 아니야");
            }
        }
    }
}

// 부모(Vehicle)에 move()라는 버튼(메서드)이 이미 정의되어 있습니다. (비록 껍데기뿐이지만요)
// 자바는 똑똑해서, v.move()를 호출하면 **실제 메모리에 있는 녀석(Car 또는 Boat)의 오버라이딩된 move()**를 알아서 찾아 실행합니다.
// 만약 Car에만 있는 openSunroof() 기능을 쓴다면 님의 방식(instanceof)이 필수지만, 공통 기능(move)은 그냥 호출해도 됩니다.