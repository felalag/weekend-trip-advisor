package pl.weekend.trip.advisor

import io.r2dbc.spi.ConnectionFactory
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.r2dbc.connection.TransactionAwareConnectionFactoryProxy

@Configuration
class JooqConfig

@Bean
fun dslContext(connectionFactory: ConnectionFactory) =
  DSL.using(TransactionAwareConnectionFactoryProxy(connectionFactory), SQLDialect.MYSQL)
