/**
  * Build configurations.
  */

lazy val commonSettings : Seq[Setting[_]] = Seq(
  organization := "org.augustushwang",
  version := "0.0.1",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "pyminer",
    showTiming := false,
    showSuccess := false
  )

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.4.0",
  "commons-io" % "commons-io" % "2.4",
  "org.apache.commons" % "commons-lang3" % "3.4",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.7.3",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.7.3",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.3",
  "com.google.code.gson" % "gson" % "2.6.2"
)

resolvers += Resolver.sonatypeRepo("public")
