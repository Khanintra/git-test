import java.util.Arrays;
import java.util.List;


puplic class Demo{

    puplic static void maim (String[]args){
        Greeter greeter = new Greeter ();
        List<String> names = Arrays.asList("John","Jane","Jack");
        names.forEach(greeter::greet);
    }
}