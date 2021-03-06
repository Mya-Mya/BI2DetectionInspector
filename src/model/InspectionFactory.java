package model;

import java.io.File;
import java.util.List;

public class InspectionFactory {
    /**
     * @param detectionDir 検出情報が含まれるディレクトリ
     * @param imageDir     検証・未訂正の画像が含まれるディレクトリ
     * @return inspection
     */
    public static Inspection createInspection(File detectionDir, File imageDir) {
        ImageDatabase imageDatabase = new ImageDatabase(imageDir);
        DetectionDatabase detectionDatabase = new DetectionDatabase(detectionDir);
        Inspection inspection = new Inspection(
                detectionDatabase.getDetectionInfoList(),
                imageDatabase.getImageInfoList(),
                detectionDatabase.getDetectionLabelSet()
        );
        return inspection;
    }
}
