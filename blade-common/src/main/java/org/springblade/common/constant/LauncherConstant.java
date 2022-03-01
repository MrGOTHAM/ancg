package org.springblade.common.constant;

/**
 * Created with IntelliJ IDEA.
 * User: an
 * Date: 2022/3/1
 * Time: 20:14
 * Description:
 */
public interface LauncherConstant {
    String NACOS_NAMESPACE = "f447a694-519a-4255-95f9-bcbb5a5d6369";
    String NACOS_DEV_ADDR = "150.158.90.84:8848";
    String NACOS_PROD_ADDR = "150.158.90.84:8848";
    String NACOS_TEST_ADDR = "150.158.90.84:8848";
    String SENTINEL_DEV_ADDR = "127.0.0.1:8858";
    String SENTINEL_PROD_ADDR = "192.168.9.170:8858";
    String SENTINEL_TEST_ADDR = "192.168.9.170:8858";
    String SEATA_DEV_ADDR = "127.0.0.1:8091";
    String SEATA_PROD_ADDR = "192.168.9.170:8091";
    String SEATA_TEST_ADDR = "192.168.9.170:8091";
    String APPLICATION_DUBBO_PROVIDER_NAME = "blade-dubbo-provider";
    String APPLICATION_DUBBO_CONSUMER_NAME = "blade-dubbo-consumer";
    String APPLICATION_SEATA_ORDER_NAME = "blade-seata-order";
    String APPLICATION_SEATA_STORAGE_NAME = "blade-seata-storage";
    String APPLICATION_EASYPOI_NAME = "blade-easypoi";
    String APPLICATION_KAFKA_NAME = "blade-kafka";
    String APPLICATION_RABBIT_NAME = "blade-rabbit";
    String APPLICATION_STREAM_CONSUMER_NAME = "blade-stream-consumer";
    String APPLICATION_STREAM_PROVIDER_NAME = "blade-stream-provider";
    String FILE_MODE = "file";
    String NACOS_MODE = "nacos";
    String DEFAULT_MODE = "default";
    String GROUP_NAME = "-group";

    static String seataServiceGroup(String appName) {
        return appName.concat("-group");
    }

    static String nacosAddr(String profile) {
        byte var2 = -1;
        switch(profile.hashCode()) {
            case 3449687:
                if (profile.equals("prod")) {
                    var2 = 0;
                }
                break;
            case 3556498:
                if (profile.equals("test")) {
                    var2 = 1;
                }
        }

        switch(var2) {
            case 0:
                return "150.158.90.84:8848";
            case 1:
                return "150.158.90.84:8848";
            default:
                return "150.158.90.84:8848";
        }
    }

    static String sentinelAddr(String profile) {
        byte var2 = -1;
        switch(profile.hashCode()) {
            case 3449687:
                if (profile.equals("prod")) {
                    var2 = 0;
                }
                break;
            case 3556498:
                if (profile.equals("test")) {
                    var2 = 1;
                }
        }

        switch(var2) {
            case 0:
                return "192.168.9.170:8858";
            case 1:
                return "192.168.9.170:8858";
            default:
                return "127.0.0.1:8858";
        }
    }

    static String seataAddr(String profile) {
        byte var2 = -1;
        switch(profile.hashCode()) {
            case 3449687:
                if (profile.equals("prod")) {
                    var2 = 0;
                }
                break;
            case 3556498:
                if (profile.equals("test")) {
                    var2 = 1;
                }
        }

        switch(var2) {
            case 0:
                return "192.168.9.170:8091";
            case 1:
                return "192.168.9.170:8091";
            default:
                return "127.0.0.1:8091";
        }
    }
}
