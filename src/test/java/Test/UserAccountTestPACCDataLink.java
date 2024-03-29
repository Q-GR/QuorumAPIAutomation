package Test;

import Services.BaseEndpoint;
import Services.PACCDataLinkEndpoint;
import Utils.UtilityFile;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class UserAccountTestPACCDataLink extends PACCDataLinkEndpoint {

    private static Logger log = UtilityFile.getLogger(UtilityFile.class);
    LoginTestGRAPIServices login = new LoginTestGRAPIServices();
    BaseEndpoint b = new BaseEndpoint();
    Response response;
    String userAccountID = "UserAccountID";

    String bearerTokenGRAPIServices = login.generateAccessTokenGRAPIServices();

    String addUserAccountJson = System.getProperty("user.dir") + "/src/test/resources/JsonData/AddNewUserAccounts.json";
    String deleteUserAccountJson = System.getProperty("user.dir") + "/src/test/resources/JsonData/DeleteUserAccount.json";
    String updateUserAccountJson = System.getProperty("user.dir") + "/src/test/resources/JsonData/UpdateUserAccount.json";
    String getPACCUserAccountJson = System.getProperty("user.dir") + "/src/test/resources/JsonData/GetPACCUserAccount.json";

    int updateUserAccountId = getQueryParamFromJsonFile(updateUserAccountJson,userAccountID);
    int deleteUserAccountId = getQueryParamFromJsonFile(deleteUserAccountJson,userAccountID);
    int getPACCUserAccountId = getQueryParamFromJsonFile(getPACCUserAccountJson,userAccountID);

    public UserAccountTestPACCDataLink() throws IOException, ParseException {
    }

    @Test(groups ={"PACCDataLink"})
    public void getPACCUserAccounts() throws IOException, ParseException {

        response = given().spec(requestSpecification()).header("Authorization", "Bearer " + bearerTokenGRAPIServices)
                .when().get(b.resourcePACCUserAccounts)
                .then().spec(responseSpecificationForStatusCode()).extract().response();

        log.info("Request hit successfully and response is received for getting list of User Accounts.");
        log.info("User Accounts ID extracted from response are " + getJsonPath(response, userAccountID));

        log.info(response.asPrettyString());
        log.info("Response json converted to String successfully.");

        log.info("Status code is " + response.getStatusCode());
    }

    @Test(groups ={"PACCDataLink"})
    public void getPACCUserAccount() throws IOException, ParseException {

        response = given().spec(requestSpecification()).header("Authorization", "Bearer " + bearerTokenGRAPIServices)
                .when().get(b.resourcePACCUserAccount+getPACCUserAccountId)
                .then().spec(responseSpecificationForStatusCode()).extract().response();

        log.info("Request hit successfully and response is received for getting PACC User Account.");
        log.info("User Account ID extracted from response is "+ getJsonPath(response, userAccountID));

        log.info(response.asPrettyString());
        log.info("Response json converted to String successfully.");

        log.info("Status code is " + response.getStatusCode());
    }

    @Test(groups ={"PACCDataLink"})
    public void addNewUserAccounts() throws IOException, ParseException {

        response = given().spec(requestSpecification()).header("Authorization", "Bearer " + bearerTokenGRAPIServices)
                .body(Files.readAllBytes(Paths.get(addUserAccountJson)))
                .when().post(b.resourceAddNewUserAccount)
                .then().spec(responseSpecificationForStatusCode()).spec(responseSpecificationForID(userAccountID)).extract().response();

        log.info("Request hit successfully and response is received for adding new User Accounts.");
        log.info("The added User Account ID is " + getJsonPath(response, userAccountID));

        log.info(response.asPrettyString());
        log.info("Response json converted to String successfully.");

        log.info("Status code is " + response.getStatusCode());
    }

//    @Test(groups ={"PACCDataLink"})
//    public void deleteUserAccounts() throws IOException, ParseException {
//
//        response = given().spec(requestSpecification()).header("Authorization", "Bearer " + bearerTokenGRAPIServices)
//                .when().delete(b.resourceDeleteUserAccount+deleteUserAccountId)
//                .then().spec(responseSpecificationForStatusCode()).extract().response();
//
//        log.info("Request hit successfully and response is received for deleting user account.");
//        log.info("The deleted user account ID is " + getJsonPath(response, userAccountID));
//
//        log.info(response.asPrettyString());
//        log.info("Response json converted to String successfully.");
//
//        log.info("Status code is " + response.getStatusCode());
//    }

    @Test(groups ={"PACCDataLink"})
    public void updatePACCUserAccount() throws IOException, ParseException {

        response = given().spec(requestSpecification()).header("Authorization", "Bearer " + bearerTokenGRAPIServices)
                .body(extractJsonToBePatched(updateUserAccountJson))
                .when().patch(b.resourceUpdateUserAccount+updateUserAccountId)
                .then().spec(responseSpecificationForStatusCode()).extract().response();

        log.info("Request hit successfully and response is received for updating User Account.");
        log.info("The updated User Account ID is " + getJsonPath(response, userAccountID));

        log.info(response.asPrettyString());
        log.info("Response json converted to String successfully.");

        log.info("Status code is " + response.getStatusCode());
    }
}
