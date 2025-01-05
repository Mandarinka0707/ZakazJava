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



        
        Macroses<Object> m1 = new Macroses<>("TO");
        Actions a1 = new Actions("Замена чернил");
        Actions a2 = new Actions("Прыжок", m1);
        Actions a3 = new Actions("лежать");
        m1.addData("Ручка");
        m1.addData(145);
        m1.addData("Карандаш");
//        m1.addActions("Замена  ручки");
//        m1.addActions("прыжрк");
        m1.addActions(a1);
        m1.addActions(a2);
        m1.addActions(a3);

        a1.execute(m1.getDatas());











    }
}
