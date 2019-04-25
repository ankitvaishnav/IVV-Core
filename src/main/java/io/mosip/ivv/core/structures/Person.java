package main.java.io.mosip.ivv.core.structures;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Person {
    private PersonaDef personaDef = null;
    private String name = "";
    private String userid = "";
    private String phone = "";
    private String email = "";
    private String otp = "";
    private String registration_center_id = "";
    private String ec_number = "";
    private String status_code = "";
    private String err = "";
    private String errorCode = "";
    private String status = "";
    private String message = "";
    private String resTime = "";
    private String resMsg = "";
    private String deletedBy = "";
    private String deletedDateTime = "";
    private String sourcePreRegId = "";
    private String sourceDocumnetId = "";
    private String destPreRegId = "";
    private String destDocumnetId = "";
    private String response = "";

    /* pre-reg store */
    private String pre_registration_id = "";
    private String pre_registration_status_code = "";

    // required in create pre-registration api
    private String preffered_lang = "";
    private String default_lang = "";
    private String date_of_birth = "";
    private String address_line_1 = "";
    private String address_line_2 = "";
    private String address_line_3 = "";
    private String region = "";
    private String province = "";
    private String city = "";
    private String local_administrative_authority = "";
    private String id_schema_version = "";
    private String cnie_number = "";
    private String postal_code = "";
    private String lang_code = "ENG";

    private ProofDocument proof_of_address = null;
    private ProofDocument proof_of_date_of_birth = null;
    private ProofDocument proof_of_identity = null;
    private ProofDocument proof_of_relationship = null;
    private ProofDocument proof_of_exception = null;
    private ProofDocument proof_of_exemption = null;

    private String UIN = "";
    private List<String> VIDs = new ArrayList<String>();
    private String preferred_language = "en";
    private boolean has_biometric_exception = false;

    private Biometrics thumbs = null;
    private Biometrics left_slap = null;
    private Biometrics right_slap = null;
    private Biometrics left_iris = null;
    private Biometrics right_iris = null;
    private Biometrics face = null;

    @Deprecated
    public ArrayList<ProofDocument> documents;

    public Person() {
        personaDef = new PersonaDef();
    }

    public void setGender(PersonaDef.GENDER p) {
        this.personaDef.gender = p;
    }

    public void setResidenceStatus(PersonaDef.RESIDENCE_STATUS p) {
        this.personaDef.residence_status = p;
    }

    public void setRole(PersonaDef.ROLE p) {
        this.personaDef.role = p;
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
}
