package com.mashtura.tests.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = null;
    private String configFilePath;

    public ConfigReader() {
        properties = new Properties();
        configFilePath=System.getProperty("user.dir")+"/resources/configQA.properties";
        try {
            getProperties();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void getProperties() throws IOException {
        InputStream input = Files.newInputStream(new File(configFilePath).toPath());//getClass().getClassLoader().getResourceAsStream("configQA.properties");
        properties.load(input);
    }

    public String getValue(String iKey) throws Exception {
        if (properties.getProperty(iKey) != null) {
            return properties.getProperty(iKey);
        }
        throw new Exception("No value for " + iKey + " is found");
    }

}