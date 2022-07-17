import CloneObjects.CloneDolly;
import Collections.Person;
import ExcepLesson.ErrorExample;
import ExcepLesson.PerimeterException;
import ExcepLesson.PerimeterSquare;
import Interface.Cactus;
import Interface.Rose;
import Interface.Test;
import Parametrics.Body;
import Parametrics.Head;
import Parametrics.Robot;
import Parametrics.SmallHead;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeSymbol.iterator;

public class Main {
    public static void main(String[] args) {

//        Rose rose = new Rose();
//        Cactus cactus = new Cactus();
//        Test test = new Test();
//        rose.color();
//        cactus.view();
//        test.foo(rose);
//        test.foo(cactus);
//
//        CloneDolly cloneDolly = new CloneDolly();
//        CloneDolly cloneDolly1 = foo(cloneDolly);
//
//        cloneDolly.setName("Dolly");
//        cloneDolly1.setName("Sheet");
//
//        System.out.println(cloneDolly.getName());
//        System.out.println(cloneDolly1.getName());

//        Body body = new Body() ;
////        T head = new Head();
//        SmallHead smallHead = new SmallHead();
//        Robot <SmallHead> robot = new Robot <> (body, smallHead) ;
//
//        robot.getHead().burn();

//        ErrorExample errorExample = new ErrorExample();
//        errorExample.foo();

//        PerimeterSquare perimeterSquare = new PerimeterSquare();
//        try {
//            perimeterSquare.getPerimeter("g");
//        } catch (PerimeterException e) {
//            e.printStackTrace();
//        }
//
//    }

//    public static CloneDolly foo(CloneDolly cloneDolly) {
//        CloneDolly dolly = null;
//        try {
//            dolly = (CloneDolly) cloneDolly.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//        return dolly;
//    }

        List <Person> list = new ArrayList<>() ;
        Person person1 = new Person("Bob") ;
        Person person2 = new Person("Joe") ;

        list.add(person1) ;
        list.add(person2) ;

        final Person person1FromCollection = list.get(0);
        final Person person2FromCollection = list.get(1);

        System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);

//        while (iterator.){
//            Person iterPerson = iterator.next() ;
//            System.out.println(iterPerson);
//        }
    }

}