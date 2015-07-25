/**********************************************************************************************************************
 * This file is part of Scrupal, a Scalable Reactive Web Application Framework for Content Management                 *
 *                                                                                                                    *
 * Copyright (c) 2015, Reactific Software LLC. All Rights Reserved.                                                   *
 *                                                                                                                    *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     *
 * with the License. You may obtain a copy of the License at                                                          *
 *                                                                                                                    *
 *     http://www.apache.org/licenses/LICENSE-2.0                                                                     *
 *                                                                                                                    *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   *
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  *
 * the specific language governing permissions and limitations under the License.                                     *
 **********************************************************************************************************************/


import sbt._

/** Build Dependencies
  * This trait can be mixed in to get all of Scrupals repository resolvers and dependent libraries.
  */
trait Dependencies
{
  // val scrupal_org_releases    = "Scrupal.org Releases" at "http://scrupal.github.org/mvn/releases"
  val google_sedis            = "Google Sedis" at "http://pk11-scratch.googlecode.com/svn/trunk/"
  val jcenter_repo            = "JCenter" at "http://jcenter.bintray.com/"

//val scala_lang              = "Scala Language" at "http://mvnrepository.com/artifact/org.scala-lang/"
//val geolocation             = "geolocation repository" at "http://blabluble.github.com/modules/releases/"

  val all_resolvers : Seq[MavenRepository] = Seq (
    google_sedis, jcenter_repo
  )

  object Ver {
    val scala = "2.11.7"
    val play = "2.4.2"
    val akka = "2.3.11"
    val akka_http = "1.0-RC4"
    val kamon = "0.4.0"
  }

  val scala_fx                = "org.scalafx"               %% "scalafx"                  % "8.0.40-R8"

  // Things we borrow from Play Framework
  val play_anorm              = "com.typesafe.play"         %% "anorm"                    % Ver.play
  val play_cache              = "com.typesafe.play"         %% "play-cache"               % Ver.play
  val play_docs               = "com.typesafe.play"         %% "play-docs"                % Ver.play
  val play_filters            = "com.typesafe.play"         %% "filters-helpers"          % Ver.play
  val play_iteratees          = "com.typesafe.play"         %% "play-iteratees"           % Ver.play
  val play_jdbc               = "com.typesafe.play"         %% "play-jdbc"                % Ver.play
  val play_json               = "com.typesafe.play"         %% "play-json"                % Ver.play
  val play_ws                 = "com.typesafe.play"         %% "play-ws"                  % Ver.play

  // Play Plugins
  val mail_plugin             = "com.typesafe.play.plugins" %% "play-plugins-mailer"      % "3.0.1"
  val silhouette              = "com.mohiva"                %% "play-silhouette"          % "3.0.0-RC1"
  val play_plugins_redis      = "com.typesafe.play.modules" %% "play-modules-redis"       % "2.4.0"

  // Akka Stuff
  val akka_actor              = "com.typesafe.akka"         %% "akka-actor"               % Ver.akka
  val akka_slf4j              = "com.typesafe.akka"         %% "akka-slf4j"               % Ver.akka
  val akka_http               = "com.typesafe.akka"         %% "akka-http-experimental"   % "1.0-RC4"

  // Fundamental Libraries
  val shapeless               = "com.chuusai"               %% "shapeless"                % "2.2.1"
  val scala_arm               = "com.jsuereth"              %% "scala-arm"                % "1.4"
  val scala_compiler          = "org.scala-lang"            % "scala-compiler"            % Ver.scala

  // Database, Caches, Serialization, Data Storage stuff
  val rxmongo                 = "com.reactific"             %% "rxmongo"                  % "0.1.0-SNAPSHOT"
  val reactivemongo           = "org.reactivemongo"         %% "reactivemongo"            % "0.11.0-SNAPSHOT"
  val livestream_scredis      = "com.livestream"            %% "scredis"                  % "2.0.6"
  val scala_pickling          = "org.scala-lang.modules"    %% "scala-pickling"           % "0.10.1"
  val chill                   = "org.scrupal"               %% "chill"                    % "0.7.0-SNAPSHOT"

  // Hashing Algorithms
  val pbkdf2                  = "io.github.nremond"         %% "pbkdf2-scala"             % "0.4"
  val bcrypt                  = "org.mindrot"               % "jbcrypt"                   % "0.3m"
  val scrypt                  = "com.lambdaworks"           % "scrypt"                    % "1.4.0"

  // Kamon Monitoring
  // TODO: Utilize Kamon Monitoring
  val kamon_core              = "io.kamon"                  %% "kamon-core"                % Ver.kamon
  val kamon_scala             = "io.kamon"                  %% "kamon-scala"               % Ver.kamon
  val kamon_akka              = "io.kamon"                  %% "kamon-akka"                % Ver.kamon
  val kamon_log_reporter      = "io.kamon"                  %% "kamon-log-reporter"        % Ver.kamon
  val kamon_play              = "io.kamon"                  %% "kamon-play"                % Ver.kamon
  val kamon_system_metrics    = "io.kamon"                  %% "kamon-system_metrics"      % Ver.kamon
  val kamon_annotation        = "io.kamon"                  %% "kamon-annotation"          % Ver.kamon

  // Logging
  val grizzled_slf4j          = "org.clapper"               %% "grizzled-slf4j"           % "1.0.2"
  val logback_classic         = "ch.qos.logback"            %  "logback-classic"          % "1.1.3"

  // Miscellaneous
  val osgi_core               = "org.osgi"                  % "org.osgi.core"             % "6.0.0"
  val config                  =  "com.typesafe"             %  "config"                   % "1.3.0"
  val commons_lang3           = "org.apache.commons"        % "commons-lang3"             % "3.4"
  val hsp                     = "com.reactific"             %% "hotspot-profiler"         % "0.1.0-SNAPSHOT"
  // Test Libraries

//val icu4j                   = "com.ibm.icu"          % "icu4j"                  % "51.1"
//val geolocation             =  "com.edulify"        %% "geolocation"            % "1.1.0"


  object Test {
    val akka_testkit     = "com.typesafe.akka"        %% "akka-testkit"             % Ver.akka        % "test"
    val commons_io       = "commons-io"                %  "commons-io"              % "2.4"           % "test"
    val nu_validator     = "nu.validator.htmlparser"   % "htmlparser"               % "1.4"           % "test"
    val silhouette_test  = "com.mohiva"               %% "play-silhouette-testkit"  % "3.0.0-RC1"     % "test"
  }

  val root_dependencies : Seq[ModuleID] = Seq(
    logback_classic, scala_fx

  )

}
