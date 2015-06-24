# Android Project Template

Onebit Android Project Template

## Included stuffs

### EditorConfig

No more tab vs space debate, it's enforced by configuration. The configuration is stored in `.editorconfig` on the project root. Newest Android Studio already have native support for EditorConfig. 

### Logging

Use `Timber.d(message)` instead of `Log.d(TAG, message)`. It's automatically tagged and has similar style with `String.format()`

### Report the number of method references in your APK on every build.

Provided by [Dex count plugin](https://android-arsenal.com/details/1/1940). 

### Code quality checking

CheckStyle and PMD included.

To do all checks, run:

```
./gradlew check
```

## Other libraries

* Butterknife
* OkHttp
* Picasso
* LeakCanary
