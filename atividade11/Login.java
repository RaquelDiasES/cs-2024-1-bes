package atividade11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{5,30}$";
        Pattern pattern = Pattern.compile(regex);
        
        String login = "SeuLogin123!";
        
        Matcher matcher = pattern.matcher(login);
        boolean loginValido = matcher.matches();
        
        System.out.println("O login é válido? " + loginValido);
    }
}
