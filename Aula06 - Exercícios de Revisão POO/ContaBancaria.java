// Neste arquivo tem-se a resolução parcial do exercícios "ContaBancaria_Enunciado.pdf"
// A resolução completa está no arquivo "ContaBancaria_Gabarito.pdf"
public class ContaBancaria{

    private String titular;
    private String numero;
    private double saldo;

    // construtor = define como eu quero construir objetos da classe
    public ContaBancaria(String titularInicial, String numeroInicial, double saldoInicial){
        titular = titularInicial;
        numero = numeroInicial;
        saldo = saldoInicial;
        // ContaBancaria conta1 ContaBancaria("Evandro", "430-63.0", 100);
    }
    
    // comportamentos alem dos getter/setters
    public void transferir(ContaBancaria destino, double valor){
        // se o valor é maior que zero e ao mesmo menor ou igual ao saldo
        if(valor >= 0 && valor <= saldo){
            saldo -= valor; // saldo = saldo - valor;
            destino.setSaldo(destino.getSaldo() + valor); // destino.saldo + valor

            // destino.saldo = 100, atual.tranferir(destino, 20)
            // destino.setSaldo(100 += 20); destino.saldo = 120
        }
    }
    
    //getter/setters
    // get saldo
    public double getSaldo(){
        return saldo;
    }
    // set saldo
    public void setSaldo(double novoSaldo){
        saldo = novoSaldo;
    }
}