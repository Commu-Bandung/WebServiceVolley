package com.firman.webservicevolley;

import android.net.Uri;

/**
 * Created by Firman on 4/7/2017.
 */

public class URLServices {
    public static String URL_SHOW = "http://192.168.43.68/user/show.php";
    public static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%";

    public static String URL_INSERT(String name, String office, String email) {
        return Uri.encode("http://192.168.43.68/user/insert.php?name=" + name + "&office=" + office + "&email=" + email, ALLOWED_URI_CHARS);
    }

    public static String URL_DELETE(String id) {
        return "http://192.168.43.68/user/delete.php?id=" + id;
    }

    public static String URL_MODIFY(String id, String name, String office, String email) {
        return Uri.encode("http://192.168.43.68/user/modify.php?id=" + id + "&name=" + name + "&office=" + office + "&email=" + email, ALLOWED_URI_CHARS);
    }
}
