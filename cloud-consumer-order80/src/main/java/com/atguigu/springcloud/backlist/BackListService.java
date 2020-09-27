package com.atguigu.springcloud.backlist;

/**
 * @author zhang.suxing
 * @date 2020/9/27 23:31
 **/
public class BackListService {

    private PliceyHandlerAdapter pliceyHandlerAdapter;


    public boolean backList(Object o, Strategy strategy){
       return pliceyHandlerAdapter.fingdHandler(o, strategy).stream()
                .anyMatch(h -> !h.canPass(o));
    }

}
