package com.AnnotationBean.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.AnnotationBean"})
public class BeanConfig {
}
