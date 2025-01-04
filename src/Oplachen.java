public class Oplachen implements Status {
    @Override
    public void status(Zakaz zakaz) {
        if(zakaz.getCost()>=0){
            System.out.println(zakaz.getOpisanie()+" "+"Цена "+zakaz.getCost()+" "+"Оплачен");
        }
        zakaz.setStatus(new Vdostavke());
    }
}
