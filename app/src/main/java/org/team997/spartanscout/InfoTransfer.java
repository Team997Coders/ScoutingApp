package org.team997.spartanscout;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.Gson;

import org.team997coders.spartanlib.scouting.DeepSpaceData;

import java.io.File;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class InfoTransfer {

    private static List<DeepSpaceData> data;

    public static void StoreData(DeepSpaceData dat) {
        data.add(dat);
    }

    public static void WrtieStoredData(Context context) {
        String directory = context.getExternalMediaDirs()[1].getPath() + "/matchData/";

        for (DeepSpaceData d : data) {
            File f = new File(directory, "M" + d.matchNumber + "T" + d.teamNumber + ".json");
            try {
                Gson g = new Gson();
                if (f.exists())
                    Toast.makeText(context, "You are overwriting data", Toast.LENGTH_LONG);
                f.createNewFile();
                FileWriter fw = new FileWriter(f);
                g.toJson(d, fw);
                fw.flush();
                fw.close();
                // t.setText(t.getText() + "\nFile:\n" + f.getPath());
                // Toast.makeText(getApplicationContext(), f.getAbsolutePath(), Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                // t.setText("Dir:\n" + directory + "M" + d.matchNumber + "T" + d.teamNumber + ".json");
                Toast.makeText(context, "E:" + e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

}
