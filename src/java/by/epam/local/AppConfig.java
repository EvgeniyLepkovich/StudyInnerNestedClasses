package by.epam.local;

import java.util.List;

/**
 * Created by Yayheniy_Lepkovich on 6/2/2017.
 */
public class AppConfig {
    public static void main(String[] args){
        String[] numbers = { "5298758967", "5298417496", "296798741", "aaa", "257418588" };

//        Java 8
//        PhoneNumberValidator.getValidNumbers(numbers).stream().forEach(i -> System.out.println("Number " + i + " is valid.") );
        List<String> validNumbers = PhoneNumberValidator.getValidNumbers(numbers);
        for (String number : validNumbers) {
            System.out.println("Number " + number + " is valid.");
        }

        RegionPhoneNumberValidator CisPhoneNumberValidator = RegionPhoneNumberValidator.CIS;
        validNumbers = CisPhoneNumberValidator.ValidatePhones(numbers);
        System.out.println("Cis valid numbers:");
        for (String number : validNumbers) {
            System.out.println("Number " + number + " is valid.");
        }

        RegionPhoneNumberValidator EuPhoneNumberValidator = RegionPhoneNumberValidator.EU;
        validNumbers = EuPhoneNumberValidator.ValidatePhones(numbers);
        System.out.println("Eu valid numbers:");
        for (String number : validNumbers) {
            System.out.println("Number " + number + " is valid.");
        }

        UseExamples useExamples = new UseExamples();
        System.out.println(useExamples.toString());
    }
}
