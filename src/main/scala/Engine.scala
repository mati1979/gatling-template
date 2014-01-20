import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object Engine extends App {

	val props = new GatlingPropertiesBuilder
	props.dataDirectory("src/main/resources/data")
	props.resultsDirectory(IDEPathHelper.resultsDirectory.toString)
	props.requestBodiesDirectory(IDEPathHelper.requestBodiesDirectory.toString)
	props.binariesDirectory(IDEPathHelper.mavenBinariesDirectory.toString)

	Gatling.fromMap(props.build)
}