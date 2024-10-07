
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getHelloVersion(){
        return SystemProperties.get("ro.hello.version","");
    }
}
