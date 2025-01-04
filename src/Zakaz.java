import java.util.ArrayList;
import java.util.List;

public class Zakaz  {
    private String opisanie;
    private Status status = new Oformlen();
    private int cost;
    private List<String> cities = new ArrayList<>();
     public Zakaz(String opisanie, int cost){
         this.cost=cost;
         this.opisanie=opisanie;
     }
     public void addCities(String city){
         if(city!=null){
             cities.add(city);
         }
     }

    public List<String> getCities() {
        return cities;
    }

    public void setStatus(Status state){
          this.status=state;
     }
     public void status(){
          status.status(this);
     }

    public int getCost() {
        return cost;
    }
    public Status getStatus() {
        return status;
    }

    public String getOpisanie() {
        return opisanie;
    }
    public String toString(){
         return "Описание= "+opisanie+"Статус= "+status+"Цена  "+ cost;
    }

}
