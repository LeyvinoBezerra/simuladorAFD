import java.util.*;

public class AFD {
    private Set<String> estados;
    private Set<String> alfabeto;
    private Map<String, String> transicoes;
    private String estadoInicial;
    private Set<String> estadosFinais;

    public AFD(Set<String> estados, Set<String> alfabeto, Map<String, String> transicoes,
               String estadoInicial, Set<String> estadosFinais) {
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.transicoes = transicoes;
        this.estadoInicial = estadoInicial;
        this.estadosFinais = estadosFinais;
        validarAFD();
    }

    private void validarAFD() {
        for (String estado : estados) {
            for (String simbolo : alfabeto) {
                String chave = estado + "," + simbolo;
                if (!transicoes.containsKey(chave)) {
                    throw new IllegalArgumentException("Transição ausente para: " + chave);
                }
            }
        }
    }

    public boolean reconhecer(String cadeia) {
        String estadoAtual = estadoInicial;
        for (char simbolo : cadeia.toCharArray()) {
            String s = String.valueOf(simbolo);
            if (!alfabeto.contains(s)) {
                System.out.println("❌ Símbolo inválido: " + s);
                return false;
            }
            String chave = estadoAtual + "," + s;
            estadoAtual = transicoes.get(chave);
        }
        return estadosFinais.contains(estadoAtual);
    }
}
