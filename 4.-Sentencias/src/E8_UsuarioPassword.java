import java.util.Scanner;

public class E8_UsuarioPassword {
    public static void main(String[] args) {
        //Revisar si el usuario y password son correctos
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu usuario?: ");
        var usuario = consola.nextLine();
        System.out.print("Cual es tu password?: ");
        var password = consola.nextLine();
        //Revisamos usuario = admin y password = 123
        var usuario_valido = "admin";
        var password_valido = "123";
        if (usuario_valido.equals(usuario) && password_valido.equals(password)){
            System.out.println("Entrando al sistema...");
        }else if(usuario_valido.equals(usuario) && !password_valido.equals(password)){
            System.out.println("Password incorrecto");
        }else if(!usuario_valido.equals(usuario) && password_valido.equals(password)){
            System.out.println("Usuario invalido");
        }else{
            System.out.println("Valores incorrectos");
        }
        consola.close();

    }
}
