package classLesson;

import java.util.Scanner;
import java.util.UUID;

class Util{
    public void sum(int a, int b){
        System.out.println("Sum of "+ a + " and "+ b +" = " +(a+b));
    }
}

class User{
    private String name;
    private int id;
    private String uuid;
    private String email;
    private String password;
    public void setUser(int id,String uuid,String name,String email,String password){
        this.id=id;
        this.uuid=uuid;
        this.name=name;
        this.email=email;
        this.password=password;
    }
    public void getUser(){
        System.out.println("=".repeat(20));
        System.out.println("User's name: " + name);
        System.out.println("User's id: " + id);
        System.out.println("User's uuid: " + uuid);
        System.out.println("User's email: " + email);
        System.out.println("User's password: " + password);
    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.print("[+] Enter the name of the user: ");
        String name = new Scanner(System.in).nextLine();
        int []number = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<number.length;i++){

        }
        System.out.print("[+] Enter the id of the user: ");
        int id = new Scanner(System.in).nextInt();
        System.out.print("[+] Enter the email of the user: ");
        String email = new Scanner(System.in).nextLine();
        System.out.print("[+] Enter the password of the user: ");
        String password = new Scanner(System.in).nextLine();
        user1.setUser(id, UUID.randomUUID().toString(),name,email,password);
        user1.getUser();
    }
}
