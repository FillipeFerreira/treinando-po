package exercicioPo;

import java.util.Scanner;

public class produtoTest {

    public static void main(String[] args) {

        produto caixa = new produto();

        caixa.nome = "caixa";
        caixa.preco = 100;
        caixa.desconto = 10;

        System.out.println(caixa.nome);
        System.out.println(caixa.preco);
        System.out.println(caixa.desconto);

        caixa.precoComDesconto();
        caixa.impressao_();

    }
}
