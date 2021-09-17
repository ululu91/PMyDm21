public class P1 {
    public class main3 {
        public static void main(String[] args)
        {

            String sNombre ="alb erto fer alf al7 dez dez san chez";

            //imprimir lista de palabras de un texto


            // imprimir la lista de palabras de tamaño impar de un texto ( con split)



        String arraySeccion [] = sNombre.split(" ");

        for(int i = 0; i < arraySeccion.length ;i++ )
        {
            if(arraySeccion[i].length()% 2 != 0)
            {
                System.out.println(arraySeccion[i]);
            }

        }
            // numero de palabras iguales
            // sustituir las vocales por un 2 de las palabras que empiecen por "el"
        }
    }

}
