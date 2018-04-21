
/**
 * @标题: dsa.java
 * @包名： com.nlx.appliaction.conf
 * @功能描述：TODO
 * @author： liyonggang
 * @创建时间： 2018年4月20日 下午3:35:32
 * @version v1.0
 */

package com.nlx.appliaction.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * swagger 配置类
 */
@Configuration
public class Swagger2
{
    
    @Bean
    public Docket createRestApi()
    {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors
                .basePackage("com.nlx.appliaction.controller"))
            .paths(PathSelectors.any())
            .build();
    }
    
    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder().title("第三方Api接口对接")
            .description("对接一些常用的第三方api")
            .termsOfServiceUrl("http：//www.baidu.com")
            .version("1.0")
            .build();
    }
}
