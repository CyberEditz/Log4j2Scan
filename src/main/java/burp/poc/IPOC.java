package burp.poc;

public interface IPOC {
    int POC_TYPE_LDAP = 1;
    int POC_TYPE_RMI = 2;
    int POC_TYPE_DNS = 3;
    int POC_TYPE_DOS = 4;

    String generate(String domain);
    int getType();
}
