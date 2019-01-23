package com.hx.tutorial.user.service

import com.hx.tutorial.user.User

/**
 * Created by tony on 2018/11/13.
 */
interface IUserService {
    fun getUser(username: String): User
    fun createUser(username: String,password: String)
}