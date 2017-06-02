package by.epam.local;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yayheniy_Lepkovich on 6/2/2017.
 */
public enum RegionPhoneNumberValidator {

    CIS(9), EU(10);

    String regularExpression = "[^0-9]";
    final int numberLength;

    RegionPhoneNumberValidator(int numberLength) {
        this.numberLength = numberLength;
    }

    public List<String> ValidatePhones(String... phoneNumbers){
        class PhoneNumber {
            String formattedPhoneNumber = null;
            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }
            public String getNumber() {
                return formattedPhoneNumber;
            }
        }

        List<PhoneNumber> numbers = new ArrayList<>();
        List<String> validNumbers = new ArrayList<>();

        //Java 8
//        Arrays.stream(phoneNumbers).forEach(i -> numbers.add(new PhoneNumber(i)));
//        numbers.stream().forEach(i -> { if (i.getNumber() != null) validNumbers.add(i.getNumber());});
        for (String str : phoneNumbers) {
            numbers.add(new PhoneNumber(str));
        }
        for (PhoneNumber phoneNumber : numbers) {
            if (phoneNumber.getNumber() != null) {
                validNumbers.add(phoneNumber.getNumber());
            }
        }
        return validNumbers;
    }
}
