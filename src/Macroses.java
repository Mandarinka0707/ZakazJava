package Macros;
import java.util.ArrayList;
import java.util.List;

public class Macroses<T> {
    private String name;
    List<T> datas = new ArrayList<>();
    List<Actions> actions = new ArrayList<>();
    public Macroses(String name) {
        this.name = name;
    }
    public void addData(T data){
        if(data!=null){
            datas.add(data);
        }
    }
    public void addActions(Actions act){
        if(act!=null){
            actions.add(act);
        }
    }
    public List<Actions> getActions() {
        return new ArrayList<>(actions);
    }

    public List<T> getDatas() {
        return datas;
    }
    public String toString(){
       String c1 ="";
       String c2="";
       for(Actions x: actions){
           c1+=x.getName()+",";
       }
       for(T d: datas){
           c2+=d+" ,";
       }
       return name+"  "+c1 +"     "+ c2;
   }
}
