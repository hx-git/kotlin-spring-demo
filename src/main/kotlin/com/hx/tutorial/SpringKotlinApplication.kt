package com.hx.tutorial

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


/**
 * Created by tony on 2018/11/13.
 * 开启事务驱动
 */
@SpringBootApplication
open class SpringKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinApplication::class.java, *args)
}
