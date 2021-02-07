package ro.dobrescuandrei.openpdfandroidsample;

import android.app.Application;

public class App extends Application
{
    static
    {
        //System.loadLibrary("jpegdecoder");
        System.loadLibrary("lcmm");
    }
}
