import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    jacoco
    id("checkstyle")
    id("io.freefair.lombok") version "8.6"
    application
}
application { mainClass.set("hexlet.code.App") }
group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation("org.apache.commons:commons-collections4:4.4")
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("info.picocli:picocli:4.7.5")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.0")
}

tasks.test {
    useJUnitPlatform()
}