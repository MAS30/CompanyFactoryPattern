public class Main {
    public static void main(String[] args) {
        Company gameCompany = new GameDevCompany();
        gameCompany.createSoftware();

        Company outsourcingCompany = new OutsourcingCompany();
        outsourcingCompany.createSoftware();
    }
}
