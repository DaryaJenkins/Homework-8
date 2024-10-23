public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.birthday = new FormDate();
        post.birthday.day = 24;
        post.birthday.month = 10;
        post.birthday.year = 1996;

        post.name = "Дарья";
        post.passport = "1122 556677";
        post.patronymic = "Витальевна";
        post.phone = "7 903 111 22 33";
        post.surname = "Иваненко";
        post.subscription = false;
    }
}