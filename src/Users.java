import java.util.ArrayList;
public class Users{
    public ArrayList<User> userList = new ArrayList<User>();

    public void adicionarUser(User addUser){
        this.userList.add(addUser);
    }
    public String listarUsuarios(){
        String usuarios="Todos os usuarios:\n";

        for(User addUsers : this.userList){
            usuarios+="Nome: "+addUsers.nome;
        }
        return usuarios;
    }
     public String procurarUser(){
        for (User addUser: this.userList){
            return ;
        }
     }
}