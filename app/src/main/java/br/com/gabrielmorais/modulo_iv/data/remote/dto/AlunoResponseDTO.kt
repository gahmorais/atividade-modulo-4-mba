package br.com.gabrielmorais.modulo_iv.data.remote.dto

import java.time.LocalDate
import java.time.LocalDateTime

data class AlunoResponseDTO(
  private val id: String,
  private val nome: String,
  private val sobreNome: String,
  private val nascimento: LocalDate,
  private val cadastro: LocalDateTime
)