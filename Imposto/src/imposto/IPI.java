package imposto;

import model.Item;
import model.Produto;

public class IPI implements Imposto {
    @Override
    public double calcular(Item item) {
        if (item instanceof Produto) {
            Produto produto = (Produto) item;
            if (produto.isIndustrial()) {
                double impostoCalculado = item.getValor() * 0.12;
                return impostoCalculado;
            } else {
                System.out.println("Este produto não é indutrializado, o imposto IPI não aplicável.");
            }
        } else {
            System.out.println("O item não é um produto, Imposto IPI não aplicável.");
        }
        return 0;
    }
}