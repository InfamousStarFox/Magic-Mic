# Screen Stream over HTTP
An Android mobile app for viewing device screen in your web browser.

<a href='https://play.google.com/store/apps/details?id=info.dvkr.screenstream'>
<img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png' height="100"/></a>
<a href="https://f-droid.org/packages/info.dvkr.screenstream/" target="_blank">
<img src="https://f-droid.org/badge/get-it-on.png" alt="Get it on F-Droid" height="100"/></a>

The application allows viewing the device screen in your web browser.
The main idea is to show your device screen during presentations and demos.
No need of any additional software except for this app and a web browser.
No annoying ads or pop-ups.

Read this in other languages: [正體中文](README.zh-tw.md)

It uses MJPEG to encode screen images and send them through the network. So it works with any desktop or mobile browser which supports MJPEG (Chrome, Safari, EDGE, Firefox).

The application works via WiFi and/or 3G/LTE network.<br>
Fast and stable WiFi recommended because of high traffic and low network delay requirement.
No Internet required, however, there must be a network connection between the client and the device.

The number of client connections is unlimited, but be aware that each of them requires some CPU resources and bandwidth to send data.

Application uses Android Cast feature and requires at least Android 5.0 to run.

**WARNING:** This is not a real time streaming app. Expected delay is at least 0.5-1 second or more on slow devices, bad WiFi or on heavy CPU load by other apps.<br>
**WARNING:** This app is not designed for streaming video, especially HD video. Use Chromecast instead.<br>
**WARNING:** This app does NOT support SOUND streaming, because MJPEG does not support sound.<br>
**WARNING:** Some cell operators may block incoming connections to your device for security reasons, so, even if the device has an IP address from a cell operator, you may not be able to connect to the device on using this IP address.<br>
**WARNING:** Some WiFi networks (mostly public/guest) block connections between its clients for security reasons, so you may not be able to connect to the device via WiFi. For example, a laptop and a phone in this such a WiFi network will not be able to connect to each other.

### Known problems

1. On some devices, system returns image in unknown format. Mostly on devices with no official Android 5.0 or above. Possible Android bug. App will show an error message. No solution available.
2. On some devices no notification icon showing but notification is present. Android bug: 213309.
3. Browser MJPEG support check is inaccurate. You can disable it in application settings.

### Screenshots

![](screenshots/screenshot_1.png)&nbsp;
![](screenshots/screenshot_2.png)<br>
![](screenshots/screenshot_3.png)&nbsp;
![](screenshots/screenshot_4.png)<br>
![](screenshots/screenshot_5.png)&nbsp;
![](screenshots/screenshot_6.png)<br>
![](screenshots/screenshot_7.png)&nbsp;
![](screenshots/screenshot_8.png)

## Features and libraries

Version 2.x based on Clean Architecture, Android Architecture Components (ViewModel) and MVP pattern and uses:
* [Kotlin](https://kotlinlang.org)
* [Kotlin coroutines](https://github.com/Kotlin/kotlinx.coroutines)
* [Android support libraries](https://developer.android.com/topic/libraries/support-library/index.html)
* [Android Architecture Components](https://developer.android.com/topic/libraries/architecture/index.html) (ViewModel)
* [Koin](https://github.com/Ekito/koin)
* [RxJava 1.x](https://github.com/ReactiveX/RxJava/tree/1.x)
* [RxNetty](https://github.com/ReactiveX/RxNetty)
* [MaterialDrawer](https://github.com/mikepenz/MaterialDrawer)
* [Alerter](https://github.com/Tapadoo/Alerter)
* [Binary Preferences](https://github.com/iamironz/binaryprefs)
* [Color Picker](https://github.com/jrummyapps/colorpicker)
* [GraphView](https://github.com/appsthatmatter/GraphView)
* [Crashlytics](https://try.crashlytics.com/)
* [LeakCanary](https://github.com/square/leakcanary)


## Developed By

Dmitriy Krivoruchko - <dkrivoruchko@gmail.com>

If there are any issues or ideas feel free to contact me.

## License

```
The MIT License (MIT)

Copyright (c) 2016 Dmitriy Krivoruchko

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
