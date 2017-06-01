package by.epam.app;

import by.epam.local.PhoneNumberValidator;

import java.util.List;

/**
 * Created by Yayheniy_Lepkovich on 6/1/2017.
 */
public class Main {
    public static void main(String[] args){
        String[] numbers = { "1234567890", "123456789", "1112223334", "aaa", "bbbbbbbbbb" };

//        Java 8
//        PhoneNumberValidator.getValidNumbers(numbers).stream().forEach(i -> System.out.println("Number " + i + " is valid.") );
        List<String> validNumbers = PhoneNumberValidator.getValidNumbers(numbers);
        for (String number : validNumbers) {
            System.out.println("Number " + number + " is valid.");
        }
    }
}
