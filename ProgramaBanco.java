package modelo.banco;

public class ProgramaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Taxa de adm: "+Conta.TAXA_ADMINISTRACAO);
		
		
		Conta conta1 = new ContaCorrente("1245", "BB", "Vitor", "020", "29-12-2020");
		
		Conta conta2 = new ContaPoupanca("8909", "AB", "Felipe", "010", "29-12-2020");
		
		System.out.println("CONTAS CRIADAS SEM SALDO: ");
		System.out.println(conta1);
		System.out.println(conta2);
		
		conta1.depositar(550f);
		conta2.depositar(200f);
		

		System.out.println("CONTAS CRIADAS COM SALDO: ");
		System.out.println(conta1);
		System.out.println(conta2);
		
		conta1.transferencia(conta2, 230f);
		
		System.out.println("CONTAS APÓS TRANSFERÊNCIA: ");
		System.out.println(conta1);

		System.out.println(conta2);
		
		
		
		

		

	}		
		 
}