import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simulador de AFD ===");

        System.out.print("Estados (separados por vírgula): ");
        Set<String> estados = new HashSet<>(Arrays.asList(sc.nextLine().split(",")));

        System.out.print("Alfabeto (máximo 2 símbolos): ");
        Set<String> alfabeto = new HashSet<>(Arrays.asList(sc.nextLine().split(",")));

        System.out.print("Estado inicial: ");
        String estadoInicial = sc.nextLine();

        System.out.print("Estados de aceitação (separados por vírgula): ");
        Set<String> estadosFinais = new HashSet<>(Arrays.asList(sc.nextLine().split(",")));

        Map<String, String> transicoes = new HashMap<>();
        for (String estado : estados) {
            for (String simbolo : alfabeto) {
                System.out.print("δ(" + estado + ", " + simbolo + ") = ");
                String destino = sc.nextLine();
                transicoes.put(estado + "," + simbolo, destino);
            }
        }

        AFD afd = new AFD(estados, alfabeto, transicoes, estadoInicial, estadosFinais);

        while (true) {
            System.out.print("\nDigite uma cadeia para testar (ou 'sair'): ");
            String cadeia = sc.nextLine();
            if (cadeia.equalsIgnoreCase("sair")) break;

            boolean aceita = afd.reconhecer(cadeia);
            System.out.println(aceita ? "✅ Aceita!" : "❌ Rejeitada!");
        }

        sc.close();
    }
}
