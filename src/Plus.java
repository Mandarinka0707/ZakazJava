package Macros;

public class Plus<T> implements Action{
    Macroses<T> macroses;
    public Plus(Macroses<T> macroses){
        this.macroses=macroses;
    }
    public void plus(){
        String res="";
        for(int i=0; i<macroses.datas.size(); i++){
            if(macroses.datas.get(i) instanceof Integer){
                res= (String) macroses.datas.get(i)+5;
                //System.out.println(res);

            } else if (macroses.datas.get(i) instanceof String) {
                res=(String) macroses.datas.get(i)+"cтрока плюс";
                System.out.println(res);
            }
            else{
                res=(String)macroses.datas.get(i);
                //System.out.println(res);
            }
        }
       // System.out.println(res);
    }
    @Override
    public void execute() {
        for(T x: macroses.datas){
            plus();
        }
    }

    @Override
    public String toString() {
        return "Plus" + macroses;
    }
}
