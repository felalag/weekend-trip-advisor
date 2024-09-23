package pl.weekend.trip.advisor

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class SettingRouter {
  @Bean
  fun route(settingHandler: SettingHandler) = coRouter {
    accept(APPLICATION_JSON).nest {
      GET("/settings/{id}", settingHandler::getSetting)
      POST("/settings", settingHandler::createSetting)
      PUT("/settings/{id}", settingHandler::updateSetting)
      DELETE("/settings/{id}", settingHandler::deleteSetting)
    }
  }
}
