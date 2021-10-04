
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
        System.out.println(h.getTitulo());

        // array con 5 peliculas,
        // imprimir la pelicula mas antigua
        // imprimir las que tengan el mismo director
        // imprimir que tengan mismo director y moisma categoria

        //hasmpap indexado por titulo de las 5 peliculas

    }
}
