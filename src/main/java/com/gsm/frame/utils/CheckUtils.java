package com.gsm.frame.utils;

public class CheckUtils {
    /**
     * 校验 字符串是否为空
     *
     * @param string
     * @return 为空返回 true
     */
    public static boolean checkStringIsNull(String string) {
        if (string == null || "".equals(string.trim())) {
            return true;
        }
        return false;
    }

    /**
     * 校验 字符串是否不为空
     *
     * @param string
     * @return 不为空返回 true
     */
    public static boolean checkStringIsNotNull(String string) {
        if (string != null && !"".equals(string.trim())) {
            return true;
        }
        return false;
    }

    /**
     * 校验 Integer 不为空，且 >= 1
     * @param integer
     * @return 不为空，且大于 0 为 true
     */
    public static boolean checkIntegerIsNotNull(Integer integer) {
        if (integer != null && integer > 0) {
            return true;
        }
        return false;
    }

    /**
     * 校验 Integer 为空 或者 值为 0
     * @param integer
     * @return 为空，或者为 0 为 true
     */
    public static boolean checkIntegerIsNull(Integer integer) {
        if (integer == null || integer == 0) {
            return true;
        }
        return false;
    }
}
