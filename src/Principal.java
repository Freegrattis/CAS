public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        String nome="";
        String senha="";
        BancoContas b = new BancoContas();

        opcao=EntradaSaida.solicitarOpcaoMenu(opcao);
        switch(opcao){
        case 1:
            Usuario c = new Usuario();
            nome=EntradaSaida.loginUsuarioNome();
            senha=EntradaSaida.loginUsuarioSenha();
            Validacao.validarEntradaUsuario(nome,senha);
            break;

        case 2:
            EntradaSaida.CadastrarUsuario();
            
            break;
       
        default:
            break;
       }
    }
}