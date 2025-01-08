import java.util.ArrayList;
import java.util.List;
import Zakaz.*;
public class Main {
    public static void main(String[] args) {
        // Zakaz z1 = new Zakaz("Телефон","Москва",4000);
        // z1.setStatus();
        // System.out.println(z1.getStatus());
        // z1.setStatus();
        // System.out.println(z1.getStatus()+z1.getLocation());
        // z1.setStatus();
        // System.out.println(z1.getStatus()+z1.getLocation());
        // z1.setLocation("Саратов");
        // z1.setStatus();
        // System.out.println(z1.getStatus()+z1.getLocation());
        // System.out.println(z1);
        // z1.setLocation(null);
        // z1.setStatus();
        // System.out.println(" ---------------");
        // z1.getStatus();



          Macroses<String> m1= new Macroses<>("yoo", List.of("UII", "OOO"));
        Macroses<String> mm1 = new Macroses<>("Darina");
        mm1.addData("uyiin  ");
        Minus<String> min1 = new Minus<>(mm1);
        Plus<String> p1 = new Plus<>(mm1);
        m1.addAction(min1);
        m1.addAction(p1);
       












    }
}
