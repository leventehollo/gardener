name := """gardener"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  //javaJdbc,
  cache,
  javaWs,
  "com.google.firebase"	% "firebase-admin"	% "4.1.0"
)
