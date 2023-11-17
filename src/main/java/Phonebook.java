import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Phonebook {
    private final Map<String, List<String>> book;

    public Phonebook() {
        book = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> phoneNumbers = book.getOrDefault(surname, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        book.put(surname, phoneNumbers);
    }

    public List<String> get(String surname) {
        return book.get(surname);
    }

    public static void main(String[] args) {
        Phonebook myPhoneBook = new Phonebook();

        myPhoneBook.add("Gagarin", "+375298989098");
        myPhoneBook.add("Gagarina", "+3751790905676");
        myPhoneBook.add("Gagarin", "+37521456567");
        myPhoneBook.add("Skladovskaya", "+375445556664");

        String surname = "Gagarina";
        List<String> phoneNumbers = myPhoneBook.get(surname);

        if (phoneNumbers != null) {
            System.out.println("Номера телефонов для фамилии " + surname + ":");
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
        } else {
            System.out.println("Фамилия " + surname + " не найдена в справочнике.");
        }
    }
}
//Написать простой класс Телефонный Справочник,
// который хранит в себе список фамилий и телефонных номеров.
// этот телефонный справочник с помощью метода add() можно добавлять записи,
// а с помощью метода get() искать номер телефона по фамилии. Следует учесть,
// что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.