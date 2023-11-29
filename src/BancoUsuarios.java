import java.util.ArrayList;

public class BancoUsuarios{
    public ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();

    public void adicionarUser(Usuarios usuario){
        this.listaUsuarios.add(usuario);
    }
    public String listarUsuarios(){
        String usuarios="Todos os usuarios:\n";

        for(Usuarios usuario : this.listaUsuarios){
            usuarios+="Nome: "+usuario.nome;
        }
        return usuarios;
    }
    public static boolean verificaUsuario(String nomeInserido, String senha) {
        boolean existe = false;
        for (Usuarios usuario : listaUsuarios){
            if(nomeInserido == usuario.nome){
                System.out.println("ACHOU");
            };
            
        }
        return existe;
    }
}