public class Jogo {
    // método main = é o ponto partida do projeto
    public static void main(String[] args) throws InterruptedException { // assinatura do método main
        Personagem cacador = new Personagem(); // energia = 10, sono, fome = 0 e nome = ""

        cacador.nome = "Joao";

        // while só para testar os métodos do jogo
        while (true) {
            cacador.cacar(); // Joao esta cacando
            cacador.dormir(); // Joao esta dormindo
            cacador.comer(); // Joao esta comendo
            cacador.cacar();
            cacador.cacar();
            cacador.cacar();

            System.out.println("===========");
            Thread.sleep(4000);
        }
    }
}
