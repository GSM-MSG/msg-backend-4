package huemang;


public class Huemang {

    public static void main(String[] args) {
        // 1. 이름이 msg이고 나이가 17인 person을 생성합니다.
        // 생성 후 System.out.println("person = ", person)로 객체의 **정보**를 출력해주세요
        Person person = new Person("msg", 17);
        System.out.println("person = " + person);

        // 2. 이름이 msg2이고 나이가 25살인 person2 생성합니다.
        // 마찬가지로 생성 후 System.out.println("person2 = ", person2)로 객체의 **정보**를 출력해주세요
        Person person2 = new Person("msg2", 25);
        System.out.println("person2 = " + person2);

        // 3. 나이가 19세 이하면 Child로 20세 이상이면 Adult로 객체를 생성합니다.
        // 필드의 값은 person의 값과 동일하게 생성해야 합니다.
        Child child = new Child(person.getName(), person.getAge());
        Adult adult = new Adult(person2.getName(), person2.getAge());

        // 4. 생성된 child와 adult 자기소개를 들어주세요!
        child.introduce();
        adult.introduce();

        // 5. adult의 나이를 25에서 28로 수정해주시고 다시한번 자기소개를 출력해주세요.
        adult.setAge(28);
        adult.introduce();

    }
}

class Person {
    // person 관련 예제 코드 모든 필드는 반.드.시 private로 설정해야한다!
    // person의 필드는 name과 age가 있습니다.
    // 사람은 introduce라는 자기 소개 method가 있습니다. "안녕하세요 저는 name이고 age살 입니다" 를 출력

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("안녕하세요 저는 " + name + "이고" + age + "살 입니다.");
    }
}

class Child extends Person {
    // child 관련 예제 코드의 모든 필드는 반.드.시 private로 설정해야한다!
    // child는 "응애~ 내 나이는 age"라고 출력하는 자기소개 기능을 가지고 있습니다.


    public Child() {
    }

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("응애 나는 " + super.getAge() + "살");
    }

}

class Adult extends Person {
    // adult 관련 예제 코드의 모든 필드는 반.드.시 private로 설정해야한다!
    // adult는 "안녕하세요 저는 어엿한 어른인 name이고 age살입니다" 라고 출력하는 자기소개 기능을 가지고 있습니다.


    public Adult() {
    }

    public Adult(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("저는 어른 " + super.getAge() + "살");
    }
}