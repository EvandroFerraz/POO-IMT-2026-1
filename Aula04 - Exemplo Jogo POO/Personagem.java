public class Personagem{
    // atributos
    String nome;
    int energia = 10, fome = 0, sono = 0;

    // métodos
    void cacar(){ // assinatura do método
        // corpo do método
        if(energia >= 2){
            System.out.println(nome + " esta cacando.");
            energia -= 2; // energia = energia - 2;
        }else{  // energia < 2
            System.out.println(nome + " esta sem energia para caçar.");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
        printAtributos();
    }

    void dormir(){
        if(sono >= 1){
            System.out.println(nome + " esta dormindo.");
            sono--; // sono = sono - 1;
            energia = energia + 1 <= 10? energia + 1 : 10; // operador ternário
        }else{ // sono < 1
            System.out.println(nome + "já esta descansado e não pode dormir.");
        }
        printAtributos();
    }

    void comer(){
        if(fome >= 1){
            System.out.println(nome + " esta comendo.");
            energia = Math.min(energia + 1, 10);
            fome--; // fome = fome  - 1;
        }else{ // fome < 1
            System.out.println(nome + " esta sem fome.");
        }
        printAtributos();
    }

    // imprime o valor atual dos atributos
    public void printAtributos(){
        System.out.println("Energia: " + energia + " Fome: " + fome + " Sono: " + sono);
    }

    // // soma dois numeros e retorna o resultado
    // double soma(double numero1, double numero2){
    //     return numero1 + numero2;
    // }
}