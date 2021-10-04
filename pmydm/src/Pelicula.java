public class Pelicula
{
    //atributos

    private String titulo;
    private String director;
    private String categoria;
    private int anio;
    private int duracion;

    public Pelicula(String titulo, String director, String categoria, int anio, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.categoria = categoria;
        this.anio = anio;
        this.duracion = duracion;

    }
    public Pelicula()
    {
        this.titulo = "nise";
        this.director = "nisunisu";
        this.categoria = "nisunisunisu";
        this.anio = 2000;
        this.duracion = 54;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //métodos

    /***
     * pelicula mas antigua
     * @param p1 Pelicula
     * @param p2 Pelicula
     * @return la pelicula mas antigua si son iguales null
     */
    public Pelicula peliculaMasAntigua(Pelicula p1,Pelicula p2)
    {
        if (p1.getAnio() < p2.getAnio())
        {
            return p1;
        }
        else if(p1.getAnio() == p2.getAnio())
        {
            return null;
        }
        return p2;
    }

    public Pelicula peliculaMasAntigua(Pelicula p1,Pelicula p2,Pelicula p3)
    {
        Pelicula pAux = peliculaMasAntigua(p1,p2);
        if(pAux!=null)
        {
            return peliculaMasAntigua(pAux,p3);
        }
        return peliculaMasAntigua(p1,p3);
    }


    public Pelicula peliculaMasAntigua(Pelicula p1,Pelicula p2,Pelicula p3,Pelicula p4)
    {

        Pelicula pAux = peliculaMasAntigua(p1,p2,p3);
        if(pAux!=null)
        {
            return peliculaMasAntigua(pAux,p4);
        }
        return peliculaMasAntigua(p1,p4);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", categoria='" + categoria + '\'' +
                ", anio=" + anio +
                ", duracion=" + duracion +
                '}';
    }
}
