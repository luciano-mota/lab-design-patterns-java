package com.design.patterns.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author luciano_dev
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}