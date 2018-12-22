package com.foodie.data.feature.nearby

import com.foodie.data.config.di.kodeinInstance
import com.foodie.data.data.Logger
import com.foodie.data.data.api.FoodieApi
import com.foodie.data.data.api.RetrofitRunner
import com.foodie.data.entities.NearbyVenueEntry
import com.foodie.data.entities.Venue
import com.foodie.data.extensions.executeWithRetry
import com.foodie.data.mapper.NearbyApiMapper
import com.foodie.data.model.Result
import org.kodein.di.generic.instance

/**
 * @author Vipul Kumar; dated 21/12/18.
 *
 * Remote data source for nearby venues.
 */
class NearbyVenueDataSource {
    private val foodieApi: FoodieApi by kodeinInstance.instance()
    private val retrofitRunner: RetrofitRunner by kodeinInstance.instance()
    private val nearbyApiMapper: NearbyApiMapper by kodeinInstance.instance()
    private val logger: Logger by kodeinInstance.instance()

    suspend fun getVenues(
        latLong: String,
        page: Int
    ): Result<List<Pair<Venue, NearbyVenueEntry>>> {
        return retrofitRunner.executeForResponse(nearbyApiMapper) {
            foodieApi.fetchNearbyVenues(latLong, "food", page * 10, 1)
                .executeWithRetry()
        }
    }
}
