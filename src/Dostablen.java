public class Dostablen implements Status {
    @Override
    public void status(Zakaz zakaz) {
        System.out.println(zakaz.getOpisanie()+" "+ "Доставлен");
    }
}
