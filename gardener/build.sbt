name := """gardener"""
version := "1.0-SNAPSHOT"
maintainer in Linux := "Levente Holló <levente@hollo.cc>"
packageSummary in Linux := "Gardener App"
packageDescription := "Keep track of your seeds"

lazy val root = (project in file(".")).enablePlugins(PlayJava, DebianPlugin)

scalaVersion := "2.11.8"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
scalacOptions += "-target:jvm-1.8"

libraryDependencies ++= Seq(
  cache,
  javaWs,
  "com.google.firebase"	% "firebase-admin"	% "4.1.0"
)


