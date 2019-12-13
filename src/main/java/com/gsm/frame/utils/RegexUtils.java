package com.gsm.frame.utils;

import java.util.regex.Pattern;

/**
 * 正则表达式判断
 */
public class RegexUtils {

    /**
     * 判断手机号是否正确
     * @param iphoneNo
     * @return
     */
    public static boolean checkIphoneNo(String iphoneNo){
        //使用该正则表达式判断
        Pattern pattern = Pattern.compile(Constants.IPHONE_NO_REGEX);
        boolean matches = pattern.matcher(iphoneNo).matches();
        return matches;
    }

    /**
     * 判断邮箱号是否正确
     * @param userEmail
     * @return
     */
    public static boolean checkUserEmail(String userEmail) {
        //使用该正则表达式判断
        Pattern pattern = Pattern.compile(Constants.EMAIL_REGEX);
        boolean matches = pattern.matcher(userEmail).matches();
        return matches;
    }
}
