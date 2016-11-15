package org.springframework.cloud.service.common;

import org.springframework.cloud.service.ServiceInfo.ServiceLabel;

/**
 *
 * @author Ramnivas Laddad
 *
 */
@ServiceLabel("mariadb")
public class MariadbServiceInfo extends RelationalServiceInfo {
    public static final String MARIADB_SCHEME = "mariadb";

    public MariadbServiceInfo(String id, String url) {
        this(id, url, null);
    }

    public MariadbServiceInfo(String id, String url, String jdbcUrl) {
        super(id, url, jdbcUrl, MARIADB_SCHEME);
    }
}