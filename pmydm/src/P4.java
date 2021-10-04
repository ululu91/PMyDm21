import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
public class P4 {

    public static void main(String[] args) {
        // clave jugador y value equipo
        HashMap<String, String> hmJugadores = new HashMap<String, String>();

        hmJugadores.put("Moran","Barcelona");
        hmJugadores.put("Vera","Pozuelo");
        hmJugadores.put("Recio","Retamar");
        hmJugadores.put("Maset","Madrid");
        hmJugadores.put("Vinicious","Madrid");
        hmJugadores.put("Ramos","Psg");

       /* System.out.println(hmJugadores);
        System.out.println("El equipo de Recio es: "+hmJugadores.get("Recio"));
        System.out.println("El equipo de Recio es: "+hmJugadores.get("RECIO"));
        */


        // Escribir los jugadores del Madrid

    }
    private static ArrayList<String> getKeysFromValues(String sValue, HashMap<String, String> hMap) {
        ArrayList<String> resultado = new ArrayList<>();
        for (String i : hMap.keySet()) {
            if(hMap.get(i).equals(sValue)) {
                //System.out.println(i);
                resultado.add(i);
            }
        }
        //System.out.println(getKeysFromValues("Madrid", hmjugadores ));
        return resultado;
    }

}
