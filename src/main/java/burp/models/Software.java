package burp.models;

import java.util.HashSet;
import java.util.Set;

public class Software {

    private final String key;
    private final String name;
    private final String version;
    private final String matchType;
    private final String alias;
    private final Set<Vulnerability> vulnerabilities;

    public Software(String key, String name, String version, String matchType, String alias) {
        this.key = key;
        this.name = name;
        this.alias = alias;
        this.version = version;
        this.matchType = matchType;
        this.vulnerabilities = new HashSet<>();
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getAlias() {
        return alias;
    }

    public String getMatchType() {
        return matchType;
    }

    public Set<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

}
