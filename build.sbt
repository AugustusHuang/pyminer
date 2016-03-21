/**
  * Build configurations.
  */

lazy val commonSettings : Seq[Setting[_]] = Seq(
  organization := "org.augustushwang",
  version := "0.0.1",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "pyminer",
    showTiming := false,
    showSuccess := false
  )
