package com.cx;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author chenxiang
 * @create 2021-09-13 11:41
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Person {
}
