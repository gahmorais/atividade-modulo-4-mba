package br.com.gabrielmorais.modulo_iv.data.remote

import br.com.gabrielmorais.modulo_iv.data.remote.dto.AlunoRequestDTO
import br.com.gabrielmorais.modulo_iv.data.remote.dto.AlunoResponseDTO
import br.com.gabrielmorais.modulo_iv.data.remote.dto.MessageDTO
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface IAlunoRepository {
  @GET("/alunos")
  fun listarAlunos(): Call<List<AlunoResponseDTO>>

  @GET("/alunos/{id}")
  fun listarAlunoPorId(@Path("id") id: String): Call<AlunoResponseDTO>

  @POST("/alunos")
  fun cadastrarAluno(@Path("id") id: String, @Body aluno: AlunoRequestDTO): Call<AlunoResponseDTO>

  @PUT("/alunos/{id}")
  fun alterarAluno(@Path("id") id: String, @Body aluno: AlunoRequestDTO): Call<AlunoResponseDTO>

  @DELETE("/alunos/{id}")
  fun <T> excluirAluno(@Path("id") id: String): Call<Response<T>>

  @GET("/helloworld")
  fun helloWorld(): Call<MessageDTO>
}