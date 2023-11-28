public class TelaDeLogin {
    public static int mostrarTelaLogin() {
        int opcao = 0;
        String nome = "";
        String senha = "";
        boolean validacao = false;
        Users u = new Users();
        do {
            opcao = EntradaSaida.escolherOpcaoMenuTelaLogin();
            switch (opcao) {
                case 1:
                    nome = EntradaSaida.loginUsuario("o nome");
                    senha = EntradaSaida.loginUsuario("a senha");
                    //validacao = Validacao.verificaUsuario(nome,senha);
                    break;
                case 2:
                    User addUser= new User();
                    addUser.nome=EntradaSaida.CadastrarUsuario("o nome");
                    addUser.senha=EntradaSaida.CadastrarUsuario("a senha");
                    u.adicionarUser(addUser);
                    break;
                case 3:
                    nome = EntradaSaida.loginAdmin("o nome");
                    senha = EntradaSaida.loginAdmin("a senha");
                    break;
            }
        } while (opcao != 4);
        return opcao;
    }
}