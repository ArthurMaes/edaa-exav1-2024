import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenar {
    public static void ordenarPorNome(List<CountriesFifa> paises) {
        Collections.sort(paises, Comparator.comparing(CountriesFifa::getNome));
    }

    public static void ordenarPorAudienciaTV(List<CountriesFifa> paises) {
        Collections.sort(paises, Comparator.comparing(CountriesFifa::getAudienciaTV));
    }
}
