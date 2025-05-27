package Lista_de_usuarios_unicos;

import java.util.HashSet;
import java.util.Set;

public class ListaDatos {
    public void HashSet() {
        Set<String> conjunto = new HashSet<>();

        //Añadiendo elementos
        conjunto.add("Diegospapus21");
        conjunto.add("Ivan123");
        conjunto.add("Andres28");
        conjunto.add("Marmol21");
        conjunto.add("Diegospapus21"); // El duplicado

        System.out.println("Contenido de la lista " + conjunto);

        System.out.println("¿Contiene el usuario 'Ivan123'?" + conjunto.contains("Ivan123"));



    }
}
