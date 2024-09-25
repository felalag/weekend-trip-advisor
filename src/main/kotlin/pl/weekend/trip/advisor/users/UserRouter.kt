package pl.weekend.trip.advisor.users

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class UserRouter {
  @Bean
  fun route(userHandler: UserHandler) = coRouter {
    accept(APPLICATION_JSON).nest {
      GET("/users/{id}", userHandler::getUser)
      POST("/users", userHandler::createUser)
      PUT("/users/{id}", userHandler::updateUser)
      DELETE("/users/{id}", userHandler::deleteUser)
    }
  }
}
