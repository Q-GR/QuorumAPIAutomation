package Services;

public class BaseEndpoint {

    // AWS Non Prod for P2P
    public String baseIdentityServerUrl = "http://10.18.5.149/GRAPIServices.IdentityServer_deploy";
    public String baseP2PApiUrl = "http://10.18.5.149/GRAPIServices.Peer2Peer_deploy";
    public String ClientId = "099153c2625149bc8ecb3e85e03f0022";
    public String resourceLoginAndGetJWT = "/grsecurity/token";
    public String resourceGetIndividuals = "/api/Individuals/";

    // GRAPIServices.PACCDataLink
    public String basePACCDataLinkUrl = "http://10.18.5.149/GRAPIServices.PACCDataLink_deploy";

    // GRAPIServices.PACCDataLink Company
    public String resourceGetCompany = "/api/datalink/get";

    // GRAPIServices.PACCDataLink Organization
    public String resourceGetPACCOrganizations ="/api/datalink/organization/getall";
    public String resourceAddNewPACCOrganization ="/api/datalink/organization/add";
    public String resourceUpdatePACCOrganization ="/api/datalink/organization/edit/";
    public String resourceDeletePACCOrganization ="/api/datalink/organization/delete/";
    public String resourceGetSinglePACCOrganization ="/api/datalink/organization/get/";

    // GRAPIServices.PACCDataLink PAC
    public String resourceGetListOfPACs = "/api/datalink/pac/getall";
    public String resourceGetSinglePAC = "/api/datalink/pac/get/";
    public String resourceAddNewPACCPAC = "/api/datalink/pac/add";
    public String resourceUpdatePACCPAC = "/api/datalink/pac/edit/";
    public String resourceDeletePACCPAC = "/api/datalink/pac/delete/";

    // GRAPIServices.PACCDataLink PACAccount
    public String resourceGetListOfPACAccounts = "/api/datalink/pacaccount/getall";
    public String resourceGetSinglePACAccount = "/api/datalink/pacaccount/get/";
    public String resourceAddSinglePACAccount = "/api/datalink/pacaccount/add";
    public String resourceUpdatePACAccount = "/api/datalink/pacaccount/edit/";
    public String resourceDeletePACCPACAccount = "/api/datalink/pacaccount/delete/";

    // GRAPIServices.PACCDataLink PACReportMaster
    public String resourceGetListOfPACReportMasterRecords = "/api/datalink/pacreportmaster/getall";
    public String resourceGetSinglePACReport = "/api/datalink/pacreportmaster/get/";
    public String resourceEditSinglePACReport = "/api/datalink/pacreportmaster/edit/";
    public String resourceAddNewPACCPACReport = "/api/datalink/pacreportmaster/add";
    public String resourceDeletePACCPACReport = "/api/datalink/pacreportmaster/delete/";

    // GRAPIServices.PACCDataLink userAccount
    public String resourcePACCUserAccounts = "/api/datalink/useraccount/getall";
    public String resourceAddNewUserAccount = "/api/datalink/useraccount/add";
    public String resourceDeleteUserAccount = "/api/datalink/useraccount/delete/";
    public String resourceUpdateUserAccount = "/api/datalink/useraccount/edit/";
    public String resourcePACCUserAccount = "/api/datalink/useraccount/get/";

    // GRAPIServices.PACCDataLink PAC Organizations
    public String resourceGetListOfPACOrgs = "/api/datalink/pacorganization/getall";
    public String resourceAddNewPACOrgs =  "/api/datalink/pacorganization/add";
    public String resourceGetSinglePACOrgs = "/api/datalink/pacorganization/get/";
    public String resourceUpdatePACOrgs = "/api/datalink/pacorganization/edit/";
    public String resourceDeletePACCPACOrgs = "/api/datalink/pacorganization/delete/";

    // GRAPIServices.PACCDataLink StateReportJob
    public String resourceGetJobStatusByJobActionID = "/api/statereport/getjobstatus/";
    public String resourceExecuteJob = "/api/statereport/executejob";

    // GRAPIServices.PACCDataLink Individual
    public String resourceGetListOfIndividualRecords = "/api/datalink/individual/getall";
    public String resourceGetSingleIndividual = "/api/datalink/individual/get/";
    public String resourceAddIndividual = "/api/datalink/individual/add";
    public String resourceUpdateSingleIndividual = "/api/datalink/individual/edit/";
    public String resourceDeleteIndividual = "/api/datalink/individual/delete/";

    // GRAPIServices.PACCDataLink PACBankAccount
    public String resourceGetListOfPACBankAccounts = "/api/datalink/pacbankaccount/getall";
    public String resourceGetSinglePACBankAccount = "/api/datalink/pacbankaccount/get/";
    public String resourceAddSinglePACBankAccount = "/api/datalink/pacbankaccount/add";
    public String resourceUpdatePACBankAccount = "/api/datalink/pacbankaccount/edit/";
    public String resourceDeletePACCPACBankAccount = "/api/datalink/pacbankaccount/delete/";

    // GRAPIServices.PACCDataLink PACTransaction
    public String resourceGetListOfPACTransactions = "/api/datalink/pactransaction/getall";
    public String resourceGetSinglePACTransaction = "/api/datalink/pactransaction/get/";
    public String resourceAddSinglePACTransaction = "/api/datalink/pactransaction/add";
    public String resourceEditPACTransaction = "/api/datalink/pactransaction/edit/";
    public String resourceDeleteSinglePACTransaction = "/api/datalink/pactransaction/delete/";

    // GRAPIServices.PACCDataLink PACJurisdiction
    public String resourceGetListOfPACJurisdictions = "/api/datalink/pacjurisdiction/getall";
    public String resourceGetSinglePACJurisdiction = "/api/datalink/pacjurisdiction/get/";
    public String resourceAddSinglePACJurisdiction = "/api/datalink/pacjurisdiction/add";
    public String resourceEditPACJurisdiction = "/api/datalink/pacjurisdiction/edit/";
    public String resourceDeleteSinglePACJurisdiction = "/api/datalink/pacjurisdiction/delete/";

    // GRAPIServices.PACCDataLink PACElection
    public String resourceGetListOfPACElections = "/api/datalink/pacelection/getall";
    public String resourceGetSinglePACElection = "/api/datalink/pacelection/get/";
    public String resourceAddSinglePACElection = "/api/datalink/pacelection/add";
    public String resourceEditPACElection = "/api/datalink/pacelection/edit/";
    public String resourceDeleteSinglePACElection = "/api/datalink/pacelection/delete/";


}

