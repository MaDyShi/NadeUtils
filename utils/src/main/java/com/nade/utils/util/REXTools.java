package com.nade.utils.util;

import android.text.TextUtils;

/**
 * Created by KuKa on 2017/9/19.
 * 正则工具类
 */

public class REXTools {


    // 手机号验证
    public static boolean isPhoneNumber(String phone) {
        String isPhone = "[1][3456789]\\d{9}";
        return phone.matches(isPhone);
    }

    public static String hidePhone(String phone){
        // 用****替换手机号码中间4位
        String maskNumber = "";
        if (!TextUtils.isEmpty(phone)){
            maskNumber = phone.substring(0,3)+"****"+phone.substring(7,phone.length());
        }
        return maskNumber;
    }

    public static String hideAddress(String address) {
        // 用****替换地址长度一半以后
        int i = address.length() / 2;
        return address.substring(0, i) + "****";
    }

    public static boolean isIDCard(String sId) {
        String isCard = "d{17}\\[A-Z]";
        return sId.matches(isCard);
    }
        // 检测密码是否合法；
    public static boolean checkPassword(String word){
        String checkWord = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$";
        if (word==null)return false;
        return word.matches(checkWord);
    }
}
