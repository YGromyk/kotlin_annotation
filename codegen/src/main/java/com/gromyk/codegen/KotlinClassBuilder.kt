package com.gromyk.codegen

/**
 * Created by Yuriy Gromyk on 1/4/19.
 */

class KotlinClassBuilder
@JvmOverloads constructor(className: String, packageName: String, greeting: String? = "Hello") {
    private val contentTemplate = "package $packageName\nclass $className { \n\tfun greeting () = \"$greeting\"\n}"
    fun getContent() = contentTemplate
}