logLevel := Level.Warn

resolvers ++= Seq(
    DefaultMavenRepository,
    Resolver.file("localRepo", file("repository/local"))(Resolver.ivyStylePatterns),
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("play" % "sbt-plugin" % "2.0-RC1-SNAPSHOT")
