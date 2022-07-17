package ExcepLesson;

public class Square {
    public double side;

    public void setSide(double side) throws PerimeterException {
        if (side <= 0) {
            throw new PerimeterException("Side is incorrect");

        }

        this.side = side;
    }
}
