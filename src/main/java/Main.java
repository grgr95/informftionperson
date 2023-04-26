public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Григорий";
        post.passport = "4444 № 44444444";
        post.patronymic = "Антоновичвич";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Сумароков";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 8;
        post.birthday.year = 1995;

    }
}