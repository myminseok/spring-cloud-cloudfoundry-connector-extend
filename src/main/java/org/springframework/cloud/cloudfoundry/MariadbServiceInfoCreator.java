package org.springframework.cloud.cloudfoundry;

import org.springframework.cloud.service.common.MariadbServiceInfo;
import org.springframework.cloud.cloudfoundry.Tags;

/**
 *
 * @author Ramnivas Laddad
 *
 */
public class MariadbServiceInfoCreator extends RelationalServiceInfoCreator<MariadbServiceInfo> {

    public MariadbServiceInfoCreator() {
        // the literal in the tag is CloudFoundry-specific
        super(new Tags("mariadb"), MariadbServiceInfo.MARIADB_SCHEME);
    }

    @Override
    public MariadbServiceInfo createServiceInfo(String id, String url, String jdbcUrl) {
        return new MariadbServiceInfo(id, url, jdbcUrl);
    }
}
