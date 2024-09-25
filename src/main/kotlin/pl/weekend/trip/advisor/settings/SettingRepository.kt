package pl.weekend.trip.advisor.settings

import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class SettingRepository(private val dslContext: DSLContext) {

  fun getSettingByUserId(userId: Long): Setting? {
    TODO()
  }

  fun createSetting(setting: Setting): Setting {
    TODO()
  }

  fun updateSetting(setting: Setting): Setting {
    TODO()
  }

  fun deleteSetting(setting: Setting): Setting {
    TODO()
  }
}
