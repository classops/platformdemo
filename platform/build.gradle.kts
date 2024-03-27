plugins {
    id("java-platform")
}

javaPlatform.allowDependencies()

dependencies {

    constraints {
        api("androidx.core:core-ktx:1.10.1")
        api("androidx.appcompat:appcompat:1.6.1")
        api("com.google.android.material:material:1.8.0")
        api("junit:junit:4.13.2")
        api("androidx.test.ext:junit:1.1.5")
        api("androidx.test.espresso:espresso-core:3.5.1")
    }
}
