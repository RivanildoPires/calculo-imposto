import factory.ImpostoFactory;
import factory.TipoImposto;
import imposto.Imposto;
import model.Item;
import model.Produto;
import model.Servico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ImpostoFactory impostoFactory = new ImpostoFactory();

        Imposto ICMS = impostoFactory.getImposto(TipoImposto.TIPOICMS);
        Imposto IPI = impostoFactory.getImposto(TipoImposto.TIPOIPI);
        Imposto ISS = impostoFactory.getImposto(TipoImposto.TIPOISS);
        Imposto PIS = impostoFactory.getImposto(TipoImposto.TIPOPIS);


        ArrayList<Item> lista = new ArrayList<>();

        Produto televisao = new Produto();
        televisao.setCodigo(12345678);
        televisao.setDescricao("Televisão LED 55 polegadas");
        televisao.setValor(3000);
        televisao.setIndustrial(true);
        televisao.setImpostoCalculado(ICMS.calcular(televisao));
        televisao.setTotal();
        lista.add(televisao);

        Produto geladeira = new Produto();
        geladeira.setCodigo(87654321);
        geladeira.setDescricao("Geladeira Led RGB Gamer");
        geladeira.setValor(2500);
        geladeira.setIndustrial(true);
        geladeira.setImpostoCalculado(IPI.calcular(geladeira));
        geladeira.setTotal();
        lista.add(geladeira);

        Servico manutencao = new Servico();
        manutencao.setCodigo(56473829);
        manutencao.setDescricao("Serviço de manutenção");
        manutencao.setValor(150);
        manutencao.setImpostoCalculado(ISS.calcular(manutencao));
        manutencao.setTotal();
        lista.add(manutencao);

        Produto notebook = new Produto();
        notebook.setCodigo(23456789);
        notebook.setDescricao("Notebook Asus");
        notebook.setValor(8000);
        notebook.setIndustrial(true);
        notebook.setImpostoCalculado(PIS.calcular(notebook));
        notebook.setTotal();
        lista.add(notebook);


        double totalProduto = 0;
        double totalServico = 0;
        double total = 0;

        for (Item item : lista) {
            System.out.println(item);
            total += item.getTotal();

            if (item instanceof Produto) {
                totalProduto += item.getImpostoCalculado();
            } else if (item instanceof Servico) {
                totalServico += item.getImpostoCalculado();
            }
        }

        System.out.printf("Valor total dos itens: %.2f\n", total);
        System.out.printf("Valor total dos impostos dos produtos: %.2f\n", totalProduto);
        System.out.printf("Valor total dos impostos dos serviços: %.2f\n", totalServico);
    }
}