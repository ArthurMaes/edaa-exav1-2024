import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        ReadFifa leitor = new ReadFifa();
        List<CountriesFifa> paises = leitor.lerPaisesDoArquivo();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("[1] Ordenar por Ordem Alfabética");
            System.out.println("[2] Ordenar por audiência TV");
            System.out.println("[3] Encerrar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Ordenar.ordenarPorNome(paises);
                    exibirPaises(paises);
                    break;
                case 2:
                    Ordenar.ordenarPorAudienciaTV(paises);
                    exibirPaises(paises);
                    System.out.println("Após ordenação, o Brasil agora está em 2º lugar... assim como sugerido");
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }
        } while (opcao != 3);
        scanner.close();

    }
    private static void exibirPaises(List<CountriesFifa> paises) {
        System.out.println("=========== Lista de países ordenados ===========");
        for (CountriesFifa pais : paises) {
            System.out.println(pais);
        }
    }
}