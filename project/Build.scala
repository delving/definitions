import sbt._
import Keys._

object DefinitionsBuild extends Build {

  val buildVersion = "1.0-SNAPSHOT"

  val delvingReleases = "Delving Releases Repository" at "http://development.delving.org:8081/nexus/content/repositories/releases"
  val delvingSnapshots = "Delving Snapshot Repository" at "http://development.delving.org:8081/nexus/content/repositories/snapshots"
  val delvingRepository = if (buildVersion.endsWith("SNAPSHOT")) delvingSnapshots else delvingReleases

  lazy val root = Project(
    id = "definitions",
    base = file(".")
  ).settings(
    organization := "eu.delving",

    version := buildVersion,

    publishTo := Some(delvingRepository),

    credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),

    publishMavenStyle := true,

    crossPaths := false
  )

}
