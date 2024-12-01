package pl.weekend.trip.advisor.users

import org.jooq.DSLContext
import org.jooq.generated.Tables.USERS
import org.springframework.stereotype.Repository

@Repository
class UserRepository(private val dslContext: DSLContext) {

  fun getUserById(id: Long) =
    dslContext.selectFrom(USERS).where(USERS.ID.eq(id)).fetchOne()

  fun createUser(user: User) =
    dslContext
      .insertInto(USERS)
      .columns(USERS.NAME, USERS.PASSPORT_CODE)
      .values(user.name, user.passportCode)
      .execute()

  fun updateUser(user: User) =
    dslContext.update(USERS)
      .set(USERS.NAME, user.name)
      .set(USERS.PASSPORT_CODE, user.passportCode)
      .where(USERS.ID.eq(user.id))
      .execute()

  fun deleteUser(user: User) =
    dslContext.deleteFrom(USERS)
      .where(USERS.ID.eq(user.id))
      .execute()
}
