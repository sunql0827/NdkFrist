package com.sunql.ndkfrist;

public class JniLoader {
    static {
        System.loadLibrary("demo-lib");
    }
    public native String stringFromJNI();

    public native String logFormJni();
}
