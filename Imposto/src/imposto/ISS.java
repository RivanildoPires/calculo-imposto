package imposto;

import model.Item;
import model.Servico;

public class ISS implements Imposto{
    @Override
    public double calcular(Item item) {
        if(item instanceof Servico){
            double impostCalculado = item.getValor() * 0.22;
            return impostCalculado;
        }
        System.out.println("Esse tipo de imposto deve ser para serviço");
        return 0;
    }
}
