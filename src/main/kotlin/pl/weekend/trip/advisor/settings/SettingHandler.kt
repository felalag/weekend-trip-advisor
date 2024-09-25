package pl.weekend.trip.advisor.settings

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse

@Component
class SettingHandler(private val settingRepository: SettingRepository) {

  suspend fun getSetting(request: ServerRequest): ServerResponse {
    TODO()
  }

  suspend fun createSetting(request: ServerRequest): ServerResponse {
    TODO()
  }

  suspend fun updateSetting(request: ServerRequest): ServerResponse {
    TODO()
  }

  suspend fun deleteSetting(request: ServerRequest): ServerResponse {
    TODO()
  }
}
