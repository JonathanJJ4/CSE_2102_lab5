package com.example.demo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Password {
    private String pwd;
    private String username;
    private String email;
    public Password(String pwd, String username, String email) {
        this.pwd = pwd;
        this.username = username;
        this.email = email;
    }
    public String getPwd() {
        return pwd;
    }
    public boolean PasswordValidator() {
        return isLengthValid() && containsRequiredCharacters() && hasSufficientEntropy() && !containsUsernameOrEmail();
    }
    private boolean isLengthValid() {
        return pwd.length() >= 10;
    }
    private boolean containsRequiredCharacters() {
        return matchesRegex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$", pwd);
    }
    private boolean hasSufficientEntropy() {
        return calculateEntropy(pwd) >= 40;
    }
    private boolean containsUsernameOrEmail() {
        return containsIgnoreCase(pwd, username) || containsIgnoreCase(pwd, email);
    }
    private boolean matchesRegex(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    private double calculateEntropy(String input) {
        return input.length() * Math.log(94) / Math.log(2);
    }
    private boolean containsIgnoreCase(String str, String substr) {
        return str.toLowerCase().contains(substr.toLowerCase());
    }
}