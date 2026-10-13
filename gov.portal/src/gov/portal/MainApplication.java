package gov.portal;

import gov.core.models.Citizen;
import gov.security.services.*;
import gov.services.tax.*;
import gov.services.identity.*;
import gov.services.passport.*;
import gov.services.business.*;

public class MainApplication {
    static void main(String[] args) {
        AuthenticationService auth = new AuthenticationService();

        if(auth.login()){
            System.out.println("User authenticated successfully");

            Citizen citizen = new Citizen("CM12345678", "John Okello");

            System.out.println("Name: " +
                    citizen.getName());

            System.out.println("National ID: " +
                    citizen.getNationalId());

            TaxService taxService = new TaxService();
            taxService.collectTax();

            IdentityService identityService = new IdentityService();
            identityService.verifyIdentity();

            PassportService passportService = new PassportService();
            passportService.processPassport();

            BusinessRegistrationService businessRegistrationService = new BusinessRegistrationService();
            businessRegistrationService.registerBusiness();
        }

        else {
            System.out.println("Access denied");
        }
    }
}
