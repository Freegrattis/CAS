public class Main {
    public static void main(String[] args) {
        
        int opcaoTelaLogin=TelaDeLogin.mostrarTelaLogin();
        
        if (opcaoTelaLogin == 1) {
            // entrar como usuario->tela inicial
        } else if (opcaoTelaLogin == 2) {
            // cadastro de usuario-> retornar menu
        } else if (opcaoTelaLogin == 3) {
            // entrada como admin->tela de admin
        } else {
            // sair
        }
    }
}