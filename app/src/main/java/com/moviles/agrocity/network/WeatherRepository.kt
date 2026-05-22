package com.moviles.agrocity.network

import com.moviles.agrocity.BuildConfig
import com.moviles.agrocity.models.WeatherResponse
import com.moviles.agrocity.network.WeatherApiService.WeatherRetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WeatherRepository {

    private val api = WeatherRetrofitInstance.api
    private val apiKey = BuildConfig.WEATHER_API_KEY

    suspend fun getCurrentWeather(lat: String, lon: String): Result<WeatherResponse> {
        val location = "$lat,$lon"
        return try {
            val response = withContext(Dispatchers.IO) {
                api.getCurrentWeather(apiKey, location)
            }
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

}
