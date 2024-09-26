public class Developer extends Employee implements ICanCode{
    private String programmingLanguage;

    public Developer(String name, long salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("ProgrammingLanguage: " + programmingLanguage);
    }

    @Override
    public void Work() {
        System.out.println("Developer is writing code.");
    }

    @Override
    public void writeCode() {
        System.out.println("Developer is writing code in " + programmingLanguage);
    }
}
