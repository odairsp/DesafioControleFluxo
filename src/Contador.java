import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        
		terminal.close();
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro "+ exception.getMessage()); 
		}
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }else{
			int contagem = parametroDois - parametroUm;
		
			for (int index = 0; index < contagem; index++) {
				System.out.println("Imprimindo o número "+(index+1));
				
			}
		}
        
		
	}

  
}