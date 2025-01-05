package Macros;

public class Minus<T> implements Action{
    Macroses<T> macroses;
    public Minus(Macroses<T> macroses){
        this.macroses=macroses;
    }
    public void minus(){
        String res="";
        for(int i=0; i<macroses.datas.size(); i++){
            if(macroses.datas.get(i) instanceof Integer){
                res= (String) macroses.datas.get(i)+"-5";
               // System.out.println(res);

            } else if (macroses.datas.get(i) instanceof String) {
                res=(String) macroses.datas.get(i)+"cтрока минус";
                System.out.println(res);
            }
            else{
                res=(String)macroses.datas.get(i);

            }
        }
       // System.out.println(res);
    }
    @Override
    public void execute() {
        for(T x:macroses.datas){
            minus();
        }
    }
    public String toString(){
        return " Minus" + macroses;
    }
}
