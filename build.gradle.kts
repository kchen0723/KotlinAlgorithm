plugins {
    kotlin("jvm") version "2.1.10"
}
//https://stackoverflow.com/questions/63989767/which-versions-of-kotlin-are-compatible-with-which-versions-of-java
//kotlin 2.1.10 use jvm 23.

group = "org.kchen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}