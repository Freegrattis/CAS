import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static int escolherOpcaoMenuTelaLogin(){
        System.out.println("Escolha uma opção: \n[1] Entrar como usuario\n[2] Cadastrar novo usuario \n[3] Entrar como administrador\n[4] Sair");
        Scanner opcaoScanner = new Scanner(System.in);
        int opcao = opcaoScanner.nextInt();
        return opcao;
    } 
    public static String loginUsuario(String login){   
        Scanner leitorLogin = new Scanner(System.in); //Cria um objeto scanner
        System.out.println("Digite " + login + " de usuário");
        String usuario = leitorLogin.nextLine(); // lê o input do usuário   
        return usuario; 
    }
    public static String CadastrarUsuario(String cadastro){   
        Scanner leitorCadastro = new Scanner(System.in); //Cria um objeto scanner
        System.out.println("Digite " + cadastro + " de usuário");
        String usuario = leitorCadastro.nextLine(); // lê o input do usuário   
        return usuario;  
    }
    public static String loginAdmin(String msg){   
        return "";
    }
    public static int escolherOpcoesDescontos(){
        System.out.println("Selecione os descontos: \n[0] CLT\n[1]");
        Scanner escolha = new Scanner(System.in);
        return escolha.nextInt();
    }
	public static void mostrarAviso() {
        JOptionPane.showMessageDialog(null, "Usuário não existe!", "AVISO", 0);
	}
}
