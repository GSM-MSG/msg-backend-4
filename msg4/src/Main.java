public class Main {
    // 메인 과제 코드
    public static void main(String[] args) {
        // 1. 이름이 msg이고 나이가 17인 사람을 생성합니다.
        // 생성 후 System.out.println("person = ", person)로 객체의 **정보**를 출력해주세요



        // 2. 이름이 msg2이고 나이가 25살인 사람을 생성합니다.
        // 마찬가지로 생성 후 System.out.println("person = ", person)의 출력값이 주소값이 아닌 객체의 정보를 출력해주세요



        // 3. 나이를 검사해서 19세 이하면 Child로 20세 이상이면 Adult 객체를 생성합니다.
        // 필드의 값은 person의 값과 동일하게 생성해야 합니다.



        // 4. 생성된 child와 adult 자기소개를 들어주세요!



        // 5. adult의 나이를 25에서 28로 수정해주시고 다시한번 자기소개를 출력해주세요.

        // 6. child2를 생성해주세요 name과 age는 child와 동일합니다.
        // child와 child2를 비교해서 true가 출력되도록 해주세요!

    }
}

class Person {
    // person 관련 예제 코드 모든 필드는 반.드.시 private로 설정해야한다!
    // person의 필드는 name과 age가 있습니다.
    // 사람은 introduce라는 자기 소개 method가 있습니다. "안녕하세요 저는 name이고 age살 입니다" 를 출력
}

class Child extends Person {
    // child 관련 예제 코드의 모든 필드는 반.드.시 private로 설정해야한다!
    // child는 "응애~ 내 나이는 age"라고 출력하는 자기소개 기능을 가지고 있습니다.
}

class Adult extends Person {
    // adult 관련 예제 코드의 모든 필드는 반.드.시 private로 설정해야한다!
    // adult는 "안녕하세요 저는 어엿한 어른인 name이고 age살입니다" 라고 출력하는 자기소개 기능을 가지고 있습니다.
}