package hands.on.testkube;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RemoteKeycloakTest {

    @Test
    void testRemoteKeycloak() {
        given().baseUri("https://keycloak.192.168.39.223.nip.io").port(443)
                .when().get("")
                        .then().statusCode(200);
    }
}
