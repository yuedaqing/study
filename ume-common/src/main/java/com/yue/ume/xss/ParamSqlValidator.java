package com.yue.ume.xss;

import com.yue.ume.annotation.ParamSqlInjection;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * SQL注入校验器
 *
 * @author bishuai
 */
public class ParamSqlValidator implements ConstraintValidator<ParamSqlInjection, String> {

    //过滤掉的sql关键字，特殊字符前面需要加\\进行转义
    private static final String CHECK_SQL =
            "select|update|and|or|delete|insert|truncate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute|table|" +
                    "char|declare|sitename|xp_cmdshell|like|from|grant|use|group_concat|column_name|" +
                    "information_schema.columns|table_schema|union|where|order|by|" +
                    "'\\*|\\;|\\-|\\--|\\+|\\,|\\//|\\/|\\%|\\#";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        //统一转为小写
        String str = value.toLowerCase();

        String[] splitArray = CHECK_SQL.split("\\|");

        for (String split : splitArray) {
            if (str.contains(split)) {
                return false;
            }
        }
        return true;
    }
}