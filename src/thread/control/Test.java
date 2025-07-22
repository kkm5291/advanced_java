package thread.control;

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.method();
    }

    static class Parent {
        public void method() {
            System.out.println("Parent method");
        }
    }

    static class Child extends Parent {
        @Override
        public void method() {
            System.out.println("Child method");
        }
    }
}
