package com.foodie.data.model.detail

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class HereNow {

    @SerializedName("count")
    @Expose
    var count: Int? = null
    @SerializedName("summary")
    @Expose
    var summary: String? = null
    @SerializedName("groups")
    @Expose
    var groups: List<Group__>? = null
}
