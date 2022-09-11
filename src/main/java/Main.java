public class Main {

    public static void main(String[] args) {
        Post person = new Post();
        person.name = "Иван";
        person.passport = "4444 №444444";
        person.surname = "Иванов";
        person.phone = "+7(999)-999-99-99";
        person.patronymic = "Иванович";
        person.subscription = true;
        person.birthday = new FormDate();
        person.birthday.day = 13;
        person.birthday.month = 6;
        person.birthday.year = 1999;
    }
}
