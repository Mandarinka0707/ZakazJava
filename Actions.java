package Macros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Actions {
    private String name;
    private Macroses mac;
    public Actions(String name){
        this.name=name;
    }
    public Actions(String name, Macroses mac){
        this.name=name;
        this.mac=mac;
    }
    public String getName() {
        return name;
    }
    public Macroses getMac(){
        return mac;
    }
    public void execute(List<Object> data){
        for(Object m:data){
            System.out.println(name+"  execute on  "+ m);
        }
    }

}
