package Desafio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// ----

class UserManager {
    private List<User> usuarios;
    private static UserManager instancia;

    private UserManager() {
        usuarios = new ArrayList<>();
    }

    public static UserManager getInstancia() {
        if(instancia == null) {
            instancia = new UserManager();
        }
        return instancia;
    }

    public void addUser(String nome) {
        int id = usuarios.size() + 1;
        usuarios.add(new User(id, nome));
    }

    public void listarUsuarios() {
        for(User usuario : usuarios) {
            System.out.println(usuario.getId() + " - " + usuario.getName());
        }
    }
}

// ----
class Main {
    private static final List<User> users = new ArrayList<>();

    // TODO: Implementar o padrão Singleton para garantir que haja apenas uma instância do gerenciador de usuários
    static UserManager user = UserManager.getInstancia();

    public static void addUser(String name) {

        //TODO("Implementar a lógica de adicionar um novo usuário na lista mutável $users.")
        user.addUser(name);
    }

    public static void listUsers() {

        //TODO("Implementar a impressão dos $users, seguindo o padrão definido no enunciado.")
        user.listarUsuarios();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha após a leitura do número

        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            addUser(name);
        }

        listUsers();
    }
}


