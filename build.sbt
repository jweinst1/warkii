import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.jweinst",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "warkii",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.twitter4j" % "twitter4j-core" % "3.0.3"
  )
