import CloneObjects.CloneDolly;
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

        CloneDolly cloneDolly = new CloneDolly();
        CloneDolly cloneDolly1 = foo(cloneDolly);

        cloneDolly.setName("Dolly");
        cloneDolly1.setName("Sheet");

        System.out.println(cloneDolly.getName());
        System.out.println(cloneDolly1.getName());
    }

    public static CloneDolly foo(CloneDolly cloneDolly) {
        CloneDolly dolly = null;
        try {
            dolly = (CloneDolly) cloneDolly.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return dolly;
    }

}