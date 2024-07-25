import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SomaNumeros {
    private List<Integer> listNumeros;

    public SomaNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumeros.add(numero);
    }

    public Integer calcularSoma() {
        if (!listNumeros.isEmpty()) {
            int soma = 0;
            for (Integer numero : listNumeros) {
                soma += numero;
            }
            return soma;
        } else {
            return null;
        }
    }

    public Integer encontrarMaiorNumero() {
        if (listNumeros.isEmpty()) {
            return null;
        } else {
            int maior = listNumeros.get(0);
            for (Integer numero : listNumeros) {
                if (numero > maior) {
                    maior = numero;
                }
            }
            return maior;
        }
    }

    public Integer encontrarMenorNumero() {
        if (listNumeros.isEmpty()) {
            return null;
        } else {
            int menor = listNumeros.get(0);
            for (Integer numero : listNumeros) {
                if (numero < menor) {
                    menor = numero;
                }
            }
            return menor;
        }

    }

    public List<Integer> exibirNumeros() {
        return new ArrayList<>(listNumeros);
    }


    @Override
    public String toString() {
        return "lista dos Numeros = " + listNumeros;
    }

    public static void main(String[] args) {
        SomaNumeros calculadora = new SomaNumeros();
        Random random = new Random();

        // Adicionando 10 números aleatórios à lista
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(101);  // Gera um número aleatório entre 0 e 100
            calculadora.adicionarNumero(numeroAleatorio);
        }
      

        // Calculando a soma
        System.out.println("Soma dos números: " + calculadora.calcularSoma());  // Saída: Soma dos números: 18

        // Encontrando maior e menor número
        System.out.println("Maior número: " + calculadora.encontrarMaiorNumero());  // Saída: Maior número: 10
        System.out.println("Menor número: " + calculadora.encontrarMenorNumero());  // Saída: Menor número: 3

        // Exibindo todos os números
        System.out.println("Lista de números: " + calculadora.exibirNumeros());  // Saída: Lista de números: [5, 10, 3]
    }



    
}
