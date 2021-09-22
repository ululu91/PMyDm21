import java.util.ArrayList;
import java.util.*;

public class P1 {

        public static void main(String[] args)
        {

            String sNombre ="alb erto ali fer fer alf al7 alb alb dez dez san chez";

            //imprimir lista de palabras de un texto


            // imprimir la lista de palabras de tamaño impar de un texto ( con split)



        /*String arraySeccion [] = sNombre.split(" ");

        for(int i = 0; i < arraySeccion.length ;i++ )
        {
            if(arraySeccion[i].length()% 2 != 0)
            {
                System.out.println(arraySeccion[i]);
            }

        }*/
            // numero de palabras iguales

            /*String arraySeccion [] = sNombre.split(" ");
            List iguales = new ArrayList();

            int contador = 0;

            for(int i = 0; i < arraySeccion.length ;i++ )
            {
                for(int j = 0; j < arraySeccion.length ;j++ )
                {
                if(arraySeccion[i].equals(arraySeccion[j]) && !iguales.contains(arraySeccion[i]) && (i!=j) )
                {
                   iguales.add(arraySeccion[i]);
                }

            }*/



            // sustituir las vocales por un 2 de las palabras que empiecen por "al"

            String vocales [] = sNombre.split(" ");

            for(int i = 0; i < vocales.length  ;i++ )
            {
                if(vocales[i].substring(0).startsWith("al"))
            {
                String b = vocales[i].replace("a","2")
                                     .replace("e","2")
                                     .replace("i","2")
                                     .replace("o","2")
                                     .replace("u","2");

                System.out.println(b);


            }

            }
}}
