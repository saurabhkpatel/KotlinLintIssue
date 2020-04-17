package com.saurabhpatel.demolintcheck;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.saurabhpatel.testmodule.ApiVersionUtils;
import java.io.File;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    private static void getApplicationBytesFromOreo(@NonNull Context context, @NonNull File file) {
        final StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(Context.STORAGE_STATS_SERVICE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (ApiVersionUtils.hasOreo()) {
            getApplicationBytesFromOreo(this, new File("test"));
        } else {
            Log.d("TAG", "nothing to do here for pre Oreo");
        }
    }
}
