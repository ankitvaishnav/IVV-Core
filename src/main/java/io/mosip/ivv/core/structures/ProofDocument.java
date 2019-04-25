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
    private DOCUMENT_CATEGORY doc_cat_code = DOCUMENT_CATEGORY.POI;
    private String doc_type_code = "";
    private String doc_file_format = "";
    private String doc_id = "";
    private String name = "";
    private String file = "";
    private ArrayList<String> tags = new ArrayList();
}
