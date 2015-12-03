package com.namitor.wangzi6147.doy.utils;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public class StringUtil {
    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
