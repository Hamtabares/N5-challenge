package utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationData {
    private static final List<String> operationNameList = new ArrayList<>();

    public static void setDescriptionOpList(String SDescription) {
        operationNameList.add(SDescription);
    }

    public static List<String> getDescriptionOpList() {
        return operationNameList;
    }
}
