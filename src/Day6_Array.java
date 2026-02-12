public class Day6_Array {
    public static void main(String[] args) {
        // 자바는 배열을 만들 때 동적 할당이 자동으로 됨!!!! 야르

        // 방법 1. 선언과 동시에 빈 방 만들기 (0으로 초기화됨)
        // 💡 C언어 스타일 vs 자바 스타일
        // int scores[] (C언어 스타일, 자바도 허용함)
        // int[] scores (자바 스타일, 추천 ⭐) -> "이 변수는 int배열 타입이다"라는 게 더 명확하기 때문입니다.
        int[] arr1 = new int[3]; // 이 때 메모리에 방 3개가 생김
        arr1[0] = 10;
        arr1[1] = 20;
        // arr1[2]는 자동으로 0

        // 방법 2. 선언과 동시에 값 채우기 (가장 많이 씀)
        // C언어: int arr2[] = {1, 2, 3};
        // Java: new int[] 생략 가능 (자동으로 채워진 갯수만큼 방을 만듦, 한 번 만들면 배열의 크기 조정 불가!!)
        String[] fruits = {"사과", "포도", "바나나"}; //

        // 방법 3. 나중에 값을 채워야 할 때 (new int[] 생략 불가!)
        int[] arr3; // 배열 선언
        arr3 = new int[] {100, 200, 300}; // 여기서 new int[] 안 쓰면 에러 남

        // === 출력 테스트 (향상된 for문) ===
        System.out.println("과일 목록 (총 " + fruits.length + "개):");

        // Python: for f in fruits:
        for (String f : fruits) {
            System.out.println(f);
        }

        // 주의: 범위를 벗어나면?
        // C언어: 운 나쁘면 이상한 값(이게 오히려 안 좋음), 운 좋으면 터짐
        // Java: 무조건 터짐 (ArrayIndexOutOfBoundsException) -> 안전함!
        // System.out.println(arr1[5]); // 실행 시 에러 발생
    }
}