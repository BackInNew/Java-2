public class Main {
    public static void main(String[] args) {
        int ticketPrice = 28600;
        int bonus = 20;

        int numberOfBonuses = ticketPrice / bonus;
        System.out.println("Количество мил:" + numberOfBonuses);
    }
}