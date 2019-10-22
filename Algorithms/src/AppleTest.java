import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] arg) {
        List<String> list = new ArrayList<String>();


    }
}

class A {
    public A test() {
        return new A();
    }
}

class B extends A {
    @Override
    public A test() {
        return new B();
    }
}