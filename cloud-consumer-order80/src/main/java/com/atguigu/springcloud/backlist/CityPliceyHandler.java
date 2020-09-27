package com.atguigu.springcloud.backlist;

/**
 * @author zhang.suxing
 * @date 2020/9/27 23:23
 **/
public class CityPliceyHandler implements PliceyHandler {

    @Override
    public Boolean canPass(Object o) {
        return null;
    }

    @Override
    public Boolean match(Strategy strategy, Boolean b) {
        return Strategy.CITY.equals(strategy);
    }
}
