package com.yanni.bootapp.config;

import com.yanni.bootapp.rest.ModelController;
import org.springframework.boot.actuate.autoconfigure.ManagementServerPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Created by yannipeng on 2/21/18.
 */
@Import({
//        EndpointWebMvcAutoConfiguration.class,
//        HealthIndicatorAutoConfiguration.class,
//        EndpointMBeanExportAutoConfiguration.class,
//        EndpointAutoConfiguration.class,
        ManagementServerPropertiesAutoConfiguration.class,
        EmbeddedServletContainerAutoConfiguration.class,
        DispatcherServletAutoConfiguration.class
})
public class BootAppConfig {

    @Bean
    public ModelController modelController() {
        return new ModelController();
    }
}
