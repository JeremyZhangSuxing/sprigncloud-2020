package com.atguigu.springcloud.backlist;

/**
 * @author zhang.suxing
 * @date 2020/9/27 23:19
 **/
public interface PliceyHandler {

    Boolean canPass(Object o);

    Boolean match(Strategy strategy, Boolean b);


}
