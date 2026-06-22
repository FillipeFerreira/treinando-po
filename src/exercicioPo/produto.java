package exercicioPo;

public class produto {
    String nome;
    double preco;
    double desconto;
    double pocetagem; // Mantive o nome da sua variável!

    // 1º Método: Apenas faz a conta e retorna o valor
    double precoComDesconto() {
        return preco - (preco * (desconto / 100));
    }

    // 2º Método: Separado, serve apenas para imprimir os dados na tela
    public void impressao_() {
        System.out.println("Preço final: " + this.precoComDesconto());
    }

    // 3º Método: Outra opção de impressão que você estava montando
    public void main_impressao() {
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.desconto);
        System.out.println(this.precoComDesconto()); // Imprime o cálculo direto


    }


    }
