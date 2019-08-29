package pension;

public class Contractor {

    private String name;
    private Company company;

    public Contractor(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }


    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return company.getName();
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Contractor))
            throw new RuntimeException();

        Contractor other = (Contractor)object;
        return this.getName().equals(other.getName());
    }

}
