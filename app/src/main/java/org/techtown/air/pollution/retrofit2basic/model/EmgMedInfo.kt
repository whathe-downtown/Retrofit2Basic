package org.techtown.air.pollution.retrofit2basic.model


import com.squareup.moshi.Json

data class EmgMedInfo(
    @Json(name = "head")
    val head: List<Head>?,
    @Json(name = "row")
    val row: List<Row>?
)