package exercicioPo;

import java.util.Scanner;

public class produtoTest {

    public static void main(String[] args) {

        produto caixa = new produto();

        caixa.nome = "caixa";
        caixa.preco = 2312f;
        caixa.desconto = 0.21;

        System.out.println(caixa.nome);
        System.out.println(caixa.preco);
        System.out.println(caixa.desconto);

        produto caixa0 = new produto();

        caixa0.nome = "caixa0";
        caixa0.preco = 222f;
        caixa0.desconto = 0.21;
        System.out.println("------------------------------");
        System.out.println(caixa0.nome);
        System.out.println(caixa0.preco);
        System.out.println(caixa0.desconto);
        System.out.println("------------------------");
        caixa0.impressora();
        System.out.println("------------------------");
        caixa.impressora();
    }
}
