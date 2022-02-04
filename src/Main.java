public class Main {

    public static void main(String[] args) {

        FirstClass fc = new FirstClass();
        System.out.println(fc);

        AnotherClass ac = new AnotherClass();
        System.out.println(ac);

    }
}

class FirstClass {

    FirstClass(){}

    @Override
    public String toString() {
        return "I'm First Class, bitch!";
    }

}

class AnotherClass extends FirstClass{

    AnotherClass(){}
/*
    @Override
    public String toString() {
        return "I'm just another Class!";
    }
*/
}