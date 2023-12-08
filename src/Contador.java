import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		    Scanner terminal = new Scanner(System.in);

            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            
            try {

                System.out.println();
            	contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());
            }
        
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }
        else{
		int contagem = parametroDois - parametroUm;
        System.out.println("Imprimindo todas as ocorrencias:");
        for(int i=1; i<=contagem; i++){
            System.out.println("Ocorrenia " + i + " numero de ocorrencia: " + (i + parametroUm));
        }
        System.out.println();
        System.err.println("Total de ocorrencias: " + contagem);
        }

	}
}