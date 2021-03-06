package modelo.banco;

public class ContaCorrente extends Conta {
	static  final float TAXA_MANUTENCAO =  0.025f;
	
	
	public ContaCorrente(String numeroConta, String agencia, String nome, String cpf,
			String dataAbertura) {
		super(numeroConta, agencia, nome, cpf, dataAbertura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void transferencia(Conta contaDestino, float valorTransferido) {
		// TODO Auto-generated method stub
	
		if(contaDestino instanceof ContaPoupanca) {
			this.sacar(valorTransferido+(valorTransferido*Conta.TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		
		}
		else if(contaDestino instanceof ContaCorrente) {
			this.sacar(valorTransferido+(valorTransferido*Conta.TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		} else {
			this.sacar(valorTransferido+(valorTransferido*Conta.TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
			
		}
		

	}

}
