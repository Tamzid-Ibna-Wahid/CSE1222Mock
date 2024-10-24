package Q1;

public class Runner {
    public static void main(String[] args) {

        Worker worker = new Worker("Shafi", 3000);
        System.out.println(worker.getName());
        System.out.println(worker.getWage());
        System.out.println(worker.toString());

        Supervisor supervisor = new Supervisor("rafi", 5000, "IT");
        System.out.println( supervisor.getDivision());
        System.out.println(supervisor.toString());

        Director director = new Director("Kafi", 8000, "Operations");
        System.out.println(director.toString());
    }
}
