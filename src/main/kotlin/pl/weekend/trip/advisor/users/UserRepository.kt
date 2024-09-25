package pl.weekend.trip.advisor.users

import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class UserRepository(private val dslContext: DSLContext) {

  fun getUserById(id: Long): User? {
    TODO()
  }

  fun createUser(user: User): User {
    TODO()
  }

  fun updateUser(user: User): User {
    TODO()
  }

  fun deleteUser(user: User): User {
    TODO()
  }
}
