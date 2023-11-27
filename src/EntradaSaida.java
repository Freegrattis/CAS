import javax.swing.JOptionPane;
import java.util.Scanner;

public class EntradaSaida {
    public static int solicitarOpcaoMenu(int numero){
        Scanner opcaoEscolhida = new Scanner(System.in);
        System.out.println("Selecione uma opção:\n1 - Login de Usuário\n2 - Cadastro de Usuário\n3 - Login Administrador\n4 - Sair");
        return opcaoEscolhida.nextInt();
    }

    public static String loginUsuarioNome(){
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        return entradaUsuario.nextLine();
    }
    public static String loginUsuarioSenha(){
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Informe sua senha: ");
        return entradaUsuario.nextLine();
    }
    
    	public static void CadastrarUsuario() {
            Scanner nomeUsuario = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            nomeUsuario.nextLine();
            Scanner senhaUsuario = new Scanner(System.in);
            System.out.println("Crie uma senha: ");
            senhaUsuario.nextLine();
            //armazenar informações no array BancoContas
	}

    public static double solicitarSalario(){
        Scanner salarioBruto = new Scanner(System.in);
        System.out.println("Digite o seu salário bruto: ");
        return salarioBruto.nextDouble();
    }
    public static void mostrarMensagem(String msg){
        System.out.println(msg);
    }


}