import java.util.HashMap;
import java.util.Map;

public class Pizza {

    static HashMap Intrediente;
    static int intredientes = 0;
    float preco;
    public Pizza (String ingrediente) {
        adicionaIngrediente(ingrediente);
    }
    void getPreço(int totalIngredientes){
        if(totalIngredientes <= 2){
            preco = 15;
        }else if( totalIngredientes > 2 && totalIngredientes <-5){
            preco = 20;
        }else if( totalIngredientes > 5){
            preco = 23;
        }
    }
   public void adicionaIngrediente(String nome_ingrediente){
       contabilizaIngrediente();
       Map<String, String> ingrediente = new HashMap<String, Int>();
   }
    void contabilizaIngrediente(){
        intredientes += 1;
    }
}
