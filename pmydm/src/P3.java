import java.util.ArrayList;
import java.util.List;

public class P3 {

    public static void main(String[] args)
    { //generar cartones de tal que no este ninguno repetido ( que no contengan los mismos 5 marcas )



        List<String> marca = new ArrayList<String>(); // arrayList dinamico

        marca.add("audi");
        marca.add("bmw");
        marca.add("porche");
        marca.add("seat");
        marca.add("land rover");
        marca.add("ferrari");
        marca.add("peugeot");
        marca.add("mini");
        marca.add("fiat");
        marca.add("mercedes");


        List<String> bingo2 = GenerarCarton (marca);

        imprimirCarton(bingo2);

        int nNumerosTotalCartones = 40;
        for (int i = 0; i <nNumerosTotalCartones ; i++) {
            List<String> cartonI = GenerarCarton(marca);
            imprimirCarton(cartonI);

        }
    }

    private static void imprimirCarton(List<String> bingo2) {
        String sComma ="";
        for (String bingo: bingo2)
        {
            System.out.print(sComma+bingo);
            sComma=",";
        }
        System.out.println();
    }

    public static List<String> GenerarCarton(List<String> marcaCoche)
    {
        List<String> carton = new ArrayList<String>();

        int ale = 0;


            for(int i=0; i < 5;)
            {
                ale = (int) (Math.random() * 9);
                if (!carton.contains(marcaCoche.get(ale)))
                {
                    carton.add(marcaCoche.get(ale));
                    i++;
                }
            }


        return carton;
    }
}
