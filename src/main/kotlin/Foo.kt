package com.test

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Foo(val id: String)
