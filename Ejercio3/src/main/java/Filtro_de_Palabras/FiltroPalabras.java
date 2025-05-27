package Filtro_de_Palabras;

import java.util.HashSet;
import java.util.Set;

public class FiltroPalabras {
    public void FiltrandoHashSet() {
        Set<String> PalabrasMinusculas = new HashSet<>();
            Set<String> PMayusculas = new HashSet<>();

            PalabrasMinusculas.add("Hola");
            PalabrasMinusculas.add("hola");
            PalabrasMinusculas.add("Mundo");
            PalabrasMinusculas.add("mundo");
            PalabrasMinusculas.add("Java");

            for (String PalabrasMayusculas : PalabrasMinusculas ){
                PMayusculas.add(PalabrasMayusculas.toUpperCase());
            }

        System.out.println(PalabrasMinusculas);
        System.out.println(PMayusculas);
    }
}
