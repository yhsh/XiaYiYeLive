package com.yhsh.xiayiyelive;

import android.app.Application;

import com.tencent.rtmp.TXLiveBase;

/*
 * Copyright (c) 2020, smuyyh@gmail.com All Rights Reserved.
 * #                                                   #
 * #                       _oo0oo_                     #
 * #                      o8888888o                    #
 * #                      88" . "88                    #
 * #                      (| -_- |)                    #
 * #                      0\  =  /0                    #
 * #                    ___/`---'\___                  #
 * #                  .' \\|     |# '.                 #
 * #                 / \\|||  :  |||# \                #
 * #                / _||||| -:- |||||- \              #
 * #               |   | \\\  -  #/ |   |              #
 * #               | \_|  ''\---/''  |_/ |             #
 * #               \  .-\__  '-'  ___/-. /             #
 * #             ___'. .'  /--.--\  `. .'___           #
 * #          ."" '<  `.___\_<|>_/___.' >' "".         #
 * #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #
 * #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #
 * #     =====`-.____`.___ \_____/___.-`___.-'=====    #
 * #                       `=---='                     #
 * #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #
 * #                                                   #
 * #               佛祖保佑         永无BUG            #
 * #                                                   #
 */

/**
 * @author 下一页5（轻飞扬）
 * 创建时间：2020/2/6 17:59
 * 个人小站：http://yhsh.wap.ai(已挂)
 * 最新小站：http://www.iyhsh.icoc.in
 * 联系作者：企鹅 13343401268
 * 博客地址：http://blog.csdn.net/xiayiye5
 * 项目名称：XiaYiYeLive
 * 文件包名：com.yhsh.xiayiyelive
 * 文件说明：
 */
public class LiveApplication extends Application {
    private static Application context;

    public static Application getInstance() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        // 获取到的 licence url  com.ying.miniVideo
//        String licenceUrl = "http://license.vod2.myqcloud.com/license/v1/b7d1ef62a6abce6ff59811c807eaf091/TXLiveSDK.licence";
        // 获取到的 licence key
//        String liceneKey = "92804b374db64907fc36726feb9bec54";

        String licenceUrl = "http://download-1252463788.cossh.myqcloud.com/xiaoshipin/licence_android/RDM_Enterprise.license";
        String licenseKey = "9bc74ac7bfd07ea392e8fdff2ba5678a";

        TXLiveBase.getInstance().setLicence(this, licenceUrl, licenseKey);
    }
}
