module gov.services {
    requires gov.core;
    requires gov.security;

    exports gov.services.tax;
    exports gov.services.identity;
    exports gov.services.passport;
    exports gov.services.business;
}