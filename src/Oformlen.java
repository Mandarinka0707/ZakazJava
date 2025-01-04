public class Oformlen implements Status{
    @Override
    public void status(Zakaz zakaz) {
        System.out.println(zakaz.getOpisanie()+"  "+ "Оформлен");
        zakaz.setStatus(new Oplachen());
    }
}
