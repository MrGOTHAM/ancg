package org.springblade.common.launch;

import org.springblade.common.constant.LauncherConstant;
import org.springblade.core.launch.service.LauncherService;
import org.springblade.core.launch.utils.PropsUtil;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Service;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: an
 * Date: 2022/3/1
 * Time: 20:23
 * Description:
 */
@Service
public class LauncherServiceImpl implements LauncherService {
    public LauncherServiceImpl() {
    }

    public void launcher(SpringApplicationBuilder builder, String appName, String profile, boolean isLocalDev) {
        Properties props = System.getProperties();
        PropsUtil.setProperty(props, "spring.cloud.nacos.discovery.server-addr", LauncherConstant.nacosAddr(profile));
        PropsUtil.setProperty(props, "spring.cloud.nacos.config.server-addr", LauncherConstant.nacosAddr(profile));
        PropsUtil.setProperty(props, "spring.cloud.sentinel.transport.dashboard", LauncherConstant.sentinelAddr(profile));
        PropsUtil.setProperty(props, "dubbo.application.name", appName);
        PropsUtil.setProperty(props, "dubbo.application.qos.enable", "false");
        PropsUtil.setProperty(props, "dubbo.protocol.name", "dubbo");
        PropsUtil.setProperty(props, "dubbo.registry.address", "nacos://" + LauncherConstant.nacosAddr(profile));
        PropsUtil.setProperty(props, "dubbo.version", "2.8.0.RELEASE");
        PropsUtil.setProperty(props, "dubbo.scan.base-packages", "org.springblade");
        PropsUtil.setProperty(props, "seata.service.grouplist.default", LauncherConstant.seataAddr(profile));
        PropsUtil.setProperty(props, "seata.tx-service-group", LauncherConstant.seataServiceGroup(appName));
        PropsUtil.setProperty(props, "seata.service.vgroup-mapping.".concat(LauncherConstant.seataServiceGroup(appName)), "default");
    }
}
