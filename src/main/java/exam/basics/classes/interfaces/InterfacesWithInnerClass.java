package exam.basics.classes.interfaces;

/**
 * User: andrey.osipov
 */
public interface InterfacesWithInnerClass {

    /*
    Yes it's allowed to declare classes, enums etc.. in interfaces!
     */
    class A {

        public A() {
            System.out.println("I may write code in interfaces :)");
        }

        public static void main(String[] args) {
            System.out.println("what's up doc ;)");
        }
    }

    enum WeekType {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}