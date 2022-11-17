import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        firstName = firstName + " ";
        lastName = lastName + " ";
        String fullName = lastName + firstName + middleName;
        firstName = firstName.replace("Ivan", "IVAN");
        System.out.println("ФИО сотрудника —  " + fullName);

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);





    }
}