package com.ml.diamond.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    private SpringSwaggerConfig springSwaggerConfig;
//
//    @Autowired
//    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
//        this.springSwaggerConfig = springSwaggerConfig;
//    }
//
//    @Bean
//    public SwaggerSpringMvcPlugin customImplementation() {
//        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
//                .apiInfo(new ApiInfo("Spring RESTful Authorization Demo Api",
//                        null, null, null, null, null)).
//                //将Timestamp类型全部转为Long类型
//                        directModelSubstitute(Timestamp.class, Long.class);
//    }

    @Bean
    public Docket createRestApi() {
        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
            @Override
            public boolean apply(RequestHandler input) {
//                Class<?> declaringClass = input.declaringClass();
//                if (declaringClass == BasicErrorController.class)// 排除
//                    return false;
//                if(declaringClass.isAnnotationPresent(RestController.class)) // 被注解的类
//                    return true;
//                if(input.isAnnotatedWith(ResponseBody.class)) // 被注解的方法
//                    return true;
//                return false;
                return true;
            }
        };
//        ParameterBuilder tokenPar = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<Parameter>();
//        tokenPar.name("X-Auth-Token").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false)
                .select()
                .apis(predicate)
                .build();
//                .ignoredParameterTypes(User.class);
//                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("南京默联 API")//大标题
                .version("1.0")//版本
                .build();

    }
}
