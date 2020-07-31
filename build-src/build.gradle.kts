plugins {
    `java-gradle-plugin`
}

gradlePlugin {
    val greeting by plugins.creating {
        id = "com.example.buildsrc.HelloPlugin"
        implementationClass = "com.example.buildsrc.HelloPlugin"
    }
}