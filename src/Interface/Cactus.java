package Interface;

public class Cactus extends Flower implements Color{
    @Override
    public void view() {
        System.out.println("Cactus");
    }

    @Override
    public void color() {
        System.out.println("Green");
    }
}
