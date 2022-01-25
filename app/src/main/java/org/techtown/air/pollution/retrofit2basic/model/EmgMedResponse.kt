package org.techtown.air.pollution.retrofit2basic.model


import com.squareup.moshi.Json

data class EmgMedResponse(
    @Json(name = "EmgMedInfo")
    val emgMedInfo: List<EmgMedInfo>?
)