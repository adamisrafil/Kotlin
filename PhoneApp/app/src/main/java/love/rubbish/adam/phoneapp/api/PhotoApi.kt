package love.rubbish.adam.phoneapp.api

import love.rubbish.adam.phoneapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoApi {
    @GET("?key=12737627-64d4db14da2b81dda3de922a6&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}