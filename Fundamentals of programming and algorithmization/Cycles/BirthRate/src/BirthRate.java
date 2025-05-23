public class BirthRate {
    public static void main(String[] args) {
        int population = 10_000_000;
        double birthRate = 14.0;
        double deathRate = 8.0;
        int years = 10;

        for (int year = 1; year <= years; year++) {
            double births = population * birthRate / 1000;
            double deaths = population * deathRate / 1000;
            double growth = births - deaths;
            population += (int) growth;
            birthRate = Math.max(birthRate - 1, 7);
            deathRate = Math.max(deathRate - 1, 6);
        }

        System.out.printf("Через %d лет население составит: %,d человек%n", years, population);
    }
}