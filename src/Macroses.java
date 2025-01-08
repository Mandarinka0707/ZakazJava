// есть класс макрос(название, список данных произвольного типа, список действий)
// нужно чтобы список действий применялся над списком данных 
// добавить возможность добавлять макросы в список действий
// добавить возможность найти созданные макросы по имени 


package Macros;
import java.util.ArrayList;
import java.util.List;

public class Macroses<T> implements Action {
    private String name;
    List<T> datas = new ArrayList<>();
    List<Action> actions = new ArrayList<>();
    public Macroses(String name, List<T> datas, List<Action> actions) {
        this(name, datas);
        this.actions=actions;
    }
    public Macroses(String name, List<T> datas) {
        this(name);
        this.datas=datas;
    }
    public Macroses(String name){
        this.name=name;
    }
    public void addData(T data){
        if(data!=null){
            datas.add(data);
        }
    }
    
    public void findMacrosInAction(){
        int count=0;
        for(Action a:actions){
            if(a.toString().contains(name)){
                count++;
            }
        }
        System.out.println(count+", " + name );
    }
    public void addAction(Action act){
        this.actions.add(act);
    }
    public void getActions() {
        System.out.println(actions);
    }

    public List<T> getDatas() {
        return datas;
    }
    public String toString(){
       String c1 ="";
       String c2="";

       for(T d: datas){
           c2+=d+" ,";
       }
       return name+"  "+c1 +"     "+ c2;
   }

    @Override
    public void execute() {

    }
}
