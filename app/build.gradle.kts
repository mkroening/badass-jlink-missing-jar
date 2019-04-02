plugins {
    application
    id("org.beryx.jlink") version "2.8.0"
}

dependencies {
    implementation(project(":core"))
}

application.mainClassName = "$moduleName/io.github.mwkroening.badassjlinkmissingjar.app.Launcher"
