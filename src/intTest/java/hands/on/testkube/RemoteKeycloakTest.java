package hands.on.testkube;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RemoteKeycloakTest {

    @Test
    void testRemoteKeycloak() {
        given().baseUri("http://keycloak.192.168.39.223.nip.io")
                .when().get("")
                        .then().statusCode(200);
    }
}
