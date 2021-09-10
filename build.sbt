name := "udemy-akka-essentials"

version := "0.1"

scalaVersion := "2.12.14"

version := "0.1"

val akkaVersion = "2.6.16"
val scalaTestVersion = "3.2.9"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion,
)