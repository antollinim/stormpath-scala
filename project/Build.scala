import sbt._


object StormpathScalaBuild extends Build {

  val appName         = "stormpath-scala"

  val appVersion      = "1.0"

  lazy val root = Project(id = "stormpath-scala-root", base = file(".")) aggregate(core)

  lazy val core = Project(id = "stormpath-scala-core", base = file("core"))

}