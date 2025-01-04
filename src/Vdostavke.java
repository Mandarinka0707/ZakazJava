public class Vdostavke implements Status {
    @Override
    public void status(Zakaz zakaz) {
        for(int i=0; i<zakaz.getCities().size(); i++){
//            if(i<zakaz.getCities().size()){
                System.out.println(zakaz.getOpisanie()+" "+ "В доставке в "+zakaz.getCities().get(i));
//            }
//            else{
//                zakaz.setStatus(new Dostablen());
//            }

        }
        zakaz.setStatus(new Dostablen());

    }

}
