package gov.core.models;

public class Business {
    private String businessId;
    private String businessName;
    private String sector;

    public Business(String businessId, String businessName) {
        this.businessId = businessId;
        this.businessName = businessName;
    }

    public Business(String businessId, String businessName, String sector) {
        this.businessId = businessId;
        this.businessName = businessName;
        this.sector = sector;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
