# 📘 Manual de Uso – Simulador de AFD em Java

## 🧠 Objetivo

Este simulador permite ao usuário definir e testar qualquer Autômato Finito Determinístico (AFD), verificando se cadeias de entrada são reconhecidas ou rejeitadas pelo autômato.

---

## 🛠️ Requisitos do Sistema

- Java SE 8 ou superior
- Editor de código (Eclipse, IntelliJ, VS Code ou terminal)
- Console para entrada de dados (sem interface gráfica)

---

## 📦 Estrutura do Programa

O simulador é composto por duas classes:

| Classe     | Função                                                                 |
|------------|------------------------------------------------------------------------|
| `AFD.java` | Representa o autômato e realiza a validação e reconhecimento de cadeias |
| `Main.java`| Interface de entrada via console para definição do AFD e teste de cadeias |

---

## 📥 Entrada do Usuário

O programa solicita os seguintes componentes do AFD:

1. **Estados**: Lista separada por vírgulas (ex: `q0,q1,q2`)
2. **Alfabeto**: Máximo de 2 símbolos (ex: `0,1`)
3. **Estado inicial**: Um dos estados definidos
4. **Estados de aceitação**: Lista separada por vírgulas
5. **Função de transição**: Para cada par (estado, símbolo), o estado de destino

---

## 📤 Saída do Programa

Para cada cadeia testada, o programa informa:

- ✅ **Aceita**: Se a cadeia termina em um estado de aceitação
- ❌ **Rejeitada**: Se termina em estado não final ou contém símbolos inválidos

---

## 🧪 Exemplo de Execução

### 🔧 Definição do AFD

```text
Estados (separados por vírgula): q0,q1
Alfabeto (máximo 2 símbolos): 0,1
Estado inicial: q0
Estados de aceitação (separados por vírgula): q1

δ(q0, 0) = q0
δ(q0, 1) = q1
δ(q1, 0) = q1
δ(q1, 1) = q0'''

# Teste de Cadeias
Digite uma cadeia para testar (ou 'sair'): 101
✅ Aceita!

Digite uma cadeia para testar (ou 'sair'): 110
❌ Rejeitada!

Digite uma cadeia para testar (ou 'sair'): sair


