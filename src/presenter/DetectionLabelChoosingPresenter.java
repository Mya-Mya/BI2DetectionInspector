package presenter;

import iview.IDetectionLabelChoosingView;
import model.Inspection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DetectionLabelChoosingPresenter {
    private IDetectionLabelChoosingView view;
    private Inspection inspection;

    public DetectionLabelChoosingPresenter(IDetectionLabelChoosingView view, Inspection inspection) {
        this.view = view;
        this.inspection = inspection;
        Set<String> detectionLabelSet = inspection.getDetectionLabelSet();
        view.setLabelTextList(new ArrayList<String>(detectionLabelSet));
    }

    public void onDetectionLabelChosen(String targetLabel) {
        view.gotoInspectingView(inspection,targetLabel);
    }

}
