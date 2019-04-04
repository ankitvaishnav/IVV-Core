package main.java.io.mosip.ivv.core.structures;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    public PersonaDef personaDef = null;

    public String name = "";
    public String userid = "";
    public String phone = "";
    public String email = "";
    public String otp = "";
    public String registration_center_id = "";
    public String ec_number = "";
    public String status_code = "";
    public String err = "";
    public String errorCode = "";
    public String status = "";
    public String message = "";
    public String resTime = "";
    public String resMsg = "";
    public String deletedBy = "";
    public String deletedDateTime = "";
    public String sourcePreRegId = "";
    public String sourceDocumnetId = "";
    public String destPreRegId = "";
    public String destDocumnetId = "";
    public String response = "";

    /* pre-reg store */
    public String pre_registration_id = "";
    public String pre_registration_status_code = "";
    public String pre_registration_document_id = "";
    public String pre_registration_document_responseMsg = "";

    // required in create pre-registration api
    public String preffered_lang = "";
    public String default_lang = "";
    public String date_of_birth = "";
    public String address_line_1 = "";
    public String address_line_2 = "";
    public String address_line_3 = "";
    public String region = "";
    public String province = "";
    public String city = "";
    public String local_administrative_authority = "";
    public String id_schema_version = "";
    public String cnie_number = "";
    public String postal_code = "";
    public String lang_code = "ENG";

    // document upload : request
    public String doc_cat_code = "";
    public String doc_typ_code = "";
    public String doc_file_format = "";

    public Persona() {
        personaDef = new PersonaDef();
    }

    public String getGender() {
        return personaDef.gender.toString();
    }

    public String getResidenceStatus() {
        return personaDef.residence_status.toString();
    }

    public String getRole() {
        return personaDef.role.toString();
    }

    public ProofDocument proof_of_address = null;
    public ProofDocument proof_of_date_of_birth = null;
    public ProofDocument proof_of_identity = null;
    public ProofDocument proof_of_relationship = null;
    public ProofDocument proof_of_exception = null;
    public ProofDocument proof_of_exemption = null;

    public String UIN = "";
    public List<String> VIDs = new ArrayList<String>();
    public String preferred_language = "en";
    public boolean has_biometric_exception = false;

    public Biometrics fingers;
    public Biometrics irises;
    public Biometrics face;

    public ArrayList<ProofDocument> documents;
    public ArrayList<Persona> persons;
}
