# Dots
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/tizisdeepan/dots.svg)](https://jitpack.io/#tizisdeepan/dots)

![Screenshot 2](https://github.com/tizisdeepan/dots/raw/master/screenshots/ss_gif.gif)
## What is Dots?
Dots is a library that helps in implementing a simple yet effective dots indicator for the View Pagers used in your android code. It combines the usage of observers and state drawables to indicate the current visible page's position in a view pager.

am not developing this library but i forked it, and migrate the library to androidX and viewpager2 library 

## Implementation
### [1] In your app module gradle file

``` groovy
dependencies {
    implementation 'com.github.kldMohammed:dots:0.1.0'
}
```

### [2] In your project level gradle file

``` groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### [3] Use DotsIndicator in your layout.xml
```xml
  <com.kldmohammed.dots.dotsindicator.DotsIndicator
                android:id="@+id/dotsIndicator"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginBottom="12dp"
                android:background="@drawable/dots_background"
                android:padding="6dp"
                app:dot_drawable="@drawable/ic_dot_darkgrey"
                app:dot_drawable_unselected="@drawable/ic_dot_lightgrey"
                app:dot_height="8dp"
                app:dot_margin="6dp"
                app:dot_width="8dp" />
```



## Documentation
### XML
1. `dot_drawable`: Drawable that is used to indicated the current selected page
2. `dot_drawable_unselected`: Drawable that is used to indicated the unselected pages
3. `dot_height`: Height of the Dot indicator in dp
4. `dot_width`: Width of the Dot indicator in dp
5. `dot_margin`: Marginal spaces between the Dots



Voila! You have implemented a simple Dots indicator for your View Pager now!

Check out this medium publication: https://medium.com/@tizisdeepan/android-dots-indicator-a093d9dc3f5f

Original Developed By
------------

* Deepan Elango - <tizisdeepan@gmail.com>

https://github.com/tizisdeepan/dots

Developed By
------------
I Edit the library to support view pager 2


<a href="https://twitter.com/tizisdeepan">
  <img alt="Follow me on Twitter" src="./screenshots/twitter.png" />
</a>
<a href="https://www.linkedin.com/in/tizisdeepan/">
  <img alt="Add me to Linkedin" src="./screenshots/linkedin.png" />
</a>

## License
This library falls under [Apache v2](https://github.com/tizisdeepan/dots/blob/master/LICENSE)
