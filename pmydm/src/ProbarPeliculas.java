import java.util.ArrayList;
import java.util.List;

public class ProbarPeliculas {

    public static void main(String[] args)
    {
       Pelicula pp1 = new Pelicula();
        pp1.setAnio(1991);
        pp1.setTitulo("1");
        Pelicula pp2 = new Pelicula();
        pp2.setTitulo("2");
        Pelicula pp3 = new Pelicula();
        pp3.setTitulo("3");
        pp3.setAnio(1992);

        Pelicula h = pp2.peliculaMasAntigua(pp1,pp2,pp3);
        //System.out.println(h.getTitulo());




        // imprimir que tengan mismo director y moisma categoria

        //hasmpap indexado por titulo de las 5 peliculas


        // array con 5 peliculas,
        List<Pelicula> arraylistPelicula = new ArrayList<>();

        arraylistPelicula.add(new Pelicula("T1","d1","c1",1800,90));
        arraylistPelicula.add(pp1);
        arraylistPelicula.add(pp2);
        arraylistPelicula.add(pp3);
        arraylistPelicula.add(new Pelicula());


        // imprimir la pelicula mas antigua
        Pelicula ooo = getPeliculaMasAntigua(arraylistPelicula);
        System.out.println("La mas antigua es "+ ooo);

    }

    private static Pelicula getPeliculaMasAntigua(List<Pelicula> arraylistPelicula)
    {
        Pelicula peliAux = new Pelicula();
        peliAux.setAnio(9000);

        for(Pelicula peliI:arraylistPelicula)
        {

            peliAux = (peliI.getAnio()< peliAux.getAnio())?peliI:peliAux;
        }
        return peliAux;

    }

    // imprimir las que tengan mismo director

    private static List<Pelicula> getmismoDirector(List<Pelicula> arraylistPelicula)
    {
        List<Pelicula> arraylistPelicula2 = new ArrayList<Pelicula>();

        for (int i = 0; i < arraylistPelicula2.size(); i++)
        {
            for (int j = 0; j < arraylistPelicula2.size() ; j++) {

            }
        }




    }





}
