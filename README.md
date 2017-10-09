# KeyboardUtil

## Getting Started

This library using for control on softkeyboard hide and show ...

## Installing

We can install this library by using gradle

Step 1

```
allprojects {
	repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2

```
dependencies {
	        compile 'com.github.BondolTuon:KeyboardUtil:1.0.0'
	}
```

## Sample Using

```
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHideKeyboard.setOnClickListener {
            hideSoftKeyboard()
        }

        btnShowKeyboard.setOnClickListener {
            showSoftKeyboard(etKeyboard)
        }
    }
}

```

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="com.tuonbondol.testkeyboardutil.MainActivity">

    <EditText
        android:id="@+id/etKeyboard"
        android:layout_width="match_parent"
        android:layout_height="@dimen/edit_text_height"
        android:layout_margin="@dimen/dimen_10dp" />

    <Button
        android:id="@+id/btnHideKeyboard"
        android:layout_width="match_parent"
        android:focusable="true"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/dimen_10dp"
        android:text="@string/hide_keyboard" />

    <Button
        android:id="@+id/btnShowKeyboard"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/dimen_10dp"
        android:text="@string/show_keyboard" />
</LinearLayout>


```

## Min SDK Version

```
Support Min Sdk version >= 14

```

## Authors

* **Bondol Tuon** - [Bondol Tuon](https://github.com/BondolTuon)

See also the list of [contributors](https://github.com/BondolTuon/KeyboardUtil/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/BondolTuon/KeyboardUtil/blob/master/README.md) file for details
