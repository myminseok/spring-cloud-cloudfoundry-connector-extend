package org.springframework.cloud.service.relational;

import org.springframework.cloud.service.common.MariadbServiceInfo;
import org.springframework.cloud.service.relational.DataSourceCreator;

public class MariadbDataSourceCreator extends DataSourceCreator<MariadbServiceInfo> {
    public static final String[] DRIVERS = new String[]{"org.mariadb.jdbc.Driver", "com.mysql.jdbc.Driver"};
    /**
     * Validation query obtained from the MySQL reference manual:
     * http://dev.mysql.com/doc/refman/5.1/en/connector-j-usagenotes-j2ee.html
     */
    public static final String VALIDATION_QUERY = "/* ping */ SELECT 1";

    public MariadbDataSourceCreator() {
        super("spring-cloud.mariadb.driver", DRIVERS, VALIDATION_QUERY);
    }

}
