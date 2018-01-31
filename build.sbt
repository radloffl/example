lazy val root = (project in file("."))
  .settings(
    organization in ThisBuild := "com.banno",
    scalaVersion in ThisBuild := "2.11.11",
    version      in ThisBuild := "0.1.0-SNAPSHOT",
    name := "Hello",
    libraryDependencies ++= Seq(
      "eu.timepit" %% "refined" %  "0.8.6",
      "org.scalaz" %% "scalaz-core" % "7.2.18"
    )
  )
