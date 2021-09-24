import java.util.ArrayList;
import java.util.List;

public class P2 {

    public static void main(String[] args)
    {
        //crear un arrayList e intrducir los numeros impares entre el 1 y 100

       /* List<Integer> alNumerosImpares = new ArrayList<Integer>();// declaramos un arrayList

        alNumerosImpares.add(0); // añadimos a la primera posicion el numero 0

        for (int i = 1; i < 101 ; i= i+2)
        {
            alNumerosImpares.add(i);
        }

        //que solo imprima las comas necesarias

        int cont = 1;

        for(Integer numeroI :alNumerosImpares)
        {
            if(cont==1)
            {
                System.out.println(numeroI);
            }
            else
            {
                System.out.println(","+numeroI);
            }
            cont++;*/

            //Solucion maestro don alberto
            /*
            String sComma ="";
            for (Integer nuneroI;alNumerosImpares)
            {
                System.out.print(sComma+mumeroI);
                sComma=",";
            }









        }*/
        //EJERCICIO CARTON DE BINGO

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

        List<String> carton = new ArrayList<String>();

        int ale = 0;

        for(int i=0; i < 5;)
        {
            ale = (int) (Math.random() * 9);
            if (!carton.contains(marca.get(ale)))
            {
                carton.add(marca.get(ale));
                i++;
            }
        }
        String sComma ="";
        for (String bingo:carton)
        {
            System.out.print(sComma+bingo);
            sComma=",";
        }



        }










}
