package Day15_Interface;

public class Day15_User {
    public static void main(String[] args) {
        SmartPhone s24 = new SmartPhone();

        s24.call("010-1234-5678");
        s24.receive();
        s24.playMusic("Closer (ft. Halsey)");
        s24.stopMusic();
        s24.takePhoto();
        s24.recordVideo();
    }
}

// 인터페이스로 시야 가리기
// 작성하신 Main 코드에서는 SmartPhone 타입으로 모든 기능을 다 썼습니다.
// 하지만 실무에서는 "필요한 기능만 노출하기 위해" 인터페이스를 변수 타입으로 쓰기도 합니다.
// SmartPhone s24 = new SmartPhone();

// 1. 엄마한테는 '전화기' 기능만 있는 줄 알게 하고 싶다.
// Phone momsPhone = s24;
// momsPhone.call("엄마");
// momsPhone.playMusic(); // ❌ 에러! (전화기 인터페이스에는 음악 기능이 안 보임)

// 2. 친구한테는 '카메라'만 빌려주고 싶다.
// Camera friendsCam = s24;
// friendsCam.takePhoto();
// friendsCam.call("..."); // ❌ 에러! (카메라로 전화를 걸 순 없음)