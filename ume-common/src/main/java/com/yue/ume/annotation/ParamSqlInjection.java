package com.yue.ume.annotation;


import com.yue.ume.xss.ParamSqlValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义注解防止SQL注入提交
 *
 * @author bishuai
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ParamSqlValidator.class)
public @interface ParamSqlInjection {

    /**
     * 提示消息
     */
    String message() default "SQL_Injection_Attack!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}