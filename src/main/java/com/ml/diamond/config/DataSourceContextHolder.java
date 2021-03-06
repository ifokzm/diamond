package com.ml.diamond.config;

public class DataSourceContextHolder {

    private final static ThreadLocal<String> local = new ThreadLocal<>();

    public static void putDataSource(String name) {
        local.set(name);
    }

    public static String getDataSource() {
        return local.get();
    }

    public static void clearDataSource() {
        local.remove();
    }
}
