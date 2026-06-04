package com.AnnotationBean.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // configuration class like a XML file
@ComponentScan(basePackages = {"com.AnnotationBean"}) // Scan all the bean present in this package 
public class BeanConfig {
}
