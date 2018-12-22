package com.foodie.data.model.detail

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Likes_ {

    @SerializedName("count")
    @Expose
    var count: Int? = null
    @SerializedName("groups")
    @Expose
    var groups: List<Group____>? = null
    @SerializedName("summary")
    @Expose
    var summary: String? = null
}
