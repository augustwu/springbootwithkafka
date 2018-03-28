package com.chinatelecom.applyhandler;

import cn.chinatelecom.dp.processengine.sdk.applyhandler.BaseHandler;
import cn.chinatelecom.dp.processengine.sdk.applyhandler.MessageHandler;

/**
 * Created by wu on 18-3-21.
 */
//package cn.chinatelecom.dp.processengine.sdk.applyhandler;
//
///**
// * Created by wu on 18-3-21.
// */
//
@MessageHandler(action = "todp_ability_open_mq_apply")
public class TodpAbilityOpenMqApply  extends BaseHandler {

    @Override
    public String handMessage(String message) {
        System.out.println("aaaa");

        System.out.println(message);
        System.out.println("=========");
        return  message;
    }
}
