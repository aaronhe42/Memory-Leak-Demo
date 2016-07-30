# Memory-Leak-Demo
This repo is to show how to use LeakCanary or Android Studio Memory Monitor for detecting memory leaks.

The `LeakActivity` has a long running `Observable` keeps emitting data even when the activity is destroyed. Thus it would cause memory leak.
To fix it, unsubscribe the subscription when `onDestroy`.
