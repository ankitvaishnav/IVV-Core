package main.java.io.mosip.ivv.core.structures;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ProofDocument {

    private enum DOCUMENT_CATEGORY {POA, POB, POI, POE, POR};
    @Deprecated
    private String path = "";
    private DOCUMENT_CATEGORY docCatCode = DOCUMENT_CATEGORY.POI;
    private String docTypeCode = "";
    private String docFileFormat = "";
    private String docId = "";
    private String name = "";
    private String file = "";
    private ArrayList<String> tags = new ArrayList();
}
