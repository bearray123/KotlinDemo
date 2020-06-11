/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.tayue.android.demo

/**
 *
 * 当Kotlin中的类需要构造函数时，可以有一个主构造函数和多个次构造函数，可以没有次构造函数。主构造函数在类名后。
 *
 * 主构造函数不能包含任何的代码。初始化的代码可以放到以 init 关键字作为前缀的初始化块中
 *
 * Created by xionglei01@baidu.com on 2019-09-11.
 */

class  Product/*(name:String? , price: Float?)*/ {

    val name: String? = null

    val price: Float? = null

    var lenth: Float? = null

    constructor()

    init {
        val lenth = 100f
        val wideth: Float? = null // 局部变量
    }

    fun setLenth() {
        this.lenth = 20f
    }

    fun test () {
        val lenth = 1f
    }



}