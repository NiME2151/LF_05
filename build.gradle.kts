plugins {
    id("java")
}

group = "de.neuland"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
    implementation("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
