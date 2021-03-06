package com.capkloss;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InittalClass {
    public static void main(String[] args) throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "credentials.properties";

        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));
        String appVersion = appProps.getProperty("password");

        System.out.println("Password is: " + appVersion);
    }
}
