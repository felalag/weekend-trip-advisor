package pl.weekend.trip.advisor

data class Setting(
  val id: Long,
  val userId: Long,
  val baseAirport: String,
  val flightPriceMax: Int,
  val departureDateInDaysMin: Short,
  val tripLengthInDaysMin: Short,
  val tripLengthInDaysMax: Short,
)
