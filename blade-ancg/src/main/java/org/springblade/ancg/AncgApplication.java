package org.springblade.ancg;

import org.springblade.core.cloud.feign.EnableBladeFeign;
import org.springblade.core.launch.BladeApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * Created with IntelliJ IDEA.
 * User: an
 * Date: 2022/3/1
 * Time: 19:52
 * Description:
 */
@EnableBladeFeign
@SpringCloudApplication
public class AncgApplication {

    public static void main(String[] args) {
        BladeApplication.run("blade-ancg",AncgApplication.class, args);
    }
}
