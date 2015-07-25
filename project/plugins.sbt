logLevel := Level.Warn

resolvers ++=  Seq( Resolver.sonatypeRepo("releases"), Resolver.sonatypeRepo("snapshots") )

addSbtPlugin("org.scrupal" % "scrupal-sbt-project" % "0.2.7-SNAPSHOT" )
