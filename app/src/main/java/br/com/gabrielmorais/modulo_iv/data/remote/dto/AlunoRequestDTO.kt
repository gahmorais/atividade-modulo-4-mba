package br.com.gabrielmorais.modulo_iv.data.remote.dto

import java.time.LocalDate

data class AlunoRequestDTO(
  private val nome: String,
  private val sobreNome: String,
  private val nascimento: LocalDate,
)