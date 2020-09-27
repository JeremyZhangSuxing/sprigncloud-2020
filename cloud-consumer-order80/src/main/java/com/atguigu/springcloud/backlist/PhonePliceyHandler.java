package com.atguigu.springcloud.backlist;

/**
 * @author zhang.suxing
 * @date 2020/9/27 23:22
 **/
public class PhonePliceyHandler implements PliceyHandler{

    @Override
    public Boolean canPass(Object o) {
        return null;
    }

    @Override
    public Boolean match(Strategy strategy, Boolean b) {
        return Strategy.PHONE.equals(strategy);
    }
}
