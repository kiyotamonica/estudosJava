package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Exemplificando com informações de um funcionario ficticio
		
		/* Tipos numéricos inteiros*/
		byte anosDeEmpresa = 23; //vai até 127
		short numeroDeVoos = 542; //vai até 32766
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //para declarar valores long, é necessáario colocar L ou l ao final do numero. o Underline pode ser usado para deixar numeros longos mais esteticamente agradaveis
		
		/*Tipos numericos reais*/
		float salario = 11_445.44F; //Em java, os tipos flutuantes naturalmente sao double, entao para salvar como float, tambem é necessário inserir a letra F ao final
		double vendasAcumuladas = 2_991_767_103.01;
		
		/*Tipo Boolean*/
		boolean estaDeFerias = false; 
		
		/*Tipo caractere*/
		char status = 'E';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Dados
		System.out.println(id + ": Salario -> " + salario);
		System.out.println("Status férias: " + estaDeFerias);
		System.out.println("Status do funcionário: " + status);
		
	}
}
