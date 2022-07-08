package Interface;

public class Rose extends Flower implements Color{


    @Override
    public void view() {
        System.out.println("Rose");
    }

    @Override
    public void color() {
        System.out.println("Red");
    }
}
