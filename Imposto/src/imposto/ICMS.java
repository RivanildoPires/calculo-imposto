package imposto;

import model.Item;
import model.Produto;

public class ICMS implements Imposto{

    @Override
    public double calcular(Item item) {
        if(item instanceof Produto){
            double impostCalculado = item.getValor() * 0.18;
            return impostCalculado;
        }
        System.out.println("Esse tipo de imposto deve ser para Produto");
        return 0;
    }
}

