package br.com.banco;
public class Conta{

    private int numero;
    private Cliente dono = new Cliente();
   	public Cliente getDono() {
		return dono;
	}
	public void setDono(Cliente dono) {
		this.dono = dono;
	}

	private double saldo;
    private double limite;    
	
	public int getNumero(){
        return this.numero;
    } 
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getSaldo(){
        return this.saldo;
    } 
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }    
    public double getLimite(){
        return this.limite;
    } 
    public void setLimite(double limite){
        this.limite = limite;
    }

    public void sacar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com Sucesso! ");
            System.out.println("Novo Saldo: "+ this.saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com Sucesso! ");
        System.out.println("Novo Saldo: "+ this.saldo);
    }

    public double tranferir(int conta, Double valor){
        if(saldo >= valor){
            this.saldo -= valor;
            System.out.println("Tranferencia realizado com Sucesso! ");
        }else{
            System.out.println("Saldo insuficiente");
        }

        return valor;
    }
}