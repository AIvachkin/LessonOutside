package ExcepLesson;

public class ErrorExample {

//    Throwable
    private Abc abc ;

    public void foo() {
        try { abc.show(); }
        catch (NullPointerException e ) {
//            e.printStackTrace();
            System.err.println("Деление на ноль");
        }

    }
}
