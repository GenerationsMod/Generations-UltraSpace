import net.fabricmc.loom.api.LoomGradleExtensionAPI

plugins {
    id("architectury-plugin") version "3.4-SNAPSHOT"
    id("dev.architectury.loom") version "1.2-SNAPSHOT" apply false
    idea
    java
}

val minecraftVersion = project.properties["minecraft_version"] as String

architectury.minecraft = minecraftVersion

subprojects {
    apply(plugin = "dev.architectury.loom")

    val loom = project.extensions.getByName<LoomGradleExtensionAPI>("loom")

    dependencies {
        "minecraft"("com.mojang:minecraft:$minecraftVersion")
        "mappings"(loom.officialMojangMappings())
    }

    loom.silentMojangMappingsLicense()
}

allprojects {
    apply(plugin = "java")
    apply(plugin = "architectury-plugin")
    apply(plugin = "maven-publish")
    apply(plugin = "idea")

    version = project.properties["mod_version"] as String
    group = project.properties["maven_group"] as String

    tasks.withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.release.set(17)
    }

    java.withSourcesJar()
}

