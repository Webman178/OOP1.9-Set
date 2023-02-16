package transport;

public class Mechanic {
    private String firstName="Default_FitsName";
    private String lastName="Default_LastName";
    private String company="Default_company";

    public Mechanic(String firstName, String lastName, String company) {
        if(checkString(firstName))
            this.firstName = firstName;
        if(checkString(lastName))
            this.lastName = lastName;
        if(checkString(company))
            this.company = company;
    }

    private boolean checkString(String name) {
        if (name != null && !name.isBlank()) {
            return true;
        }
        return false;
    }

    public void makeDiagnostic() {
        System.out.println("Механик " + lastName + " " + firstName + " проводит диагностику");
    }

    public void repairTransport() {
        System.out.println("Механик " + lastName + " " + firstName + " ремонтирует автомобиль");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (checkString(firstName)) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (checkString(lastName)) {
            this.lastName = lastName;
        }

    }

    public String getCompany() {
            return company;
    }

    public void setCompany(String company) {
        if (checkString(company)) {
            this.company = company;
        }
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.company;
    }
}
