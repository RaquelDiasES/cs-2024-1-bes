package atividade11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {
    public static void main(String[] args) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,12}$";
        Pattern pattern = Pattern.compile(regex);
        
        String senha = "Senha123!";
        
        Matcher matcher = pattern.matcher(senha);
        boolean senhaValida = matcher.matches();
        
        System.out.println("A senha é válida? " + senhaValida);
    }
}
