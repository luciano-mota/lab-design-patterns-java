package com.design.patterns.gof.singleton;

/**
 * Singleton "apressado"
 * @author luciano_dev
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
