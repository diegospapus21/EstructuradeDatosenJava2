package Control_de_Asistencia;

import java.util.HashSet;
import java.util.Set;

public class ControlAsistencia {
    public void ControlHashSet() {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("20230048");
        conjunto.add("20234440");
        conjunto.add("20230248");
        conjunto.add("20234450");
        conjunto.add("20230048");

        System.out.println("La lista del Control de Asistencia: " + conjunto);

        System.out.println("Este codigo ya esta registrado: " + conjunto.contains(20230048));


    }
}
