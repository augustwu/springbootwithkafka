package com.chinatelecom.applyhandler;

import cn.chinatelecom.dp.processengine.sdk.applyhandler.BaseHandler;
import cn.chinatelecom.dp.processengine.sdk.applyhandler.MessageHandler;

/**
 * Created by wu on 18-3-28.
 */
@MessageHandler(action = "todp_datafactory_hive_apply")
public class TodpDatafactoryHiveApply extends BaseHandler {

    @Override
    public String handMessage(String message) {
        System.out.println("BBBB");

        System.out.println(message);
        System.out.println("CCCCCC");
        return  message;
    }
}
