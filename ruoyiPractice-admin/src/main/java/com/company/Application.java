package com.company;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application {
    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("\n" +
                "\n" +
                "  ____                   __   __  _     ____                          _     _               \n" +
                " |  _ \\   _   _    ___   \\ \\ / / (_)   |  _ \\   _ __    __ _    ___  | |_  (_)   ___    ___ \n" +
                " | |_) | | | | |  / _ \\   \\ V /  | |   | |_) | | '__|  / _` |  / __| | __| | |  / __|  / _ \\\n" +
                " |  _ <  | |_| | | (_) |   | |   | |   |  __/  | |    | (_| | | (__  | |_  | | | (__  |  __/\n" +
                " |_| \\_\\  \\__,_|  \\___/    |_|   |_|   |_|     |_|     \\__,_|  \\___|  \\__| |_|  \\___|  \\___|\n" +
                "                                                                                            \n" +
                "\n");
    }
}