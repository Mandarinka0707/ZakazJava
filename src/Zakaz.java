import java.util.ArrayList;
import java.util.List;

public class Zakaz  {
    private String opisanie;
    private StatusZakaza status;
    private int cost;
    private String location;
    public Zakaz(String opisanie,String location, int cost){
         this.cost=cost;
         this.opisanie=opisanie;
         this.location=location;
    }
    public void setStatus(){
        if((cost>0) && (status==StatusZakaza.REGISTERED)){
            status=StatusZakaza.PAID;
            System.out.println(status.getTitle());
        }
        else if(status==StatusZakaza.PAID ){
            status=StatusZakaza.TRANSIT;
            System.out.println(status.getTitle() +" "+getLocation());
        }
        else if(status==StatusZakaza.TRANSIT && location!=null){
            status=StatusZakaza.TRANSIT;
            System.out.println(status.getTitle() +" "+getLocation());
        }
        else if(status==StatusZakaza.TRANSIT && location==null){
            status=StatusZakaza.DELVERED;
            System.out.println(status.getTitle());
        }
        else if(status!=StatusZakaza.TRANSIT && status!=StatusZakaza.PAID && status!=StatusZakaza.DELVERED ){
            status=StatusZakaza.REGISTERED;
            System.out.println(status.getTitle());
        }
        else{
            System.out.println("end");
        }

    }
    public String getLocation() {
        if(status==StatusZakaza.TRANSIT && location!=null){
            return this.location;
        }
        else{
            return "Заказ не в доставке";
        }
    }

    public void setLocation(String location) {
        if(status==StatusZakaza.TRANSIT) {
            this.location = location;
        }
    }

    public int getCost() {
        return cost;
    }
    public String getStatus() {
        return status.getTitle();
    }
    public String getOpisanie() {
        return opisanie;
    }
    public String toString(){
         return "Описание= "+opisanie+"Статус= "+status+"Цена  "+ cost;
    }

}
