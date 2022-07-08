import Interface.Cactus;
import Interface.Rose;
import Interface.Test;

public class Main {
    public static void main(String[] args) {

        Rose rose = new Rose();
        Cactus cactus = new Cactus();
        Test test = new Test();
        rose.color();
        cactus.view();
        test.foo(rose);
        test.foo(cactus);

    }

}