package com.design.patterns.gof;

import com.design.patterns.gof.facade.Facade;
import com.design.patterns.gof.singleton.SingletonEager;
import com.design.patterns.gof.singleton.SingletonLazy;
import com.design.patterns.gof.singleton.SingletonLazyHolder;
import com.design.patterns.gof.strategy.Comportamento;
import com.design.patterns.gof.strategy.ComportamentoAgressivo;
import com.design.patterns.gof.strategy.ComportamentoDefensivo;
import com.design.patterns.gof.strategy.ComportamentoNormal;
import com.design.patterns.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        /**
         * Singleton
         */
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder );

        /**
         * Strategy
         */
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


        /**
         * Facade
         */
        Facade facade = new Facade();
        facade.migrarCliente("luh", "65485-000");
    }
}
