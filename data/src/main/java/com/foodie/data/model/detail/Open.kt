package com.foodie.data.model.detail

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Open {

    @SerializedName("renderedTime")
    @Expose
    var renderedTime: String? = null
}
