plugins {
    java
    id("org.javamodularity.moduleplugin") version "1.4.1" apply false
}

allprojects {
    group = "io.github.mwkroening.badassjlinkmissingjar"
    version = "0.1-SNAPSHOT"
}

subprojects {
    apply(plugin = "org.javamodularity.moduleplugin")
}
