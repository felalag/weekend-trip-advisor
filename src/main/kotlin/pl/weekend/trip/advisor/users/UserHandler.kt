package pl.weekend.trip.advisor.users

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse

@Component
class UserHandler(private val userRepository: UserRepository) {
  suspend fun getUser(request: ServerRequest): ServerResponse {
    TODO()
  }

  suspend fun createUser(request: ServerRequest): ServerResponse {
    TODO()
  }

  suspend fun updateUser(request: ServerRequest): ServerResponse {
    TODO()
  }

  suspend fun deleteUser(request: ServerRequest): ServerResponse {
    TODO()
  }
}
