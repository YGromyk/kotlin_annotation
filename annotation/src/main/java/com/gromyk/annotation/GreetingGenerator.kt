package com.gromyk.annotation

/**
 * Created by @author(Yuriy Gromyk) on 1/4/19.
 */

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class GreetingGenerator(val greeting: String)