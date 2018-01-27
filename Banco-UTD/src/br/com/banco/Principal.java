package br.com.banco;
public class Principal{
    public static void main(String[] args) {

        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.setNumero(1239);
        minhaConta.getDono().setNome("Paulo");
        minhaConta.getDono().setSobreNome("Victor");
        minhaConta.getDono().setCpf("056.604.004-25");
        minhaConta.setSaldo(1000);

        Conta segundaConta;
        segundaConta = new Conta();
        segundaConta.setNumero(9876);
        segundaConta.getDono().setNome("Maria");
        segundaConta.getDono().setSobreNome("Chiquinha");
        segundaConta.getDono().setCpf("035.059.789-11");
        segundaConta.setSaldo(200);
        
        minhaConta.sacar(100.0);
        
        System.out.println("----------------------------------------------------");
        minhaConta.depositar(1100.0);
        

        System.out.println("Conta: "+ minhaConta.getNumero() +" Nome "+ minhaConta.getDono().getNome());
        
        for (int i = 0; i < args.length; i++) {
			
		}
        


/*
        System.out.println("----------------------------------------------------");
        System.out.println("Conta: "+ minhaConta.numero +" Nome: "+ minhaConta.dono.nome +" "+ minhaConta.dono.sobreNome +" CPF "+minhaConta.dono.cpf +" Saldo: "+ minhaConta.saldo);
        System.out.println("Conta: "+ segundaConta.numero +" Nome: "+ segundaConta.dono.nome +" "+ segundaConta.dono.sobreNome +" CPF "+segundaConta.dono.cpf +" Saldo: "+ segundaConta.saldo);
        
        System.out.println("----------------------------------------------------");

        segundaConta.saldo += minhaConta.tranferir(9876, 800.0);

        System.out.println("----------------------------------------------------");
        System.out.println("Conta: "+ minhaConta.numero +" Nome: "+ minhaConta.dono.nome +" "+ minhaConta.dono.sobreNome +" CPF "+minhaConta.dono.cpf +" Saldo: "+ minhaConta.saldo);
        System.out.println("Conta: "+ segundaConta.numero +" Nome: "+ segundaConta.dono.nome +" "+ segundaConta.dono.sobreNome +" CPF "+segundaConta.dono.cpf +" Saldo: "+ segundaConta.saldo);
        System.out.println("Conta: "+ minhaConta.numero +" Nome: "+ minhaConta.dono.nome +" "+ minhaConta.dono.sobreNome +" CPF "+minhaConta.dono.cpf +" Saldo: "+ minhaConta.saldo);
        System.out.println("Conta: "+ segundaConta.numero +" Nome: "+ segundaConta.dono.nome +" "+ segundaConta.dono.sobreNome +" CPF "+segundaConta.dono.cpf +" Saldo: "+ segundaConta.saldo);
        System.out.println("----------------------------------------------------");
    }
*/

}
} 