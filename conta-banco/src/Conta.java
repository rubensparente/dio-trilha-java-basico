public class Conta {
    private String nomeCliente;
    private int numeroConta;
    private String agencia;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimir(){
       
        System.out.println("Olá " +getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agênceia é "+getAgencia()+", conta " +getNumeroConta()+ " e seu saldo " +getSaldo()+ " já está disponível para saque." );
    }
    
}
