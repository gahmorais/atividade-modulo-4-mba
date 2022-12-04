package br.com.gabrielmorais.modulo_iv.data.remote

import br.com.gabrielmorais.modulo_iv.data.remote.dto.AlunoRequestDTO
import br.com.gabrielmorais.modulo_iv.data.remote.dto.AlunoResponseDTO
import br.com.gabrielmorais.modulo_iv.data.remote.dto.MessageDTO
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Path

class AlunoRepository : IAlunoRepository {
  override fun listarAlunos(): Call<List<AlunoResponseDTO>> {
    TODO("Not yet implemented")
  }

  override fun listarAlunoPorId(@Path(value = "id") id: String): Call<AlunoResponseDTO> {
    TODO("Not yet implemented")
  }

  override fun cadastrarAluno(
    @Path(value = "id") id: String,
    @Body aluno: AlunoRequestDTO
  ): Call<AlunoResponseDTO> {
    TODO("Not yet implemented")
  }

  override fun alterarAluno(
    @Path(value = "id") id: String,
    @Body aluno: AlunoRequestDTO
  ): Call<AlunoResponseDTO> {
    TODO("Not yet implemented")
  }

  override fun <T> excluirAluno(@Path(value = "id") id: String): Call<Response<T>> {
    TODO("Not yet implemented")
  }

  override fun helloWorld(): Call<MessageDTO> {
    TODO("Not yet implemented")
  }
}