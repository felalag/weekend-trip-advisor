package pl.weekend.trip.advisor.settings

import org.jooq.DSLContext
import org.jooq.generated.tables.references.SETTINGS
import org.springframework.stereotype.Repository

@Repository
class SettingRepository(private val dslContext: DSLContext) {

  fun getSettingByUserId(userId: Long) =
    dslContext.selectFrom(SETTINGS).where(SETTINGS.ID.eq(userId)).fetchOne()

  fun createSetting(setting: Setting) =
    dslContext.insertInto(SETTINGS)
      .columns(SETTINGS.USER_ID, SETTINGS.BASE_AIRPORT, SETTINGS.FLIGHT_PRICE_MAX, SETTINGS.DEPARTURE_DATE_IN_DAYS_MIN, SETTINGS.TRIP_LENGTH_IN_DAYS_MIN, SETTINGS.TRIP_LENGTH_IN_DAYS_MAX)
      .values(setting.userId, setting.baseAirport, setting.flightPriceMax, setting.departureDateInDaysMin, setting.tripLengthInDaysMin, setting.tripLengthInDaysMax)
      .execute()

  fun updateSetting(setting: Setting) =
    dslContext.update(SETTINGS)
      .set(SETTINGS.USER_ID, setting.userId)
      .set(SETTINGS.BASE_AIRPORT, setting.baseAirport)
      .set(SETTINGS.FLIGHT_PRICE_MAX, setting.flightPriceMax)
      .set(SETTINGS.DEPARTURE_DATE_IN_DAYS_MIN, setting.departureDateInDaysMin)
      .set(SETTINGS.TRIP_LENGTH_IN_DAYS_MIN, setting.tripLengthInDaysMin)
      .set(SETTINGS.TRIP_LENGTH_IN_DAYS_MAX, setting.tripLengthInDaysMax)
      .execute()

  fun deleteSetting(setting: Setting) =
    dslContext.deleteFrom(SETTINGS).where(SETTINGS.ID.eq(setting.userId)).execute()
}
