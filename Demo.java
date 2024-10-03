import java.util.Arrays;
import java.util.List;


puplic class Demo{

    puplic static void maim (String[]args){
        Greeter greeter = new Greeter ();
        List<String> names = Arrays.asList("John","Jane","Jack");
        names.forEach((b) -> greeter::greet(n));
       System.out.println ("Hello");
    }
}