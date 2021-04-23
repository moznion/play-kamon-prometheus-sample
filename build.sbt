name := """play-java-hello-world-tutorial"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, JavaAgent)

scalaVersion := "2.13.5"
val kamonVersion = "2.1.15"

libraryDependencies += guice
libraryDependencies += ws
libraryDependencies += "io.kamon" %% "kamon-bundle" % kamonVersion
libraryDependencies += "io.kamon" %% "kamon-prometheus" % kamonVersion
