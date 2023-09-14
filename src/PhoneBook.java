import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        phones();

    }
    static void phones()
    {
        Phone phonebook = new Phone();
        phonebook.addphone("123456", "Иванов");
        phonebook.addphone("321456", "Васильев");
        phonebook.addphone("234561", "Петров");
        phonebook.addphone("234432", "Иванов");
        phonebook.addphone("654321", "Петров");
        phonebook.addphone("345678", "Иванов");
        phonebook.addphone("854321", "Петров");
        System.out.println(phonebook.getByname("Иванов"));
        //System.out.println(phonebook.getByphoneNum("Иванов"));
    }

}

