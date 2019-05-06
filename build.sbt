sbtPlugin := true

name := "sbt-testlogconfig"

organization := "de.wayofquality.sbt"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

version := "0.1.0"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-encoding", "UTF-8"
)

