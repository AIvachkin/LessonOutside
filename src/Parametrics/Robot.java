package Parametrics;

public class Robot <T extends Head> {

    private final Body body;
    private final T head ;

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public T getHead() {
        return head;
    }
}
