libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value % Provided

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % Test

libraryDependencies += "com.github.mpilquist" %% "simulacrum" % "0.8.0"

