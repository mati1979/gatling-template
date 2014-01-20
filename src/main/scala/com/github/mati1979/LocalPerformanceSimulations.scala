package com.github.mati1979

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import bootstrap._

object LocalPerformanceSimulations {

  class PlayTest extends Simulation {

    val playTest = scenario("PlayTest").during(1 minutes) {
      exec(http("PlayTest").get("/"))
    } inject(atOnce(100 users))

    setUp(
      playTest
    )
      .protocols(http.baseURL("http://localhost:9000"))
    //.assertions(global.responseTime.max.lessThan(100))
  }

}
