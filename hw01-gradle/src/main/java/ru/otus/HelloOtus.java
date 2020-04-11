package ru.otus;

import com.google.common.base.Splitter;

/**
 * To start the application:
 * ./gradlew build
 * java -jar ./hw01-gradle/build/libs/hw01-gradle-0.1.jar
 */

public class HelloOtus {
    public static void main(String[] args) {

        String str = "abc,def,ghi,,jkl,,mno,";
        Splitter splitter = Splitter.on(",");
        Iterable<String> result = splitter.split(str);

        System.out.println(result);
    }
}
