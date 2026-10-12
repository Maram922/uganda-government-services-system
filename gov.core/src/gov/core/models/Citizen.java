package gov.core.models;

public class Citizen {
    private String nationalId;
    private String name;

    public Citizen(String nationalId, String name) {
        this.nationalId = nationalId;
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
