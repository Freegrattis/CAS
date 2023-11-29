public class TelaDeLogin {
    public int mostrarTelaLogin() {
        int opcao = 0;
        String nome = "";
        String senha = "";
        boolean validacao = false;
        BancoUsuarios b = new BancoUsuarios();
        do {
            opcao = EntradaSaida.escolherOpcaoMenuTelaLogin();
            switch (opcao) {
                case 1:
                    nome = EntradaSaida.loginUsuario("o nome");
                    senha = EntradaSaida.loginUsuario("a senha");
                    validacao = BancoUsuarios.verificaUsuario(nome,senha);
                    break;
                case 2:
                    Usuarios u = new Usuarios();
                    u.nome=EntradaSaida.CadastrarUsuario("o nome");
                    u.senha=EntradaSaida.CadastrarUsuario("a senha");
                    b.adicionarUser(u);
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