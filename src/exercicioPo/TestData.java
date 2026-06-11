package exercicioPo;

public class TestData {
    public static void main(String[] args) {

        Data aniversarioFillipe = new Data();

        aniversarioFillipe.dia = 04;
        aniversarioFillipe.mes = 10;
        aniversarioFillipe.ano = 1992;


        System.out.printf("%d/%d/%d", aniversarioFillipe.dia, aniversarioFillipe.mes, aniversarioFillipe.ano);

        {

            System.out.println("");
            aniversarioFillipe.dataimpressao();

            Data anaflavia = new Data ();
            anaflavia.dia = 28;
            anaflavia.mes = 12;
            anaflavia.ano = 1989;
            System.out.println("");
            System.out.printf("%d/%d/%d",anaflavia.dia,anaflavia.mes, anaflavia.ano);

            System.out.println("");

            anaflavia.dataimpressao();




        }
    }
}