import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zakaz z1 = new Zakaz("Телефон",4000);
        z1.addCities("Москва");
        z1.addCities("Cаратов");
        z1.addCities("Казань");

        z1.status();
        z1.status();
        z1.status();
        z1.status();
        z1.status();
        z1.status();







    }
}