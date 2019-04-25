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
    private String registrationCenterId = "";
    private String ecNumber = "";
    private String statusCode = "";
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
    private String preRegistrationId = "";
    private String preRegistrationCenterId = "";

    // required in create pre-registration api
    private String preferredLang = "";
    private String defaultLang = "";
    private String dateOfBirth = "";
    private String addressLine1 = "";
    private String addressLine2 = "";
    private String addressLine3 = "";
    private String region = "";
    private String province = "";
    private String city = "";
    private String localAdministrativeAuthority = "";
    private String idSchemaVersion = "";
    private String cnieNumber = "";
    private String postalCode = "";
    private String langCode = "ENG";

    private ArrayList<String> docTypeList;
    private ProofDocument proofOfAddress = null;
    private ProofDocument proofOfBirth = null;
    private ProofDocument proofOfIdentity = null;
    private ProofDocument proofOfRelationship = null;
    private ProofDocument proofOfException = null;
    private ProofDocument proofOfExemption = null;

    private String uin = "";
    private List<String> vids = new ArrayList<String>();
    private boolean hasBiometricException = false;

    private ArrayList<String> bioCaptureList;
    private Biometrics thumbs = null;
    private Biometrics leftSlap = null;
    private Biometrics rightSlap = null;
    private Biometrics leftIris = null;
    private Biometrics rightIris = null;
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
        this.personaDef.residenceStatus = p;
    }

    public void setRole(PersonaDef.ROLE p) {
        this.personaDef.role = p;
    }

    public String getGender() {
        return personaDef.gender.toString();
    }

    public String getResidenceStatus() {
        return personaDef.residenceStatus.toString();
    }

    public String getRole() {
        return personaDef.role.toString();
    }
}
