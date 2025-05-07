package Encapsulation;

import java.util.Scanner;

class User{
    private String name;
    private int age;
    private String email;
    private String password;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public void setUser(String name, int age, String email, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }
    public User(){

    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.print("[+] Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("[+] Enter your age: ");
        int age = new Scanner(System.in).nextInt();
        System.out.print("[+] Enter your email: ");
        String email = new Scanner(System.in).nextLine();
        System.out.print("[+] Enter your password: ");
        String password = new Scanner(System.in).nextLine();
        user1.setUser(name,age,email,password);
        user1.display();
    }
}
