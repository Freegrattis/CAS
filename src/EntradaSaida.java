import javax.swing.JOptionPane;

public class EntradaSaida {
    public static String loginUsuario(){
        return sysou("Informe seu nome");
    }

    public static int solicitarOpcaoMenu(int opcao){
       return Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas extras feitas: (Em números inteiros)"));
    }

    public static void mostrarMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg, "AVISO", 0);
    }
    public static void mostrarResultado(double salario, double resultado){
        JOptionPane.showMessageDialog(null, "O salário bruto de R$"+salario+", com seus devidos descontos será de: R$"+resultado, "RESULTADO", 1);
    }
}