package br.com.gabrielmorais.modulo_iv.data.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

  companion object {
    private var instance: RetrofitClient? = null
  }

  private var alunoRepository: IAlunoRepository

  init {
    val retrofit = Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create())
      .baseUrl("http://igtiandroid.ddns.net:8080")
      .client(createOkHttpClient())
      .build()
    alunoRepository = retrofit.create(IAlunoRepository::class.java)
  }

  private fun createOkHttpClient() = OkHttpClient.Builder()
    .connectTimeout(15, TimeUnit.SECONDS)
    .readTimeout(15, TimeUnit.SECONDS)
    .writeTimeout(15, TimeUnit.SECONDS)
    .addInterceptor(HttpLoggingInterceptor { message ->
      println("LOG APP: $message")
    }.apply {
      level = HttpLoggingInterceptor.Level.BODY
    })
    .addNetworkInterceptor(HttpLoggingInterceptor { message ->
      println("LOG NTW: $message")
    }.apply {
      level = HttpLoggingInterceptor.Level.BODY
    })
    .build()

  @Synchronized
  fun getInstance(): RetrofitClient {
    if(instance == null){
      instance = RetrofitClient()
    }
    return instance as RetrofitClient
  }

  fun getAlunoApi() = alunoRepository
}