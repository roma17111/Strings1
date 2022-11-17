import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        firstName = firstName + " ";
        lastName = lastName + " ";
        String fullName = lastName + firstName + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника —  " + fullName);

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);









    }
}