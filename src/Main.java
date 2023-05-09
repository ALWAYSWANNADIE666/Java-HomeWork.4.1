public class Main {
    public static void main(String[] args) {
        int ticket = 24_826;
        int bonus = 20;
        int miles = ticket / bonus;
        System.out.println("Количество начисленных бонусов: " + miles);
    }
}