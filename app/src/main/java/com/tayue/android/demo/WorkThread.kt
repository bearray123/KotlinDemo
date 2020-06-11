/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.tayue.android.demo

/**
 * Created by xionglei01@baidu.com on 2019-09-11.
 */

class WorkThread(name: String?) : Thread(name) {

    override fun run() {
        val i: Int = 0
        while (i < 10) {
            print(" run i = " + i++)
        }
    }


    fun getResult(): Product? {
        if (Thread.currentThread().name.equals("main")) {
            return Product("xiaodu-zhijia",59.99f)
        } else {
            return null
        }
    }


}
